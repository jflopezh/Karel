package Ejercicio6;

import java.util.Scanner;

public class OrdenarPilaDeCosas {

    public static void main(String[] args) {
        //1. Ingreso de datos para generar la situación inicial
        
        Scanner Lectura = new Scanner(System.in);
        System.out.print("Ingrese el numero de columnas de la pila de cosas (Entre 1 y 10): ");
        int[] Cantidades = new int[Lectura.nextInt()];
        System.out.println();
        for(int i=0;i<Cantidades.length;i++){
            System.out.print("Ingrese la cantidad de cosas de la coloumna "+(i+1)+" (Entre 1 y 10): ");
            Cantidades[i] = Lectura.nextInt();
        }
        
        PilaDeCosas p = new PilaDeCosas(Cantidades);
        
        //2 Lectura de la situación inicial por parte del robot        
        //2.1 Conteo de columnas
        
        int x = p.ContarColumnas();
        
        //2.2 Conteo y recolecta de cosas en cada columna
        
        int[] CantXColum = new int[x];
        int a = 0;
        
        for(int i=0;i<x;i++){
            CantXColum[i] = p.RecogerFila(a);
            p.Siguiente();
            a += CantXColum[i];
        }
        
        p.Regresar(x); //Regreso a la posición inicial
        
        //3. Ordenamiento de la pila de cosas
        //3.1 Ordenamiento del vector resultante de menor a mayor
        
        for(int i=0;i<x;i++){
            int c;
            for(int j=0;j<x-i;j++){
                if(CantXColum[j]==CantXColum[CantXColum.length-1])
                    break;
                if(CantXColum[j]>CantXColum[j+1]){
                    c = CantXColum[j+1];
                    CantXColum[j+1] = CantXColum[j];
                    CantXColum[j] = c;
                }
            }
        }
        
        //3.2 Extensión de cada columna proyectando la pila ordenada
        
        for(int i=0;i<x;i++){
            p.Extender(CantXColum[i]);
            p.Siguiente();
        }
    }
    
}
