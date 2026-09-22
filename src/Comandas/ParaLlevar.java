package Comandas;

public class ParaLlevar extends Comanda {

    private int tiempoEstimado;
    private int empaques;

    public ParaLlevar(String cliente, double subtotal,
                             int tiempoEstimado, int empaques) {

        super(cliente, subtotal);
        this.tiempoEstimado = tiempoEstimado;
        this.empaques = empaques;
    }

    @Override
    public double total() {
        return subtotal;
    }

    @Override
    public void mostrarComanda() {

        System.out.println("===== COMANDA PARA LLEVAR =====");
        System.out.println("Cliente: " + cliente);
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Tiempo estimado: " + tiempoEstimado + " minutos");
        System.out.println("Empaques necesarios: " + empaques);
        System.out.println("Total: $" + total());
    }
}