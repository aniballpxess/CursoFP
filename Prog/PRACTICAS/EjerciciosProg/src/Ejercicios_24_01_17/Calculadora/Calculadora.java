package Ejercicios_24_01_17.Calculadora;

public class Calculadora {
    // Suma
    public static double sumar(double a, double b) {
        return a + b;
    }

    // Resta
    public static double restar(double a, double b) {
        return a - b;
    }

    // Multiplicación
    public static double multiplicar(double a, double b) {
        return a * b;
    }

    // División (Maneja el dividir por 0)
    public static double dividir(double a, double b) {
        if (b == 0) {
            System.out.println("No se puede dividir por 0.");
            return Double.NaN;
        }
        else {
            return a / b;
        }
    }
}
