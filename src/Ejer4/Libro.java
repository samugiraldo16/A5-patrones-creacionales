package Ejer4;

/**
 * Representa un libro que puede ser clonado
 * y posteriormente personalizado.
 */
public class Libro implements LibroClone {

    private String titulo;
    private String autor;
    private String contenido;

    /**
     * Constructor de la clase Libro.
     *
     * @param titulo título del libro
     * @param autor autor del libro
     * @param contenido contenido del libro
     */
    public Libro(String titulo, String autor, String contenido) {
        this.titulo = titulo;
        this.autor = autor;
        this.contenido = contenido;
    }

    /**
     * Crea una copia del libro actual.
     *
     * @return una copia del libro
     */
    @Override
    public LibroClone clonar() {
        return new Libro(titulo, autor, contenido);
    }

    /**
     * Cambia el título del libro.
     *
     * @param nuevoTitulo nuevo título del libro
     */
    @Override
    public void cambiarTitulo(String nuevoTitulo) {
        titulo = nuevoTitulo;
    }

    /**
     * Muestra la información del libro.
     */
    @Override
    public void mostrarInformacion() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Contenido: " + contenido);
    }
}