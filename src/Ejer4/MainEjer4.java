package Ejer4;

/**
 * Clase principal para probar el patrón Prototype
 * y el principio de Inversión de Dependencias.
 */
public class MainEjer4 {

    /**
     * Método principal del programa.
     *
     * @param args argumentos de la línea de comandos
     */
    public static void main(String[] args) {

        // Crear el libro original
        Libro libroOriginal = new Libro(
                "Akelarre",
                "Andres",
                "Historia de un asesino"
        );

        // Crear el personalizador
        PersonalizadorLibro personalizador = new PersonalizadorLibro();

        // Crear una copia utilizando Prototype
        LibroClone copia = personalizador.crearCopia(libroOriginal);

        // Personalizar la copia
        personalizador.personalizarTitulo(
                copia,
                "satanas - Mi copia"
        );

        // Mostrar el libro original
        System.out.println("===== LIBRO ORIGINAL =====");
        libroOriginal.mostrarInformacion();

        System.out.println();

        // Mostrar la copia
        System.out.println("===== LIBRO COPIADO =====");
        copia.mostrarInformacion();

        // Comprobar que son objetos diferentes
        if (libroOriginal != copia) {
            System.out.println();
            System.out.println(
                    "La copia es diferente al original."
            );
        }
    }
}