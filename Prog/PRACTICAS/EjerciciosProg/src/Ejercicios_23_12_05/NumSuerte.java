package Ejercicios_23_12_05;

import java.util.Scanner;

public class NumSuerte {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); // para leer entradas
        int numSuerte; // número de la suerte

        // Se recibe la fecha de nacimiento y se suma el día mes y año para empezar el cálculo del número de la suerte
        System.out.print("Dejame que te diga tu número de la suerte.\n" +
                         "Dime tu fecha de nacimiento:\n" +
                         "Día: ");
        numSuerte = Integer.parseInt(entrada.nextLine());
        System.out.print("Mes: ");
        numSuerte += Integer.parseInt(entrada.nextLine());
        System.out.print("Año: ");
        numSuerte += Integer.parseInt(entrada.nextLine());

        // Suma de los dígitos del número de la suerte hasta que este sea de un solo dígito
        numSuerte = numSuerte % 9; // ok, pero los 9s los convierte en 0s -> Rango[0,8]
        if (numSuerte == 0) numSuerte = 9; // revierte todos los 0s a 9s --> Rango[1,9]

        // Muestra del número de la suerte
        System.out.println("Tu número de la suerte es el " + numSuerte);
    }
}
