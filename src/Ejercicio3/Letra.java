package Ejercicio3;

import becker.robots.*;

public class Letra {
    private final Robot Karel;
    private final int Posicion;
    private final char Letra;
    
    public Letra(int p, char l, City c){
        Posicion = p;
        Karel = new Robot(c, 5, (Posicion*4)-1, Direction.WEST, 12);
        Letra = l;
    }
    
    public void Dibujar(){
        switch(Letra){
            case 'H':
                for(int i=0;i<3;i++)
                    Karel.turnLeft();
                Karel.putThing();
                for(int i=0;i<8;i++){
                    Karel.move();
                    Karel.putThing();
                    if(i==3){
                        Karel.turnLeft();
                        Karel.move();
                        Karel.move();
                        Karel.turnLeft();
                        Karel.putThing();
                    }
                }
                for(int i=0;i<2;i++){
                    Karel.turnLeft();
                    Karel.move();
                }
                Karel.move();
                Karel.putThing();
                Karel.setTransparency(1);
                break;
            case 'E':
                Karel.putThing();
                for(int i=0;i<8;i++){
                    Karel.move();
                    Karel.putThing();
                    if(i==1||i==5)
                        for(int j=0;j<3;j++)
                            Karel.turnLeft();
                }
                for(int i=0;i<3;i++)
                    Karel.turnLeft();
                for(int i=0;i<3;i++){
                    Karel.move();
                    if(i==1||i==2){
                        Karel.putThing();
                        for(int j=0;j<3;j++)
                            Karel.turnLeft();
                    }
                }
                Karel.setTransparency(1);
                break;
            case 'L':
                Karel.putThing();
                for(int i=0;i<6;i++){
                    Karel.move();
                    Karel.putThing();
                    if(i==1)
                        for(int j=0;j<3;j++)
                            Karel.turnLeft();
                }
                Karel.setTransparency(1);
                break;
            case 'O':
                for(int i=0;i<12;i++){
                    Karel.move();
                    Karel.putThing();
                    if(i==1||i==5||i==7)
                        for(int j=0;j<3;j++)
                            Karel.turnLeft();
                }
                Karel.setTransparency(1);
                break;
        }
    }
}
