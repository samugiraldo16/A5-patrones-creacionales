package Comandas;

public class FactoryParaLlevar extends FactoryComanda {

    @Override
    public Comanda crearComanda() {

        return new ParaLlevar(
                "Samuel",
                25000,
                20,
                3
        );
    }
}