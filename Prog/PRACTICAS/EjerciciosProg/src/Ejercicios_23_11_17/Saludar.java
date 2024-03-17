package Ejercicios_23_11_17;

import java.util.Scanner;

public class Saludar {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        String nombre;

        System.out.println("¡Hola!¿Cómo te llamas?");
        nombre = input.nextLine();
        System.out.println("Asique te llamas "+nombre+".¡Mucho gusto!");

        input.close();
    }
}
