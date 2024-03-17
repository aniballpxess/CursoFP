package Ejercicios_23_11_24;

import java.util.Scanner;

public class AreaCirculoTriangulo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double PI = 3.14159265359;
        double radioIN, baseIN, alturaIN;
        double areaCircOUT, areaTrigOUT;

        System.out.print("Introduce un radio para el circulo: ");
        radioIN = Double.parseDouble(input.nextLine());
        areaCircOUT = radioIN * radioIN * PI;
        System.out.println("El area del circulo es "+areaCircOUT+".\n");

        System.out.print("Introduce una base para el triangulo: ");
        baseIN = Double.parseDouble(input.nextLine());
        System.out.print("Introduce una altura para el triangulo: ");
        alturaIN = Double.parseDouble(input.nextLine());
        areaTrigOUT = baseIN*alturaIN/2;
        System.out.println("El area del triangulo es "+areaTrigOUT+".\n");
    }
}
