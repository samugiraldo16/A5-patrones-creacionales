package Comandas;

public class FactorySalon extends FactoryComanda {

    @Override
    public Comanda crearComanda() {

        return new Salon(
                "Samuel",
                40000,
                5,
                "Andres"
        );
    }
}