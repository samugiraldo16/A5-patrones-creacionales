package Comandas;

public class FactoryDomicilio extends FactoryComanda {

    @Override
    public Comanda crearComanda() {

        return new Domicilio(
                "Samuel",
                30000,
                "Calle 10 #20-30",
                "Carlos",
                5000
        );
    }
}