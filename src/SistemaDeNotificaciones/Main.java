package SistemaDeNotificaciones;

public class Main {

    public static void main(String[] args) {

        FactoryNotificacion creadorEmail = new FactoryEmail();

        creadorEmail.enviarNotificacion(
                "sagibeta@uniquindio.edu.co",
                "Tiene una nueva actividad académica."
        );

        System.out.println();

        FactoryNotificacion creadorSMS = new FactorySMS();

        creadorSMS.enviarNotificacion(
                "+573143357688",
                "Tiene una nueva notificación académica."
        );

        System.out.println();

        FactoryNotificacion creadorPush =
                new FactoryPush(Prioridad.ALTA);

        creadorPush.enviarNotificacion(
                "Samuel",
                "Tiene una actividad pendiente."
        );
    }
}