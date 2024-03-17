package Ejercicios_23_12_20;

import java.util.Scanner;

public class IntroducirClave {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in); // para leer inputs
        int clave = 5978; // para guardar la clave de acceso

        // Bucle que se repite a menos que el usuario introduzca la clave correctamente o se le acaben los intentos
        while (true) {
            // Lector del input del usuario (intento de la clave de acceso)
            System.out.print("Introduce la clave de acceso: ");
            int input = Integer.parseInt(lector.nextLine());

            // Comprueba si la clave es correcta
            if (input == clave) {
                break;
            }

            // Mensaje de error por no introducir bien la clave
            System.out.println("Clave incorrecta.");
        }
        lector.close(); // para liberar recursos dedicados al lector, el cual ya no es necesario
        // Mensaje de reconocimiento del acceso
        System.out.println("Acceso concedido.");
    }
}
