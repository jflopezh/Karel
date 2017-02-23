package becker;

public class Numero {
    public boolean[] CERO = new boolean[7];
    public boolean[] UNO = new boolean[7];
    public boolean[] DOS = new boolean[7];
    public boolean[] TRES = new boolean[7];
    public boolean[] CUATRO = new boolean[7];
    public boolean[] CINCO = new boolean[7];
    public boolean[] SEIS = new boolean[7];
    public boolean[] SIETE = new boolean[7];
    public boolean[] OCHO = new boolean[7];
    public boolean[] NUEVE = new boolean[7];
    
    
    public Numero(){
        CERO[0]=true;CERO[1]=true;CERO[2]=true;CERO[3]=true;CERO[4]=true;CERO[5]=true;CERO[6]=false;
        UNO[0]=false;UNO[1]=true;UNO[2]=true;UNO[3]=false;UNO[4]=false;UNO[5]=false;UNO[6]=false;
        DOS[0]=true;DOS[1]=true;DOS[2]=false;DOS[3]=true;DOS[4]=true;DOS[5]=false;DOS[6]=true;
        TRES[0]=true;TRES[1]=true;TRES[2]=true;TRES[3]=true;TRES[4]=false;TRES[5]=false;TRES[6]=true;
        CUATRO[0]=false;CUATRO[1]=true;CUATRO[2]=true;CUATRO[3]=false;CUATRO[4]=false;CUATRO[5]=true;CUATRO[6]=true;
        CINCO[0]=true;CINCO[1]=false;CINCO[2]=true;CINCO[3]=true;CINCO[4]=false;CINCO[5]=true;CINCO[6]=true;
        SEIS[0]=true;SEIS[1]=false;SEIS[2]=true;SEIS[3]=true;SEIS[4]=true;SEIS[5]=true;SEIS[6]=true;
        SIETE[0]=true;SIETE[1]=true;SIETE[2]=true;SIETE[3]=false;SIETE[4]=false;SIETE[5]=false;SIETE[6]=false;
        for(int i=0;i<7;i++)OCHO[i]=true;
        NUEVE[0]=true;NUEVE[1]=true;NUEVE[2]=true;NUEVE[3]=true;NUEVE[4]=false;NUEVE[5]=true;NUEVE[6]=true;
    }
    
    public int toInt(boolean[] n){
        if(n==CERO)
            return 0;
        if(n==UNO)
            return 1;
        if(n==DOS)
            return 2;
        if(n==TRES)
            return 3;
        if(n==CUATRO)
            return 4;
        if(n==CINCO)
            return 5;
        if(n==SEIS)
            return 6;
        if(n==SIETE)
            return 7;
        if(n==OCHO)
            return 8;
        if(n==NUEVE)
            return 9;
        return 0;
    }
}
