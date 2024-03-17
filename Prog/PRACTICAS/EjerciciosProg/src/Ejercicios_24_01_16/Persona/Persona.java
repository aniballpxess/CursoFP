package Ejercicios_24_01_16.Persona;

public class Persona {
    // Atributos (privados para limitar el acceso) ---------------------------------------------------------------------
    private String nombre;
    private int edad;
    //------------------------------------------------------------------------------------------------------------------

    // Constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Métodos getter de la clase --------------------------------------------------------------------------------------
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
    //------------------------------------------------------------------------------------------------------------------

    // Método para mostrar la información de la clase
    public void mostrarInformacion() {
        System.out.println(
                "DATOS PERSONALES\n" +
                " - Nombre: " + nombre + '\n' +
                " - Edad: " + edad + '\n'
        );
    }
}
