package Ejercicio2;

public class CuartosMain {
    
    public static void main(String[] args) {
        Cuartos c = new Cuartos(7, 8, 9); /*Número en cada cuarto respectivamente
                                            como parámetros.*/
        int[] Numeros = new int[3];
        for(int i=0;i<3;i++){
            c.Entrar();
            Numeros[i]=NumeroBool.toInt(c.EvaluarCuarto());
            c.Salir();
            if(i!=2)
                c.Siguiente();
        }
        System.out.println(Numeros[0]+""+Numeros[1]+""+Numeros[2]);
    }
    
}
