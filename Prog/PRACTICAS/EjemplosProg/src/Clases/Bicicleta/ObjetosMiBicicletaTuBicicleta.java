package Clases.Bicicleta;

public class ObjetosMiBicicletaTuBicicleta {
    public static void main(String[] args) {
        // Crear las bicicletas 'miBicicleta' y 'tuBicicleta'
        Bicicleta miBicicleta = new Bicicleta(10, 3, 7);
        Bicicleta tuBicicleta = new Bicicleta(8, 2, 5);

        // Mostrar estados iniciales de 'miBicicleta' y 'tuBicicleta'
        System.out.println();
        System.out.println("Estado de miBicicleta:");
        miBicicleta.mostrarDetallesBicicleta();
        System.out.println("Estado de tuBicicleta:");
        tuBicicleta.mostrarDetallesBicicleta();
        System.out.println();

        // Frenar 'tuBicicleta' cambiando el Plato y el Piñon
        System.out.println("tuBicicleta se frena.");
        tuBicicleta.cambiarPlato(3);
        tuBicicleta.cambiarPinon(8);
        tuBicicleta.frenar();

        // Acelerar 'miBicicleta' cambiando el Plato y el Piñon
        System.out.println("miBicicleta se acelera.");
        miBicicleta.cambiarPlato(1);
        miBicicleta.cambiarPinon(1);
        miBicicleta.acelerar();

        // Mostrar estados actuales de 'miBicicleta' y 'tuBicicleta
        System.out.println();
        System.out.println("Estado de miBicicleta:");
        miBicicleta.mostrarDetallesBicicleta();
        System.out.println("Estado de tuBicicleta:");
        tuBicicleta.mostrarDetallesBicicleta();
        System.out.println();
    }

}
