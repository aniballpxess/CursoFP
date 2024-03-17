package Clases.Bicicleta;

public class Bicicleta {
    // Atributos
    private int velocidadActual;
    private int platoActual;
    private int pinonActual;

    // Constructor
    public Bicicleta(int velocidadInicial, int platoInicial, int pinonInicial) {
        this.velocidadActual = velocidadInicial;
        this.platoActual = platoInicial;
        this.pinonActual = pinonInicial;
    }

    // Método para acelerar (dobla la velocidad)
    public void acelerar() {
        velocidadActual *= 2;
    }

    // Método para frenar (reduce a la mitad la velocidad)
    public void frenar() {
        velocidadActual /= 2;
    }

    // Método para cambiar el plato actual
    public void cambiarPlato(int nuevoPlato) {
        platoActual = nuevoPlato;
    }

    // Método para cambiar el piñón actual
    public void cambiarPinon(int nuevoPinon) {
        pinonActual = nuevoPinon;
    }

    // Métodos para obtener los valores actuales
    public int obtenerVelocidadActual() {
        return velocidadActual;
    }

    public int obtenerPlatoActual() {
        return platoActual;
    }

    public int obtenerPinonActual() {
        return pinonActual;
    }

    // Método para mostrar los detalles de una bicicleta
    public void mostrarDetallesBicicleta() {
        System.out.println("Velocidad actual: " + obtenerVelocidadActual());
        System.out.println("Plato actual: " + obtenerPlatoActual());
        System.out.println("Piñón actual: " + obtenerPinonActual());
    }
}
