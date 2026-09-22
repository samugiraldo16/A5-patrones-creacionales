package RegistroEstudiantes;


public class FactoryIntermunicipal extends FactoryTicket {

    @Override
    public Ticket crearTicket(String pasajero) {

        return new TicketIntermunicipal(
                pasajero,
                10000,
                120,
                500,
                15
        );
    }
}