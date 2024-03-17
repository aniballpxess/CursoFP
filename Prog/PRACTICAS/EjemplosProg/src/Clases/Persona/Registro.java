package Clases.Persona;

// La clase Registro representa la información de registro, incluyendo datos personales, ID de cliente y estado de activación
public class Registro {
    // Atributos
    private Persona datosPersonales;
    private Integer idCliente;
    private Boolean activo;

    // Constructor que inicializa la información de registro con cuenta inactiva
    public Registro(Integer edadPersona, String nombrePersona) {
        this.setDatosPersonales(edadPersona, nombrePersona);
        this.setIdCliente(null);
        this.setActivo(false);
    }

    // Constructor adicional que permite especificar un ID de cliente y activa la cuenta
    public Registro(Integer edadPersona, String nombrePersona, Integer idCliente) {
        this.setDatosPersonales(edadPersona, nombrePersona);
        this.setIdCliente(idCliente);
        this.setActivo(true);
    }

    // Método privado para inicializar los datos personales
    private void setDatosPersonales(Integer edadPersona, String nombrePersona) {
        this.datosPersonales = new Persona(edadPersona, nombrePersona);
    }

    // Método privado para establecer el ID de cliente
    private void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    // Método privado para activar la cuenta
    private void setActivo(Boolean activo) {
        this.activo = activo;
    }

    // Método getter para obtener los datos personales
    public Persona getDatosPersonales() {
        return datosPersonales;
    }

    // Método getter para obtener el ID de cliente
    public Integer getIdCliente() {
        return idCliente;
    }

    // Método getter para verificar el estado de activación
    public Boolean isActivo() {
        return activo;
    }

    // Método para activar la cuenta con un ID de cliente específico
    public void activarCuenta(Integer idCliente) {
        if (this.isActivo()) {
            System.out.println("La cuenta ya está activa.");
        } else {
            this.setActivo(true);
            this.setIdCliente(idCliente);
            System.out.println("La cuenta ha sido activada.");
        }
    }

    // Método para desactivar la cuenta
    public void desactivarCuenta() {
        if (!this.isActivo()) {
            System.out.println("La cuenta ya está inactiva.");
        } else {
            this.setActivo(false);
            this.setIdCliente(null);
            System.out.println("La cuenta ha sido desactivada.");
        }
    }

    // Método toString que devuelve la información de Registro en forma de String
    //
    // Realmente el método toString no debería de estar formateado de esta forma porque su propósito es otro, pero en
    // este caso lo usamos para que quede bien impreso por pantalla
    @Override
    public String toString() {
        if (this.isActivo()) {
            return "\nINFO REGISTRO\n" +
                    datosPersonales.toString() +
                    "Cuenta: activa\n" +
                    "Nº Cliente: " + idCliente + "\n";
        } else {
            return "\nINFO REGISTRO\n" +
                    datosPersonales.toString() +
                    "Cuenta: inactiva\n";
        }
    }
}
