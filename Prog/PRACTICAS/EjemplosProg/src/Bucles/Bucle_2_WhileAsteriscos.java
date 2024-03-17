package Bucles;

/*
 * programa que lee un número n y muestra n asteriscos
 */
import java.util.*;

public class Bucle_2_WhileAsteriscos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N; //variable que contiene el número de asteriscos a mostrar
        int contador = 0; //variable para contar los asteriscos que se han mostrado                               
        System.out.print("Introduce número de asteriscos a mostrar: ");
        N = sc.nextInt(); //leemos el número total de asteriscos a mostrar

        while (contador < N){ //inicio del bucle while                                                            
            System.out.print("*");
            contador++;
        }  //fin del bucle while
        System.out.println("Fin programa");
    }
}