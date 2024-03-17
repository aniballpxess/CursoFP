package Ejercicios_23_12_01;

import java.util.Scanner;

public class PVPProducto
{
    public static void main(String[] args) {
        String nombre;
        int cantidad;
        double precio;
        double IVA;
        double PVP;

        // Recibe los datos del producto
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce la información del producto");
        nombre = recibirEntrada(entrada, "Nombre: ");
        cantidad = Integer.parseInt(recibirEntrada(entrada, "Cantidad: "));
        precio = Double.parseDouble(recibirEntrada(entrada, "Precio: "));
        IVA = Double.parseDouble(recibirEntrada(entrada, "IVA: "));
        entrada.close();
        // Calcula el Precio de Venta al Público (PVP)
        PVP = calculoPVP(cantidad, precio, IVA);
        // Muestra el PVP
        mostrarPVP(nombre, PVP);
    }

    private static double calculoPVP(int cantidad, double precio, double IVA)
    {
        return precio*cantidad*(1+IVA);
    }

    private static void mostrarPVP(String nombre, double PVP)
    {
        System.out.printf("Precio de Venta al Público de %1$s: %2$.2f €\n", nombre, PVP);
    }

    private static String recibirEntrada(Scanner input, String mensaje)
    {
        System.out.print(mensaje);
        return input.nextLine();
    }

}
