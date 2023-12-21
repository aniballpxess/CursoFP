package Condicionales;

/*
 * Programa que pide una nota por teclado y muestra si se ha aprobado o no
 */
import java.util.*;
public class Condi_2_Doble {
    public static void main( String[] args ){
        Scanner sc = new Scanner( System.in );
        System.out.print("Nota: ");
        int nota = sc.nextInt();
        if (nota >= 5){
            System.out.println("Enhorabuena!!");
            System.out.println("Has aprobado");
        } else {
            System.out.println("Lo siento, has suspendido");
        }
        System.out.println("Hasta Pronto!");
    }
}