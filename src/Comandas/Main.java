package Comandas;

public class Main {

    public static void main(String[] args) {

        // COMANDA PARA LLEVAR
        FactoryComanda paraLlevar = new FactoryParaLlevar();
        paraLlevar.generar();

        System.out.println();

        // COMANDA DOMICILIO
        FactoryComanda domicilio = new FactoryDomicilio();
        domicilio.generar();

        System.out.println();

        // COMANDA SALÓN
        FactoryComanda salon = new FactorySalon();
        salon.generar();
    }
}