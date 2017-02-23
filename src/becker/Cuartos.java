package becker;
import becker.robots.*;

public class Cuartos {
    private City c;
    private Robot r;
    private Thing[] Cosas;
    
    public Cuartos(){
        c = new City(11, 9);
        r = new Robot(c, 2, 6, Direction.NORTH);
        Cosas= new Thing[39];
        int x = 0;
        for(int i=1;i<4;i++){
            for(int j=1;j<6;j++){
                if(i==2&&(j>1&&j<5))
                    break;
                Cosas[x]=new Thing(c, i, j);
            }
        }
        for(int i=4;i<7;i++){
            for(int j=1;j<6;j++){
                if((i==6&&j==2)||(i==4&&j==4))
                    break;
                Cosas[x]=new Thing(c, i, j);
            }
        }
        for(int i=7;i<9;i++){
            for(int j=1;j<6;j++){
                if(i==2&&(j>1&&j<5))
                    break;
                Cosas[x]=new Thing(c, i, j);
            }
        }
    }
}
