package RegistroEstudiantes;


public class FactoryUrbano extends FactoryTicket {

    @Override
    public Ticket crearTicket(String pasajero) {
        return new TicketUrbano(pasajero, 3000);
    }
}