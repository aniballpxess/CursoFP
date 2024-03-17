package Ejercicios_23_12_12;

import java.util.Scanner;

public class MostrarInfoMes {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); // para leer entradas
        int mes; // para guardar el mes

        // Se recibe el valor del mes de forma numérica - Rango[1,12]
        System.out.print("Dame un mes (1-12): ");
        mes = Integer.parseInt(entrada.nextLine());

        // Se muestra el nombre y en número de días del mes (default es mensaje de error)
        switch (mes) {
            case 1:
                System.out.println("Enero tiene 31 días.");
                break;
            case 2:
                System.out.println("Febrero tiene 28 días.");
                break;
            case 3:
                System.out.println("Marzo tiene 31 días.");
                break;
            case 4:
                System.out.println("Abril tiene 30 días.");
                break;
            case 5:
                System.out.println("Mayo tiene 31 días.");
                break;
            case 6:
                System.out.println("Junio tiene 30 días.");
                break;
            case 7:
                System.out.println("Julio tiene 31 días.");
                break;
            case 8:
                System.out.println("Agosto tiene 31 días.");
                break;
            case 9:
                System.out.println("Septiembre tiene 30 días.");
                break;
            case 10:
                System.out.println("Octubre tiene 31 días.");
                break;
            case 11:
                System.out.println("Noviembre tiene 30 días.");
                break;
            case 12:
                System.out.println("Diciembre tiene 31 días");
                break;
            default: // mensaje de error si no se ha introducido bien el dato
                System.out.println("Valor incorrecto.");
                break;
        }
    }
}
