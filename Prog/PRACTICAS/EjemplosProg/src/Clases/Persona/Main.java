package Clases.Persona;

public class Main {
    public static void main(String[] args) {
        // Crea un nuevo Registro
        Registro cliente1 = new Registro(26,"Marcos");
        // Muestra la info del Registro después de crearlo
        System.out.println(cliente1.toString());
        // Trata de activar la cuenta del Registro - Funciona
        cliente1.activarCuenta(1);
        // Trata de activar la cuenta del Registro - NO Funciona
        cliente1.activarCuenta(4);
        // Muestra la info del Registro después de activar la cuenta
        System.out.println(cliente1.toString());
        // Trata de desactivar la cuenta del Registro - Funciona
        cliente1.desactivarCuenta();
        // Trata de desactivar la cuenta del Registro - NO Funciona
        cliente1.desactivarCuenta();
        // Muestra la info del Registro después de desactivar la cuenta
        System.out.println(cliente1.toString());
    }
}
