package RegistroEstudiantes;

public abstract class Ticket {

    protected String pasajero;

    public Ticket(String pasajero) {
        this.pasajero = pasajero;
    }

    public abstract double calcularTarifa();

    public abstract void imprimir();
}