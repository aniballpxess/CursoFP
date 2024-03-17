import java.util.Scanner;

/*
   Programa que lee dos números por teclado y los muestra por pantalla.
*/
public class Secuencial {

    public static void main(String[] args){ //--> inicio del método main

        //declaración de variables
        int n1, n2;
        Scanner sc = new Scanner(System.in);
        //leer el primer número
        System.out.println("Introduce un número entero: ");
        n1 = sc.nextInt();      //lee un entero por teclado
        //leer el segundo número
        System.out.println("Introduce otro número entero: ");
        n2 = sc.nextInt();      //lee un entero por teclado
        //mostrar resultado
        System.out.println("Ha introducido los números: " + n1 + " y " + n2);

    } //--> final del método main
}