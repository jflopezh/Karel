package Ejercicio7;

import becker.robots.*;

public class LimpiarCuartos {

    public static void main(String[] args) {
        City cd = new City(11, 11);
        cd.setFrameTitle("Ejercicio 7");
        Robot r = new Robot(cd, 9, 5, Direction.NORTH);
        Cuartos c = new Cuartos(cd, r);
        c.Recoger();
    }
    
}
