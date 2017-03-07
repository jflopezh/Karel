package Ejercicio5B;

import becker.robots.*;

public class Escenario {
    private final City Ciudad;
    private final Robot Karel;
    private final Wall[] Paredes;
    private final Thing[] Cosas;
    
    public Escenario(){
        Ciudad = new City(11, 13);
        Ciudad.setFrameTitle("Ejercicio 5B");
        Ciudad.showThingCounts(true);
        Karel = new Robot(Ciudad, 9, 1, Direction.NORTH);
        Paredes = new Wall[38];
        int[][] c = new int[(int)(Math.random() * 16)+5][2];
        for(int[] c1: c){
            c1[0] = (int)(Math.random() * 5)+4;
            c1[1] = (int)(Math.random() * 5)+1;
        }
        Cosas = new Thing[c.length];
        int x = 0;
        for(int i=1;i<9;i++)
            for(int j=1;j<12;j++){
                if((i==1&&(j>6&&j<12))||(i==4&&j<6)){
                    Paredes[x] = new Wall(Ciudad, i, j, Direction.NORTH);
                    x++;
                }
                if((i==5&&(j>7&&j<12))||(i==8&&(j>1&&j<6))){
                    Paredes[x] = new Wall(Ciudad, i, j, Direction.SOUTH);
                    x++;
                }
                if((j==5&&(i>3&&i<9))||(j==11&&i<6)){
                    Paredes[x] = new Wall(Ciudad, i, j, Direction.EAST);
                    x++;
                }
                if((j==1&&(i>3&&i<9))||(j==7&&i<6)){
                    Paredes[x] = new Wall(Ciudad, i, j, Direction.WEST);
                    x++;
                }
            }
        x = 0;
        for (int[] c1 : c){
            Cosas[x] = new Thing(Ciudad, c1[0], c1[1]);
            x++;
        }
    }
    
    public Escenario(int[][] c){
        Ciudad = new City(11, 13);
        Ciudad.setFrameTitle("Ejercicio 5B");
        Ciudad.showThingCounts(true);
        Karel = new Robot(Ciudad, 9, 1, Direction.NORTH);
        Paredes = new Wall[38];
        Cosas = new Thing[c.length];
        int x = 0;
        for(int i=1;i<9;i++)
            for(int j=1;j<12;j++){
                if((i==1&&(j>6&&j<12))||(i==4&&j<6)){
                    Paredes[x] = new Wall(Ciudad, i, j, Direction.NORTH);
                    x++;
                }
                if((i==5&&(j>7&&j<12))||(i==8&&(j>1&&j<6))){
                    Paredes[x] = new Wall(Ciudad, i, j, Direction.SOUTH);
                    x++;
                }
                if((j==5&&(i>3&&i<9))||(j==11&&i<6)){
                    Paredes[x] = new Wall(Ciudad, i, j, Direction.EAST);
                    x++;
                }
                if((j==1&&(i>3&&i<9))||(j==7&&i<6)){
                    Paredes[x] = new Wall(Ciudad, i, j, Direction.WEST);
                    x++;
                }
            }
        x = 0;
        for (int[] c1 : c){
            Cosas[x] = new Thing(Ciudad, c1[1], c1[0]);
            x++;
        }            
    }
    
    public int[][] RecogerCosas(){
        int[][] c = new int[20][2];
        int x = 0;
        for(int i=0;i<25;i++){
            Karel.move();
            while(Karel.canPickThing()){                
                Karel.pickThing();
                c[x][0] = Karel.getAvenue()+6;
                c[x][1] = Karel.getStreet()-3;
                x++;
            }
            if(i==0||i==9||i==10||i==19||i==20||i==24)
                for(int j=0;j<3;j++)
                    Karel.turnLeft();
            if(i==4||i==5||i==14||i==15)
                Karel.turnLeft();
        }
        return c;
    }
    
    public void Salir(){
        for(int i=0;i<10;i++){
            Karel.move();
            if(i==3)
                for(int j=0;j<3;j++)
                    Karel.turnLeft();
            if(i==7||i==8)
                Karel.turnLeft();
        }
    }
    
    public void Siguiente(){
        for(int i=0;i<8;i++){
            Karel.move();
            if(i==4)
                Karel.turnLeft();
        }
    }
    
    public void PonerCosas(int[][] c){
        int x = 0;
        for(int i=0;i<25;i++){
            Karel.move();
            while(Karel.getAvenue()==c[x][0]&&Karel.getStreet()==c[x][1]){
                Karel.putThing();
                if(x<c.length-1)
                   x++;
            }
            if(i==0||i==9||i==10||i==19||i==20||i==24)
                for(int j=0;j<3;j++)
                    Karel.turnLeft();
            if(i==4||i==5||i==14||i==15)
                Karel.turnLeft();
        }
    }
}
