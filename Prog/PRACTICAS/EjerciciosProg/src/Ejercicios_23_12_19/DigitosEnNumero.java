package Ejercicios_23_12_19;

import java.util.Scanner;

public class DigitosEnNumero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // para leer inputs
        int numero, digitos = 0; // para guardar el número y los dígitos del número

        // El bucle se ejecuta hasta que la condición se cumpla
        while (true) {
            // Lector de números
            System.out.print("Escribe un número (entre 0 y 999): ");
            numero = Integer.parseInt(input.nextLine());

            // Condición para salir del bucle (el número está entre 0 y 999)
            if (-1 < numero && numero < 1000) {
                break;
            }

            // Mensaje de error por no haber introducido bien el número
            System.out.println("No has introducido un número válido.");
        }

        // El bucle se ejecuta hasta que la condición se cumpla
        while (true) {
            // Contador de dígitos
            numero /= 10; // para quitarle un dígito al número
            digitos++; // para contar el dígito eliminado

            // Condición para salir del bucle (se han terminado de contar los dígitos)
            if(numero == 0) {
                break;
            }
        }

        // Mensaje final al usuario
        System.out.println("Has introducido un número con " + digitos + " dígitos.");
    }
}