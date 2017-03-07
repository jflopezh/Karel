package Ejercicio5A;

import becker.robots.*;

public class CorrerLaberinto {
    
    public static void main(String[] args) {
        //Solución del plateamiento propuesto.
        
        Laberinto l = new Laberinto();
        Robot r = l.getRobot();
        for(int i=0;i<20;i++){
            r.move();
            if(i==5||i==12||i==17)
                r.pickThing();
            if(i==0||i==4||i==7||i==8||i==10||i==13||i==14||i==16)
                for(int j=0;j<3;j++)
                    r.turnLeft();
            if(i==1||i==3||i==6||i==11||i==15||i==17)
                r.turnLeft();
            if(i==5||i==12)
                for(int j=0;j<2;j++)
                    r.turnLeft();
        }
    }
    
}
