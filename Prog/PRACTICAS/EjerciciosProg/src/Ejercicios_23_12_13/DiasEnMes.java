package Ejercicios_23_12_13;

import java.util.Scanner;

public class DiasEnMes {
    public static void main(String[] args)
            // Se debe indicar siempre el o los tipos de "Excepciones" que el bloque puede "Lanzar"
            throws NumberFormatException {
        Scanner entrada = new Scanner(System.in); // para leer entradas
        int mes; // para guardar el número asociado a cada mes

        // Se recibe el valor del mes de forma numérica - Rango[1,12]
        System.out.print("Dame un mes (1-12): ");
        mes = Integer.parseInt(entrada.nextLine());

        // Se muestra el nombre y en número de días del mes (default es mensaje de error)
        // Es más correcto poner 1 "case" por línea para que sea más fácil de editar
        switch (mes) {
            case 1, 3, 5, 7, 8, 10, 12:
                System.out.println("Tiene 31 días.");
                break;
            case 4, 6, 9, 11:
                System.out.println("Tiene 30 días.");
                break;
            case 2:
                System.out.println("Tiene 28 o 29 días.");
                break;
            default:
                // Mensaje de error mediante el uso de (throw) Lanzar y (Exception) Excepciones
                throw new NumberFormatException("El número introducido es incorrecto.");
        }
    }
}
