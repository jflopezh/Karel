package Ejercicio2;

import java.util.Arrays;

public class NumeroBool {
    public static boolean[] CERO = {true, true, true, true, true, true, false};
    public static boolean[] UNO = {false, true, true, false, false, false, false};
    public static boolean[] DOS = {true, true, false, true, true, false, true};
    public static boolean[] TRES = {true, true, true, true, false, false, true};
    public static boolean[] CUATRO = {false, true, true, false, false, true, true};
    public static boolean[] CINCO = {true, false, true, true, false, true, true};
    public static boolean[] SEIS = {true, false, true, true, true, true, true};
    public static boolean[] SIETE = {true, true, true, false, false, false, false};
    public static boolean[] OCHO = {true, true, true, true, true, true, true};
    public static boolean[] NUEVE = {true, true, true, true, false, true, true};
    
    public static int toInt(boolean[] n){
        if(Arrays.equals(n, CERO))
            return 0;
        if(Arrays.equals(n, UNO))
            return 1;
        if(Arrays.equals(n, DOS))
            return 2;
        if(Arrays.equals(n, TRES))
            return 3;
        if(Arrays.equals(n, CUATRO))
            return 4;
        if(Arrays.equals(n, CINCO))
            return 5;
        if(Arrays.equals(n, SEIS))
            return 6;
        if(Arrays.equals(n, SIETE))
            return 7;
        if(Arrays.equals(n, OCHO))
            return 8;
        if(Arrays.equals(n, NUEVE))
            return 9;
        return 0;
    }
}
