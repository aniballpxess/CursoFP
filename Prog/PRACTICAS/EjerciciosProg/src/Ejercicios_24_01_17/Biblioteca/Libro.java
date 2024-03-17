package Ejercicios_24_01_17.Biblioteca;

public class Libro {
    /* Atributos de la clase
    *
    * - Se ponen privados por seguridad
    * */
    private String titulo;
    private String autor;
    private boolean disponible;

    /* Constructor */
    public Libro(String titulo, String autor, boolean disponible) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = disponible;
    }

    /* Método para prestar el libro (INTERNO)
     *
     * - Devuelve un booleano para confirmar si la operación ha tenido éxito.
     * */
    public boolean prestar() {
        if (this.disponible) {
            this.disponible = false;
            return true;
        } else {
            return false;
        }
    }

    /* Método para devolver el libro (INTERNO)
    *
    * - Devuelve un booleano para confirmar si la operación ha tenido éxito.
    * */
    public boolean devolver() {
        if (!this.disponible) {
            this.disponible = true;
            return true;
        } else {
            return false;
        }
    }

    /* Método para mostrar la información de la clase
    *
    *  - "toString()" no debería de usarse para esto, pero en este caso lo reutilizamos con un propósito diferente
    * */
    @Override
    public String toString() {
        if (this.disponible) {
            return  "\nTitulo: " + titulo +
                    "\nAutor: " + autor +
                    "\nDisponible: SI";
        } else {
            return  "\nTitulo: " + titulo +
                    "\nAutor: " + autor +
                    "\nDisponible: NO";
        }
    }
}
