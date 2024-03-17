package Ejercicios_23_12_12;

import java.util.Scanner;

public class LeerHora {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); // para leer entradas
        int hora, min, seg; // para guardar la hora

        // Se recibe la hora y se guarda en 3 variables int diferentes
        System.out.print("Dame la hora:\n" +
                         "Hora (00-23): ");
        hora = Integer.parseInt(entrada.nextLine());
        System.out.print("Minuto (00-59): ");
        min = Integer.parseInt(entrada.nextLine());
        System.out.print("Segundo (00-59): ");
        seg = Integer.parseInt(entrada.nextLine());

        // Se informa de si la hora está bien introducida - con lógica OR (||), que pienso que se lee mejor
        if ( (hora < 0 || 23 < hora) || (min < 0 || 59 < min) || (seg < 0 || 59 < seg) ) {
            System.out.println("Has introducido una hora incorrecta.");
        } else {
            System.out.println("La hora está bien.");
        }
    }
}
