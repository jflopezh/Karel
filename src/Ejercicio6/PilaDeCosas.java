package Ejercicio6;

import becker.robots.*;

public class PilaDeCosas {
    private final City Ciudad;
    private final Robot Karel;
    private final Thing[] Cosas;
    
    public PilaDeCosas(int[] c){
        int Mayor = 0;
        int Sumatoria = 0;
        for(int i=0;i<c.length;i++) {
            if(c[i]>Mayor)
                Mayor = c[i];
            Sumatoria += c[i];
        }
        Ciudad = new City(Mayor+2, c.length+2);
        Ciudad.setFrameTitle("Ejercicio 6");
        Karel = new Robot(Ciudad, Mayor, 1, Direction.NORTH);
        Cosas = new Thing[Sumatoria];
        int x = 0;
        for(int i=0;i<c.length;i++)
            for(int j=0;j<c[i];j++){
                Cosas[x] = new Thing(Ciudad, Mayor-j, i+1);
                x++;
            }
    }
    
    public int ContarColumnas(){
        int x = 0;
        for(int i=0;i<8;i++){
            Karel.turnLeft();
            if(i==2){
                while(Karel.canPickThing()){
                    x++;
                    Karel.move();
                }
            }
            if(i==4)
                for(int j=0;j<x;j++)
                    Karel.move();
        }
        return x;
    }
    
    public int RecogerFila(int a){
        while(Karel.canPickThing()){
            Karel.pickThing();
            Karel.move();
        }
        Karel.turnLeft();
        Karel.turnLeft();
        int x = Karel.countThingsInBackpack()-a;
        for(int i=0;i<x;i++)
            Karel.move();
        return x;
    }
    
    public void Siguiente(){
        Karel.turnLeft();
        Karel.move();
        Karel.turnLeft();
    }
    
    public void Regresar(int r){
        for(int i=0;i<4;i++){
            Karel.turnLeft();
            if(i==0)
                for(int j=0;j<r;j++)
                    Karel.move();
        }        
    }
    
    public void Extender(int x){
        for(int i=0;i<x;i++){
            Karel.putThing();
            Karel.move();
        }
        Karel.turnLeft();
        Karel.turnLeft();
        for(int i=0;i<x;i++)
            Karel.move();
    }
}
