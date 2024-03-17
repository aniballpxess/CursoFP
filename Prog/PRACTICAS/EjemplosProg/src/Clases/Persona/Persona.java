package Clases.Persona;

// La clase Persona representa a una persona con nombre y edad
public class Persona {
    // Atributos
    private Integer edadPersona;
    private String nombrePersona;

    // Constructor de la clase que recibe la edad y el nombre de la persona al crear una instancia
    public Persona(Integer edad, String nombrePersona){
        setEdadPersona(edad);
        setNombrePersona(nombrePersona);
    }

    // Método setter para la edad de la persona
    public void setEdadPersona(Integer edadPersona) {
        this.edadPersona = edadPersona;
    }

    // Método setter para el nombre de la persona
    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    // Método getter para obtener la edad de la persona
    public Integer getEdadPersona() {
        return edadPersona;
    }

    // Método getter para obtener el nombre de la persona
    public String getNombrePersona() {
        return nombrePersona;
    }

    // Método toString que devuelve la información de Persona en forma de String
    //
    // Realmente el método toString no debería de estar formateado de esta forma porque su propósito es otro, pero en
    // este caso lo usamos para que quede bien impreso por pantalla
    @Override
    public String toString() {
        return "Datos Personales\n" +
                "    Nombre: " + nombrePersona + "\n" +
                "    Edad: " + edadPersona + "\n";
    }
}
