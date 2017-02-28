package Ejercicio7;

import becker.robots.*;

public class Cuartos {
    private Thing[] Cosas;
    private Wall[] Paredes;
    private Robot Robot;
    
    public Cuartos(City c, Robot r){
        Robot = r;
        Cosas = new Thing[60];
        Paredes = new Wall[34];
        int x = 0;
        for(int i=1;i<10;i++)
            for(int j=1;j<10;j++){
                if(i==5||j==5||(i==8&&j==4)||((i==8||i==9)&&j==9)||(i==9&&j==8))
                    continue;
                Cosas[x] = new Thing(c, i, j);
                x++;
            }
        x=0;
        for(int i=1;i<10;i++)
            for(int j=1;j<10;j++){
                if(i==4&&j!=5){
                    Paredes[x] = new Wall(c, i, j, Direction.SOUTH);
                    x++;
                }
                if(i==6&&j!=5){
                    Paredes[x] = new Wall(c, i, j, Direction.NORTH);
                    x++;
                }
                if(j==4&&i!=5&&i!=8){
                    Paredes[x] = new Wall(c, i, j, Direction.EAST);
                    x++;
                }
                if(j==6&&i!=5){
                    Paredes[x] = new Wall(c, i, j, Direction.WEST);
                    x++;
                }
            }
        Paredes[31] = new Wall(c, 8, 4, Direction.NORTH);
        Paredes[32] = new Wall(c, 8, 4, Direction.WEST);
        Paredes[33] = new Wall(c, 8, 4, Direction.SOUTH);
    }
    
    public void Recoger(){
        for(int i=1;i<133;i++){
            Robot.move();
            if(Robot.canPickThing())
                Robot.pickThing();
            if(i==9||i==13||i==14||i==21||i==22||i==30||i==31||i==41||i==45||i==46||i==53||
               i==54||i==62||i==63||i==73||i==77||i==78||i==85||i==86||i==94||i==95||i==105
               ||i==109||i==110||i==117||i==118||i==124||i==126||i==128||i==129||i==131)
                Robot.turnLeft();
            if(i==17||i==18||i==25||i==26||i==49||i==50||i==57||i==58||i==81||i==82||i==89||
               i==90||i==113||i==114||i==121||i==122||i==123||i==127)
                for(int j=0;j<3;j++)
                    Robot.turnLeft();   
        }
    }
}
