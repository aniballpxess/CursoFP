package Ejercicios_23_12_05;

import java.util.Scanner;

public class CaF {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); // para leer entradas
        double temp; // para guardar la temperatura

        // petición de la temperatura
        System.out.print("Dime la temperatura en ºC: ");
        temp = Double.parseDouble(entrada.nextLine());
        // cálculo y muestra de la temperatura
        System.out.println("Estamos a " + (32 + 9 * temp / 5) + " ºF"); // fórmula: F = 32+(9*C/5)
    }
}
