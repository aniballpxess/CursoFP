package Ejercicios_23_11_24;

public class IntercambioVariables {
    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 35;
        int aux;
        System.out.println("Antes----------------\n" +
                "num1 = " + num1 + " | num2 = " + num2);
        aux = num1;
        num1 = num2;
        num2 = aux;
        System.out.println("Despues--------------\n" +
                "num1 = " + num1 + " | num2 = " + num2);
    }
}