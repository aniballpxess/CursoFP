package Condicionales;

/*
 * Programa que pide una nota por teclado y muestra dos mensajes si la nota es
 * mayor o igual que 5
 */
import java.util.*;
public class Condi_1_Simple {
    public static void main( String[] args ){
        Scanner sc = new Scanner( System.in );
        System.out.print("Nota: ");
        int nota = sc.nextInt();
        if (nota >= 5){//----------------------inicio de la condición                                             
            System.out.println("Enhorabuena!!");
            System.out.println("Has aprobado");
        }//-------------------------------------fin de la condición
        System.out.println("Hasta Pronto!");
    }
}