package RegistroEstudiantes;



public class FactoryTuristico extends FactoryTicket {

    @Override
    public Ticket crearTicket(String pasajero) {

        return new TicketTuristico(
                pasajero,
                150000,
                "Carlos",
                20000
        );
    }
}