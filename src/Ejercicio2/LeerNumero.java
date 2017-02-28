package Ejercicio2;

import java.util.Scanner;

public class LeerNumero {
    
    public static void main(String[] args) {
        //1. Ingreso de datos para generar la situación inicial
        
        Scanner Lectura = new Scanner(System.in);
        int[] NumerosI = new int[3];
        for(int i=0;i<3;i++){
            System.out.print("Ingrese el número dentro del cuarto "+(i+1)+": ");
            NumerosI[i] = Lectura.nextInt();
        }
        Cuartos c = new Cuartos(NumerosI[0], NumerosI[1], NumerosI[2]); 
        
        //2. Lectura de los números por parte del robot
        
        /* En si lo que se hace es evaluar si se puede recoger una cosa en los 7
        puntos clave de cada cuarto para simular un led 7 segmentos, si no se
        puede recoger en un punto clave quiere decir que ese segmento está 
        apagado. De esta manera se obtiene el número en función de 7 booleanos y
        al final con ayuda de una libreria propia se obtiene el número en entero.
        */
        
        int[] Numeros = new int[3];
        for(int i=0;i<3;i++){
            c.Entrar();
            Numeros[i]=NumeroBool.toInt(c.EvaluarCuarto());
            c.Salir();
            if(i!=2)
                c.Siguiente();
        }
        
        //3. Impresión del resultado
        
        System.out.println(""+Numeros[0]+Numeros[1]+Numeros[2]);
    }
    
}
