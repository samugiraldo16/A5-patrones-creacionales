package Ejer4;

/**
 * Define las operaciones que puede realizar un libro clonable.
 */
public interface LibroClone {

    /**
     * Crea una copia del libro.
     *
     * @return copia del libro
     */
    LibroClone clonar();

    /**
     * Cambia el título del libro.
     *
     * @param nuevoTitulo nuevo título del libro
     */
    void cambiarTitulo(String nuevoTitulo);

    /**
     * Muestra la información del libro.
     */
    void mostrarInformacion();
}