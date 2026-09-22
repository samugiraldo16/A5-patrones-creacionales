package RegistroEstudiantes;


public class TicketTuristico extends Ticket {

    private double precioPaquete;
    private String guia;
    private double seguro;

    public TicketTuristico(String pasajero, double precioPaquete,
                           String guia, double seguro) {

        super(pasajero);
        this.precioPaquete = precioPaquete;
        this.guia = guia;
        this.seguro = seguro;
    }

    @Override
    public double calcularTarifa() {

        double subtotal = precioPaquete + seguro;
        double impuesto = subtotal * 0.08;

        return subtotal + impuesto;
    }

    @Override
    public void imprimir() {
        System.out.println("===== TICKET TURÍSTICO =====");
        System.out.println("Pasajero: " + pasajero);
        System.out.println("Paquete: $" + precioPaquete);
        System.out.println("Guía: " + guia);
        System.out.println("Seguro: $" + seguro);
        System.out.println("Impuesto: 8%");
        System.out.println("Total: $" + calcularTarifa());
    }
}