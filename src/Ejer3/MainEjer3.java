package Ejer3;

public class MainEjer3 {

    public static void main(String[] args) {

        // Crear un estudiante normal usando Builder
        Estudiante estudiante1 = new EstudianteBuilder(
                "Alejandro",
                "alejandro@gmail.com"
        )
                .telefono("3146695432")
                .direccion("Armenia")
                .intereses("Programación")
                .build();

        System.out.println("===== ESTUDIANTE 1 =====");
        estudiante1.mostrarInformacion();

        System.out.println();


        // Crear otro estudiante normal usando Builder
        Estudiante estudiante2 = new EstudianteBuilder(
                "Sofia",
                "sofia@gmail.com"
        )
                .telefono("3155555555")
                .intereses("Diseño")
                .build();

        System.out.println("===== ESTUDIANTE 2 =====");
        estudiante2.mostrarInformacion();

        System.out.println();


        // Crear un estudiante Premium
        Estudiante estudiantePremium = new EstudiantePremium(
                "Raul",
                "raul@gmail.com",
                "3109876543",
                "Pereira",
                "Videojuegos",
                "Oro",
                "20%"
        );

        System.out.println("===== ESTUDIANTE PREMIUM =====");
        estudiantePremium.mostrarInformacion();

        System.out.println();


    }
}