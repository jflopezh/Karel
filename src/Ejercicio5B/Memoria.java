package Ejercicio5B;

import java.util.Scanner;

public class Memoria {

    public static void main(String[] args) {
        /* 1. Ingreso de datos para generar aleatoriamente o manualmente la 
        situación inicial, para ello se crearon 2 constructores, uno por defecto
        que genera aleatoriamente la situación inicial, y otro con parametro para
        la posición de las cosas dentro del primer cuarto.*/

        Scanner Lectura = new Scanner(System.in);
        System.out.println("Generar aleatorimente las cosas a recoger: \t 0 \n"
                         + "Generar manualmente las cosas a recoger: \t 1 \n");
        Escenario e;
        int Decision = Lectura.nextInt();
        System.out.println();
        if(Decision == 0){
            e = new Escenario();
        } else {
            System.out.print("Ingrese la cantidad de cosas a recoger (Maximo 20): ");
            int[][] Cosas = new int[Lectura.nextInt()][2];
            System.out.println();
            String[] Coor;
            for(int i=0;i<Cosas.length;i++){
                System.out.print("Ingrese la interseccion en la cual colocar la cosa "
                                +(i+1)+" (Avenida,Calle): ");
                Coor = Lectura.next().split(",");
                Cosas[i][0] = Integer.parseInt(Coor[0]);
                Cosas[i][1] = Integer.parseInt(Coor[1]);
            }
            e = new Escenario(Cosas);            
        }
        
        //2. Solución de la situación inicial
        
        //Arreglo que guarda las coordenadas de las cosas recogidas
        int[][] LecCosas = e.RecogerCosas();
        
        e.Salir();
        e.Siguiente();
        e.PonerCosas(LecCosas);
        e.Salir();
    }
    
}
