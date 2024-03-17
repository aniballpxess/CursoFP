package Ejercicios_23_12_05;

import java.util.Scanner;

public class Num3Cifras {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); // para leer entradas
        int num; // número de 3 dígitos recibido

        // petición del número
        System.out.print("Dame un número de 3 cifras: ");
        num = Integer.parseInt(entrada.nextLine());

        /*
        muestra de los dígitos del número tras comprobar que este tiene 3 cifras

        * Nos deshacemos del signo del número porque no nos interesa
        * Se usa un solo print() para no hacer varias llamadas innecesarias a la misma función
         */
        int numAbs = Math.abs(num);
        System.out.print( (numAbs/1000!=0)||(numAbs/100==0) ? "El número no tiene de 3 cifras.\n" :
                        "Cifras del número:\n"
                        + "Centenas: " + numAbs/100     + "\n"
                        + "Decenas:  " + (numAbs/10)%10 + "\n"
                        + "Unidades: " + numAbs%10      + "\n" );
    }
}
