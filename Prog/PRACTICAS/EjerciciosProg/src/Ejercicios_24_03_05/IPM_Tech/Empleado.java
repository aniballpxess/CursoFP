package Ejercicios_24_03_05.IPM_Tech;

import java.util.StringJoiner;

public class Empleado {
    private String nombreCompleto;
    private String cedula;
    private int edad;
    private boolean casado;
    private double salario;

    public Empleado() {
        this.nombreCompleto = null;
        this.cedula = null;
        this.setEdad(18);
        this.casado = false;
        this.salario = 0.0;
    }

    public Empleado(String nombre, String apellido, String cedula, int edad, boolean casado, double salario) {
        this.setNombre(nombre,apellido);
        this.cedula = cedula;
        this.setEdad(edad);
        this.casado = casado;
        this.salario = salario;
    }

    public void setNombre(String nombre, String apellido) {

        this.nombreCompleto = nombre + " " + apellido;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setEdad(int edad) throws NumberFormatException {
        if (18 <= edad && edad <= 45) {
            this.edad = edad;
        } else {
            throw new NumberFormatException();
        }
    }

    public void setCasado(boolean casado) {
        this.casado = casado;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }


    @Override
    public String toString() {
        return new StringJoiner("\n", Empleado.class.getSimpleName() + " Info\n", "\n")
                .add("Nombre: " + nombreCompleto)
                .add("Cedula: " + cedula)
                .add("Edad: " + edad)
                .add("Casado: " + casado)
                .add("Salario: " + salario)
                .toString();
    }

    public void categoria() {
        String categoria;
        if (this.edad <= 21) {
            categoria = "Principiante";
        } else if (this.edad <= 35) {
            categoria = "Intermedio";
        } else {
            categoria = "Senior";
        }
        System.out.println("Categoría: " + categoria);
    }

    public void cambiarSalario(int cambioPorcentual) {
        double cambioPorcentualReal = 1.0 + cambioPorcentual / 100.0;
        this.salario *= cambioPorcentualReal;
    }
}
