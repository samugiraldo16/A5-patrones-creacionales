package RegistroEstudiantes;



public class Main {

    public static void main(String[] args) {

        EmpresaTransporte empresa = new EmpresaTransporte();

        FactoryTicket fabrica = new FactoryUrbano();
        empresa.emitirTicket(fabrica, "Samuel");

        System.out.println();

        fabrica = new FactoryIntermunicipal();
        empresa.emitirTicket(fabrica, "Samuel");

        System.out.println();

        fabrica = new FactoryTuristico();
        empresa.emitirTicket(fabrica, "Samuel");
    }
}