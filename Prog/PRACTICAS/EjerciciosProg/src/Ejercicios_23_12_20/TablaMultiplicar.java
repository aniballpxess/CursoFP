package Ejercicios_23_12_20;

import java.util.Scanner;

public class TablaMultiplicar {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in); // para leer inputs

        // El programa se ejecuta hasta que el usuario decida salir introduciendo 0
        while (true) {
            // Recibe y guarda el número para hacer la tabla
            System.out.print("Introduce un entero entre 1 y 10 (0 para salir): ");
            int numero = Integer.parseInt(lector.nextLine());

            // Comprueba si el usuario quiere terminar el programa (input = 0)
            if (numero == 0) {
                break;
            }

            // Comprueba si el número está dentro del rango permitido (entre 0 y 10)
            if (numero < 0 || 10 < numero){
                System.out.println("No has introducido un número válido.");
                continue;
            }

            // Muestra por pantalla la tabla de multiplicar
            //se usa printf() para hacer que la tabla ocupe el mismo espacio siempre
            for (int i = 1; i < 13; i++) {
                System.out.printf("%d x %-2d = %3d\n", numero, i, numero*i);
            }
        }
        lector.close(); // para liberar recursos dedicados al lector, el cual ya no es necesario
        // Mensaje de salida
        System.out.println("Adiós.");
    }
}
