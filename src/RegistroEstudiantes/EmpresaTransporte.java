package RegistroEstudiantes;


public class EmpresaTransporte {

    public void emitirTicket(FactoryTicket fabrica, String pasajero) {

        Ticket ticket = fabrica.crearTicket(pasajero);

        ticket.imprimir();
    }
}