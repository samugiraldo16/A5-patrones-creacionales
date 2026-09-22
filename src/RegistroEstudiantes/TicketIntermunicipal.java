package RegistroEstudiantes;


public class TicketIntermunicipal extends Ticket {

    private double tarifaBase;
    private double km;
    private double costoKm;
    private int asiento;

    public TicketIntermunicipal(String pasajero, double tarifaBase,
                                double km, double costoKm, int asiento) {

        super(pasajero);
        this.tarifaBase = tarifaBase;
        this.km = km;
        this.costoKm = costoKm;
        this.asiento = asiento;
    }

    @Override
    public double calcularTarifa() {
        return tarifaBase + (km * costoKm);
    }

    @Override
    public void imprimir() {
        System.out.println("===== TICKET INTERMUNICIPAL =====");
        System.out.println("Pasajero: " + pasajero);
        System.out.println("Kilómetros: " + km);
        System.out.println("Asiento: " + asiento);
        System.out.println("Tarifa: $" + calcularTarifa());
    }
}