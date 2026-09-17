package Ejer3;

/**
 * Hereda las características de un estudiante normal
 * y agrega información de una membresía premium.
 */
public class EstudiantePremium extends Estudiante {

    private String membresia;
    private String descuento;

    /**
     * Constructor de EstudiantePremium.
     *
     * @param nombre nombre del estudiante
     * @param correo correo del estudiante
     * @param telefono teléfono del estudiante
     * @param direccion dirección del estudiante
     * @param intereses intereses del estudiante
     * @param membresia tipo de membresía premium
     * @param descuento descuento de la membresía
     */
    public EstudiantePremium(String nombre, String correo, String telefono,
                             String direccion, String intereses,
                             String membresia, String descuento) {

        super(nombre, correo, telefono, direccion, intereses);

        this.membresia = membresia;
        this.descuento = descuento;
    }

    /**
     * Obtiene la membresía del estudiante.
     *
     * @return membresía del estudiante
     */
    public String getMembresia() {
        return membresia;
    }

    /**
     * Obtiene el descuento del estudiante.
     *
     * @return descuento del estudiante
     */
    public String getDescuento() {
        return descuento;
    }

    /**
     * Muestra la información del estudiante premium.
     */
    @Override
    public void mostrarInformacion() {
        System.out.println("Estudiante Premium");
        super.mostrarInformacion();
        System.out.println("Membresía: " + membresia);
        System.out.println("Descuento: " + descuento);
    }
}