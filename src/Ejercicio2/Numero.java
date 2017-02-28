package Ejercicio2;

public class Numero {
    private final int Valor;
    private final int Cuarto; //1, 2 o 3
    private final int n;
    
    public Numero(int v, int c){
        Valor = v;
        Cuarto = c;
        n = (3*Cuarto)-2;
    }
    
    public boolean noDibujar(int i, int j){
        switch(Valor){
            case 0:
                if((j==n+1)&&(i>1&&i<5))
                    return true;
                break;
            case 1:
                if(j!=n+2)
                    return true;
                break;
            case 2:
                if(((j==n||j==n+1)&&i==2)||((j==n+1||j==n+2)&&i==4))
                    return true;
                break;
            case 3:
                if((j==n||j==n+1)&&(i==2||i==4))
                    return true;
                break;
            case 4:
                if((j==n+1&&i<3)||((j==n||j==n+1)&&(i==4||i==5)))
                    return true;
                break;
            case 5:
                if(((j==n+1||j==n+2)&&i==2)||((j==n||j==n+1)&&i==4))
                    return true;
                break;
            case 6:
                if((j==n+1&&i==4)||((j==n+1||j==n+2)&&i==2))
                    return true;
                break;
            case 7:
                if(j!=n+2&&i>1)
                    return true;
                break;
            case 8:
                if(j==n+1&&(i==2||i==4))
                    return true;
                break;
            case 9:
                if((j==n+1&&i==2)||((j==n||j==n+1)&&i==4))
                    return true;
                break;                   
        }
        return false;
    }
}
