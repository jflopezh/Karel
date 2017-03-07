package Ejercicio5A;

import becker.robots.*;

public class Laberinto {
    private final Robot Karel;
    private final City Ciudad;
    private final Wall[] Paredes;
    private final Thing[] Nuggets;
    
    public Laberinto(){
        Ciudad = new City(9, 10);
        Ciudad.setFrameTitle("Ejercicio 5A");
        Karel = new Robot(Ciudad, 6, 7, Direction.NORTH);
        Paredes = new Wall[50];
        Nuggets = new Thing[3];
        int x = 0;
        for(int i=0;i<9;i++)
            for(int j=0;j<10;j++){
                if((i==1&&(j>2&&j<7))||(i==2&&(j>3&&j<6))||(i==j-5&&(j==7||j==8))||
                (i==5-j&&(j==1||j==2))||(i==7-j&&(j==2||j==3))||(i==j-3&&(j==6||j==7))){
                    Paredes[x] = new Wall(Ciudad, i, j, Direction.NORTH);
                    x++;
                }
                if((j==1&&(i==4||i==5))||(j==3&&(i==1||i==2||i==4||i==5))||
                (j==2&&(i==3||i==6))||(j==4&&(i==2||i==3))||(j==7&&(i==5||i==6))){
                    Paredes[x] = new Wall(Ciudad, i, j, Direction.WEST);
                    x++;
                }
                if((j==3&&(i==5||i==6))||(j==8&&(i>2&&i<6))||(j==4&&(i==3||i==4||i==6))
                ||(j==5&&(i==2||i==5))||(j==7&&(i==2||i==6))||(j==6&&(i==3||i==1))){
                    Paredes[x] = new Wall(Ciudad, i, j, Direction.EAST);
                    x++;
                }
                if((i==3&&j==5)||(i==4&&(j==4||j==6||j==7))||(i==5&&(j==1||j==5||j==8))
                ||(i==6&&(j==2||j==3||j==7))){
                    Paredes[x] = new Wall(Ciudad, i, j, Direction.SOUTH);
                    x++;
                }
            }
        Nuggets[0] = new Thing(Ciudad, 2, 7);
        Nuggets[1] = new Thing(Ciudad, 3, 5);
        Nuggets[2] = new Thing(Ciudad, 5, 4);
    }
    
    public Robot getRobot(){
        return Karel;
    }
}
