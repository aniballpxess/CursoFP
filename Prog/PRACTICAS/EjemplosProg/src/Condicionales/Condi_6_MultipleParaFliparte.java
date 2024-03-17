package Condicionales;

import java.util.*;
public class Condi_6_MultipleParaFliparte {
    public static void main(String[] args) {
        int x, y = 10;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número >= 1 y <= 6: ");
        x = sc.nextInt();
        switch (x){
            case 1: x--;
            case 2: x+=5;
            case 3: x = x + y;
                break;
            case 4:
            case 5:
            case 6: x++;
                break;
            default : System.out.println("Número no válido");
        }
        System.out.println("x = " + x);
    }
}