package Ejercicios_23_12_13;

import java.util.Scanner;

public class AzucarEnCafe {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // para recibir inputs del usuario
        int numCucharadas; // para guardar el número de cucharadas de azúcar

        // Se recibe cuanto azúcar tiene el café
        System.out.print("¿Cuántas cucharadas de azúcar tiene el café? ");
        numCucharadas = Integer.parseInt(input.nextLine());

        // Se muestra si está muy azucarado o no (2 o menos -> bien)
        if (numCucharadas < 3) {
            System.out.println("Está bién de azúcar.");
        } else {
            System.out.println("Está muy azucarado");
        }
    }
}
