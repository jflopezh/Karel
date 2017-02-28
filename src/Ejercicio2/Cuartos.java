package Ejercicio2;

import becker.robots.*;

public class Cuartos {
    private City Ciudad;
    private Robot Karel;
    private Thing[] Cosas;
    private Wall[] Paredes;
    private Numero Num1;
    private Numero Num2;
    private Numero Num3;
    
    public Cuartos(int n1, int n2, int n3){
        Ciudad = new City(10, 12);
        Ciudad.setFrameTitle("Ejercicio 2");
        Karel = new Robot(Ciudad, 6, 2, Direction.NORTH);
        Num1 = new Numero(n1, 1);
        Num2 = new Numero(n2, 2);
        Num3 = new Numero(n3, 3);
        Cosas = new Thing[39];
        Paredes = new Wall[35];
        int x = 0;
        for(int i=1;i<6;i++){
            for(int j=1;j<10;j++){
                if(j<4)
                    if(Num1.noDibujar(i, j))
                        continue;
                if(j>=4&&j<7)
                    if(Num2.noDibujar(i, j))
                        continue;
                if(j>=7)
                    if(Num3.noDibujar(i, j))
                        continue;
                Cosas[x]=new Thing(Ciudad, i, j);
                x++;
            }
        }
        int y = 0;
        for(int i=1;i<6;i++){
            for(int j=1;j<10;j++){
                if(i==1){
                    Paredes[y]=new Wall(Ciudad, i, j, Direction.NORTH);
                    y++;
                }
                if(j==1||j==4||j==7){
                    Paredes[y]=new Wall(Ciudad, i, j, Direction.WEST);
                    y++;
                }
                if(i==5&&j!=2&&j!=5&&j!=8){
                    Paredes[y]=new Wall(Ciudad, i, j, Direction.SOUTH);
                    y++;
                }
                if(j==9){
                    Paredes[y]=new Wall(Ciudad, i, j, Direction.EAST);
                    y++;
                }
            }
        }
    }
    
    public void Entrar(){
        for(int i=0;i<3;i++)
            Karel.move();
        Karel.turnLeft();
    }
    
    public boolean[] EvaluarCuarto(){
        boolean[] x = new boolean[7];
        x[6]=Karel.canPickThing();
        Karel.move();
        for(int i=0;i<3;i++)
            Karel.turnLeft();
        Karel.move();
        x[5]=Karel.canPickThing();
        Karel.turnLeft();
        Karel.turnLeft();
        Karel.move();
        Karel.move();
        for(int i=4;i>0;i--){
            x[i]=Karel.canPickThing();
            Karel.move();
            if(i!=2)
                Karel.turnLeft();
            Karel.move();
        }
        x[0]=Karel.canPickThing();
        return x;
    }
    
    public void Salir(){
        Karel.turnLeft();
        for(int i=0;i<5;i++)
            Karel.move();
    }
    
    public void Siguiente(){
        Karel.turnLeft();
        for(int i=0;i<3;i++)
            Karel.move();
        Karel.turnLeft();
    }
}
