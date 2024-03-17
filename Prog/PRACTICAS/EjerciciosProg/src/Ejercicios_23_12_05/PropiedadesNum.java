package Ejercicios_23_12_05;

import java.util.Scanner;

public class PropiedadesNum {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); // para leer entradas
        int num; // numero a analizar

        // petición del número
        System.out.print("Dame un número: ");
        num = Integer.parseInt(entrada.nextLine());

        /*
        muestra de la las propiedades del número.
        - Signo
        - Paridad
        - Multiplicidad por 5
        - Multiplicidad por 10
        - Mayor o menor que 100

        * Se usa el operador diferencial (?:) dentro de print()
        * Se usa un solo print() para no hacer varias llamadas innecesarias a la misma función
         */
        System.out.print("El número:\n"
                      + (num<0     ? "- Es negativo.\n"       : "- Es positivo.\n")
                      + (num%2==0  ? "- Es par.\n"            : "- Es impar.\n")
                      + (num%5==0  ? "- Es múltiplo de 5.\n"  : "- No es múltiplo de 5.\n")
                      + (num%10==0 ? "- Es múltiplo de 10.\n" : "- No es múltiplo de 10.\n")
                      + (num<100   ? "- Es menor que 100.\n"  : "- Es mayor o igual que 100.\n"));
    }
}
