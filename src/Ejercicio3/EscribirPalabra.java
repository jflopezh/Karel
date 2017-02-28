package Ejercicio3;

import becker.robots.City;

public class EscribirPalabra {
    
    public static void main(String[] args) {
        City c = new City(7, 21);
        c.setFrameTitle("Ejercicio 3");
        Letra[] Letras = {new Letra(1, 'H', c), new Letra(2, 'E', c), new Letra(3, 'L', c), 
                          new Letra(4, 'L', c), new Letra(5, 'O', c)};
        for(int i=0;i<5;i++)
            Letras[i].Dibujar();
    }
    
}
