package Trabajo_23_12_12;

import java.util.Scanner;

public class HabitacionTematicaHotel {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); // para leer entradas
        int id_Tema; // para guardar la temática de la habitación
        String nombre_Tema = null; // para guardar el nombre de la temática

        // Se recibe el número de la temática - Rango[1,4]
        System.out.print("Núm. de temática de habitación (1-4): ");
        id_Tema = Integer.parseInt(entrada.nextLine());

        // Se guarda el nombre de la temática correspondiente
        switch (id_Tema) {
            case 1: nombre_Tema = "habitación alpes";
                break;
            case 2: nombre_Tema = "habitación montañas rocosas";
                break;
            case 3: nombre_Tema = "habitación montañas atlas";
                break;
            case 4: nombre_Tema = "habitación montañas penibéticas";
                break;
            default:
        }

        // Se muestra la temática correspondiente al número (o el mensaje de error)
        if (id_Tema < 1 || 4 < id_Tema) {
            System.out.println("Núm. de temática incorrecto.");
        } else {
            System.out.println("Usted esta hospedado en el hotel San Francisco en la habitación temática " + nombre_Tema);
        }
    }
}
