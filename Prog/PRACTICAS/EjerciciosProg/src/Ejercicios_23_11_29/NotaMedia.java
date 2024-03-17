package Ejercicios_23_11_29;

import java.util.Scanner;

public class NotaMedia
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double[] notas = new double[6];
        double notaMedia = 0.0;

        for (int i = 0; i < notas.length; i++)
        {
            System.out.print("Introduce nota "+i+": ");
            notas[i] = input.nextDouble();
        }
        input.close();

        for (double nota : notas)
        {
            notaMedia += nota;
        }
        notaMedia /= notas.length;

        if (notaMedia < 5) System.out.println("La nota media es "+notaMedia+" - SUSPENSO");
        else System.out.println("La nota media es "+notaMedia+" - APROBADO");
    }
}