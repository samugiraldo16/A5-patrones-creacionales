package Ejer5;



public class MainEjer5 {

    public static void main(String[] args) {

        Vehiculo carro = new VehiculoBuilder("Carro", "ABC123")
                .color("naranja")
                .capacidad(5)
                .accesorios("ventilador")
                .build();

        System.out.println(" Vehículo original ");
        carro.mostrarInformacion();

        Vehiculo copia = carro.clonar();

        copia.cambiarColor("rojo");

        System.out.println("\n Vehículo personalizado ");
        copia.mostrarInformacion();

        if (carro != copia) {
            System.out.println("\nEl vehículo clonado es un objeto diferente al original.");
        }
    }
}
