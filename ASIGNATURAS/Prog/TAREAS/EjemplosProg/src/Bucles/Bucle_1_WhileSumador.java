package Bucles;

/*
 * Programa que lee números hasta que se lee un negativo y muestra la
 * suma de los números leídos
 */
import java.util.*;
public class Bucle_1_WhileSumador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;       //variable que contiene el número introducido
        int suma = 0;  //variable donde acumularemos la suma de los números                                       

        System.out.print("Introduzca un número ( < 0 para finalizar): ");
        num = sc.nextInt(); //lectura del primer número

        while (num >= 0){ //inicio del bucle while                          
            suma = suma + num; //se suma el número introducido
            System.out.print("Introduzca un número ( < 0 para finalizar): ");
            num = sc.nextInt(); //lectura del siguiente número
        } //fin del bucle while
        System.out.println("La suma es: " + suma ); //se muestra la suma
    }
}