package Ejercicios_24_02_21;

public class Animal {
    private String nombre;
    private String tipoDeAlimentacion;
    private int edad;

    public Animal(String nombre, String tipoDeAlimentacion, int edad) {
        this.nombre = nombre;
        this.tipoDeAlimentacion = tipoDeAlimentacion;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoDeAlimentacion() {
        return tipoDeAlimentacion;
    }

    public void setTipoDeAlimentacion(String tipoDeAlimentacion) {
        this.tipoDeAlimentacion = tipoDeAlimentacion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
