package Comandas;

public abstract class FactoryComanda {

    public abstract Comanda crearComanda();

    public void generar() {
        Comanda comanda = crearComanda();
        comanda.mostrarComanda();
    }
}