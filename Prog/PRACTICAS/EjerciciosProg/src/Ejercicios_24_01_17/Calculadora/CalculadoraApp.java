package Ejercicios_24_01_17.Calculadora;

import java.util.Scanner;

public class CalculadoraApp {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in); // para leer inputs
        String input; // para guardar el input de la acción
        double num1, num2, resultado; // para guardar los números que vamos a manejar (2 inputs y 1 resultado)

        // Mensaje de bienvenida y tablón de acciones
        System.out.println("\n¡Bienvenido a la calculadora!\n\n" +
                "Posibles tipos de acciones:\n" +
                "Sumar.........s\n" +
                "Restar........r\n" +
                "Multiplicar...m\n" +
                "Dividir.......d\n" +
                "Cerrar........c\n"
        );

        // Inicio de la calculadora
        while (true) {
            // Recibe la operación a realizar
            System.out.print("Operación: ");
            input = leer.nextLine();

            // Comprueba si tiene que cerrarse
            if (input.equals("c")) {
                break;
            }

            // Recibe el primer operando
            System.out.print("A: ");
            num1 = Double.parseDouble(leer.nextLine());

            // Recibe el segundo operando
            System.out.print("B: ");
            num2 = Double.parseDouble(leer.nextLine());

            // Ejecuta la operación indicada
            switch (input) {
                case "s":
                    resultado = Calculadora.sumar(num1,num2);
                    System.out.println("Resultado: " + resultado + "\n");
                    break;
                case "r":
                    resultado = Calculadora.restar(num1,num2);
                    System.out.println("Resultado: " + resultado + "\n");
                    break;
                case "m":
                    resultado = Calculadora.multiplicar(num1,num2);
                    System.out.println("Resultado: " + resultado + "\n");
                    break;
                case "d":
                    resultado = Calculadora.dividir(num1,num2);
                    System.out.println("Resultado: " + resultado + "\n");
                    break;
                default:
                    System.out.println("Input incorrecto.");
            }
        }

        // Mensaje de despedida y cierre del Scanner
        System.out.println("\n¡Hasta pronto!");
        leer.close();
    }
}
