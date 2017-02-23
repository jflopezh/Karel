package becker;
import becker.robots.*;
import jdk.nashorn.internal.ir.ForNode;

public class Futbol {
    private Robot joe;
    private City unal;
    private Thing balon;
    
    
    public Futbol(){
        this.unal = new City(10, 10);
        this.balon = new Thing(this.unal, 9, 9);
        this.joe = new Robot(this.unal, 9, 9, Direction.WEST);        
    }
        
    public void advance(){
        this.joe.pickThing();
        this.joe.move();
        this.joe.move();
        this.joe.putThing();
    }
    
    public void advanceLeft(){
        this.joe.pickThing();
        this.joe.move();
        this.joe.move();
        this.joe.turnLeft();
        this.joe.move();
        for(int i=0;i<3;i++)
            this.joe.turnLeft();
        this.joe.putThing();
    }
    
    public void advanceRight(){
        this.joe.pickThing();
        this.joe.move();
        this.joe.move();
        for(int i=0;i<3;i++)
            this.joe.turnLeft();
        this.joe.move();
        this.joe.turnLeft();
        this.joe.putThing();
    }
    
}
