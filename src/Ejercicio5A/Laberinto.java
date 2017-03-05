package Ejercicio5A;

import becker.robots.*;

public class Laberinto {
    private final Robot Robot;
    private final City Ciudad;
    private Wall[] Paredes;
    private Thing[] Nuggets;
    
    public Laberinto(){
        Ciudad = new City(9, 10);
        Robot = new Robot(Ciudad, 6, 7, Direction.NORTH);
        Paredes = new Wall[50];
        Nuggets = new Thing[4];
        int x = 0;
        for(int i=0;i<9;i++)
            for(int j=0;j<10;j++){
                if((i==1&&(j>2&&j<7))||(i==2&&(j>3&&j<6))||(i==j-5&&(j==7||j==8))||(i==5-j&&(j==1||j==2)))
            }
    }
}
