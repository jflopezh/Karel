package Ejercicio2;
import becker.robots.*;

public class Cuartos {
    private City c;
    private Robot r;
    private Thing[] Cosas;
    private Wall[] Paredes;
    private Numero Num1;
    private Numero Num2;
    private Numero Num3;
    
    public Cuartos(int n1, int n2, int n3){
        c = new City(10, 12);
        r = new Robot(c, 6, 2, Direction.NORTH);
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
                Cosas[x]=new Thing(c, i, j);
                x++;
            }
        }
        int y = 0;
        for(int i=1;i<6;i++){
            for(int j=1;j<10;j++){
                if(i==1){
                    Paredes[y]=new Wall(c, i, j, Direction.NORTH);
                    y++;
                }
                if(j==1||j==4||j==7){
                    Paredes[y]=new Wall(c, i, j, Direction.WEST);
                    y++;
                }
                if(i==5&&j!=2&&j!=5&&j!=8){
                    Paredes[y]=new Wall(c, i, j, Direction.SOUTH);
                    y++;
                }
                if(j==9){
                    Paredes[y]=new Wall(c, i, j, Direction.EAST);
                    y++;
                }
            }
        }
    }
    
    public void Entrar(){
        for(int i=0;i<3;i++)
            r.move();
        r.turnLeft();
    }
    
    public boolean[] EvaluarCuarto(){
        boolean[] x = new boolean[7];
        x[6]=r.canPickThing();
        r.move();
        for(int i=0;i<3;i++)
            r.turnLeft();
        r.move();
        x[5]=r.canPickThing();
        r.turnLeft();
        r.turnLeft();
        r.move();
        r.move();
        for(int i=4;i>0;i--){
            x[i]=r.canPickThing();
            r.move();
            if(i!=2)
                r.turnLeft();
            r.move();
        }
        x[0]=r.canPickThing();
        return x;
    }
    
    public void Salir(){
        r.turnLeft();
        for(int i=0;i<5;i++)
            r.move();
    }
    
    public void Siguiente(){
        r.turnLeft();
        for(int i=0;i<3;i++)
            r.move();
        r.turnLeft();
    }
}
