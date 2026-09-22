package Comandas;

public abstract class Comanda {

    protected String cliente;
    protected double subtotal;

    public Comanda(String cliente, double subtotal) {
        this.cliente = cliente;
        this.subtotal = subtotal;
    }

    public abstract double total();

    public abstract void mostrarComanda();
}