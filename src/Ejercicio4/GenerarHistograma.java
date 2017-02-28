package Ejercicio4;

import java.util.Scanner;

public class GenerarHistograma {

    public static void main(String[] args) {
        //1. Ingreso de datos para generar la situación inicial
        
        Scanner Lectura = new Scanner(System.in);
        System.out.print("Ingrese el numero de filas del histograma: ");
        int[] Datos = new int[Lectura.nextInt()];
        System.out.println();
        for(int i=0;i<Datos.length;i++){
            System.out.print("Ingrese la cantidad de datos en la fila "+(i+1)+": ");
            Datos[i] = Lectura.nextInt();
        }
        Histograma h = new Histograma(Datos);
        
        //2. Lectura de la situación inicial por parte del robot        
        //2.1 Conteo de filas
        
        int Filas = 0;
        h.Siguiente();
        while(h.HayDato()){
            Filas++;
            h.Siguiente();
        }
        h.Regresar(Filas+1); //Volviendo a la posición inicial
        
        //2.2 Conteo de datos en cada fila
        
        int[] DatosR = new int[Filas]; //
        
        for(int i=0;i<Datos.length;i++){
            h.Siguiente();
            DatosR[i] = h.AnalizarInterseccion();
        }
        
        h.Regresar(Filas); //Volviendo a la posición inicial
        h.OcultarNumeros();
        
        //3. Creación del histograma por parte del robot
        
        for(int i=0;i<DatosR.length;i++){
            h.Siguiente();
            h.Extender(DatosR[i]);
        }
        h.Siguiente();
    }
    
}
