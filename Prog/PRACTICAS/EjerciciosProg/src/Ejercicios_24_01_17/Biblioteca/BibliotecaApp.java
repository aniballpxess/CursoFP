package Ejercicios_24_01_17.Biblioteca;

public class BibliotecaApp {
    public static void main(String[] args) {
        // Crea los libros a utilizar ----------------------------------------------------------------------------------

        Libro libro1 = new Libro("El Conde de Montecristo", "Alejandro Dumas", true);
        Libro libro2 = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", true);
        Libro libro3 = new Libro("Nacidos de la bruma", "Brandon Sanderson", true);
        Libro libro4 = new Libro("El Señor de los Anillos: La Comunidad del Anillo", "J.R.R.Tolkien", true);

        // Muestra la información de los libros ------------------------------------------------------------------------

        System.out.println("\nESTADO INICIAL ---------------------------------");
        System.out.println(libro1);
        System.out.println(libro2);
        System.out.println(libro3);
        System.out.println(libro4);

        // Realiza acciones con los libros -----------------------------------------------------------------------------

        System.out.println("\nACCIONES ---------------------------------------\n");
        // El Conde
        prestarLibro(libro1);   // Éxito
        prestarLibro(libro1);   // Fracaso
        devolverLibro(libro1);  // Éxito
        // El Quijote
        prestarLibro(libro2);   // Éxito
        devolverLibro(libro2);  // Éxito
        devolverLibro(libro2);  // Fracaso
        // Nacidos de la bruma
        devolverLibro(libro3);  // Fracaso
        devolverLibro(libro3);  // Fracaso
        prestarLibro(libro3);   // Éxito
        // ESdlA:LCdA
        prestarLibro(libro4);   // Éxito
        devolverLibro(libro4);  // Éxito
        prestarLibro(libro4);   // Éxito

        // Muestra la información de los libros ------------------------------------------------------------------------

        System.out.println("\nESTADO INICIAL ---------------------------------");
        System.out.println(libro1);
        System.out.println(libro2);
        System.out.println(libro3);
        System.out.println(libro4);
    }

    /* Método para prestar un libro (EXTERNO)
    *
    * - Trata de prestar el libro e imprime un mensaje para indicar si la operación ha tenido éxito o no
    * */
    public static void prestarLibro(Libro libro) {
        if (libro.prestar()) {
            System.out.println("Libro prestado con éxito.");
        } else {
            System.out.println("No se ha podido prestar el libro.");
        }
    }

    /* Método para devolver un libro (EXTERNO)
     *
     * - Trata de devolver el libro e imprime un mensaje para indicar si la operación ha tenido éxito o no
     * */
    public static void devolverLibro(Libro libro) {
        if (libro.devolver()) {
            System.out.println("Libro devuelto con éxito.");
        } else {
            System.out.println("No se ha podido devolver el libro.");
        }
    }
}
