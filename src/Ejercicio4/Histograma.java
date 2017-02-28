package Ejercicio4;

import becker.robots.*;

public class Histograma {
    private final City Ciudad;
    private final Robot Karel;
    private final Thing[] Datos;
    
    public Histograma(int[] c){
        int Mayor = 0;
        int Sumatoria = 0;
        for(int i=0;i<c.length;i++) {
            if(c[i]>Mayor)
                Mayor = c[i];
            Sumatoria += c[i];
        }
        Ciudad = new City(c.length+2, Mayor+2);
        Ciudad.setFrameTitle("Ejercicio 4");
        Ciudad.showThingCounts(true);
        Karel = new Robot(Ciudad, 0, 1, Direction.SOUTH);
        Datos = new Thing[Sumatoria];
        int x = 0;
        for(int i=0;i<c.length;i++)
            for(int j=0;j<c[i];j++){
                Datos[x] = new Thing(Ciudad, i+1, 1);
                x++;
            }
    }
    
    public int AnalizarInterseccion(){
        int x;
        while(Karel.canPickThing())
            Karel.pickThing();
        x = Karel.countThingsInBackpack();
        for(int i=0;i<x;i++)
            Karel.putThing();
        return x;
    }
    
    public boolean HayDato(){
        return Karel.canPickThing();
    }
    
    public void Siguiente(){
        Karel.move();
    }
    
    public void Regresar(int x){
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++)
                Karel.turnLeft();
            if(i==0)
                for(int j=0;j<x;j++)
                    Karel.move();
        }
    }
    
    public void Extender(int x){
        for(int i=0;i<4;i++){
            Karel.turnLeft();
            if(i==0){
                for(int j=0;j<x-1;j++)
                    Karel.pickThing();
                for(int j=0;j<x-1;j++){
                    Karel.move();
                    Karel.putThing();
                }
            }
            if(i==2)
                for(int j=0;j<x-1;j++)
                    Karel.move();
        }
    }
    
    public void OcultarNumeros(){
        Ciudad.showThingCounts(false);
    }
}
