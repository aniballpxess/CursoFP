package Condicionales;

import java.util.*;
public class Condi_5_MultipleGigachad {
    public static void main(String[] args) {
        int numeroDia;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el numero del día de la semana (1 a 7): ");
        numeroDia = sc.nextInt();
        switch (numeroDia){
            case 1:
            case 3:
            case 5: System.out.println("Tenemos clase de programación");
                break;
            case 2:
            case 4: System.out.println("Vaya, que pena");
                System.out.println("Hoy no tenemos clase de programación");
                break;
            case 6:
            case 7: System.out.println("Estoy deseando que llegue el lunes!!");
                break;
            default : System.out.println("Número de día no válido");
        }
    }
}