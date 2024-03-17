package Ejercicios_24_01_16.Persona;

public class PersonaApp {
    public static void main(String[] args) {
        // Instancia la persona referente a Juan
        Persona persona1 = new Persona("Juan", 25);
        // Instancia la persona referente a María
        Persona persona2 = new Persona("Maria", 30);


        // Muestra la información de Juan
        System.out.println("Esta es la información que tengo de la primera persona registrada:");
        persona1.mostrarInformacion();
        // Muestra la información de María
        System.out.println("La segunda persona registrada se llama " + persona2.getNombre() + " y tiene " + persona2.getEdad() + " años.");
    }


}
