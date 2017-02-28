package Ejercicio1;

import becker.robots.*;

public class Futbol {
    private final Robot Karel;
    private final City Ciudad;
    private final Thing Balon;
    private final Wall[] Paredes;
    
    public Futbol(){
        this.Paredes = new Wall[8];
        this.Ciudad = new City(5, 9);
        Ciudad.setFrameTitle("Ejecicio 1");
        this.Balon = new Thing(this.Ciudad, 3, 8);
        this.Karel = new Robot(this.Ciudad, 3, 8, Direction.WEST);
        int x = 0;
        for(int i=0;i<5;i++){
            if(i==2)
                continue;
            Paredes[x] = new Wall(Ciudad, i, 0, Direction.WEST);
            x++;
        }
        for(int i=0;i<5;i++){
            if(i==2)
                continue;
            Paredes[x] = new Wall(Ciudad, i, 8, Direction.EAST);
            x++;
        }
    }
        
    public void advance(){
        this.Karel.pickThing();
        this.Karel.move();
        this.Karel.move();
        this.Karel.putThing();
    }
    
    public void advanceLeft(){
        this.Karel.pickThing();
        this.Karel.move();
        this.Karel.move();
        this.Karel.turnLeft();
        this.Karel.move();
        for(int i=0;i<3;i++)
            this.Karel.turnLeft();
        this.Karel.putThing();
    }
    
    public void advanceRight(){
        this.Karel.pickThing();
        this.Karel.move();
        this.Karel.move();
        for(int i=0;i<3;i++)
            this.Karel.turnLeft();
        this.Karel.move();
        this.Karel.turnLeft();
        this.Karel.putThing();
    }
    
}
