package Ejer4;

/**
 * Se encarga de crear y personalizar copias de libros
 * utilizando la abstracción LibroClone.
 */
public class PersonalizadorLibro {

    /**
     * Crea una copia del libro recibido.
     *
     * @param libro libro que se desea copiar
     * @return copia del libro
     */
    public LibroClone crearCopia(LibroClone libro) {
        return libro.clonar();
    }

    /**
     * Personaliza el título de una copia.
     *
     * @param libro libro que se desea personalizar
     * @param nuevoTitulo nuevo título del libro
     */
    public void personalizarTitulo(
            LibroClone libro,
            String nuevoTitulo) {

        libro.cambiarTitulo(nuevoTitulo);
    }
}