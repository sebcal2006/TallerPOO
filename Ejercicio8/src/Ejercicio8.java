class Plato {
    private String nombre;
    private double precio;

    public Plato(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }
}

class Pedido {
    private int numero;
    private String fecha;
    private String cliente;
    private Plato plato;

    public Pedido(int numero, String fecha, String cliente, Plato plato) {
        this.numero = numero;
        this.fecha = fecha;
        this.cliente = cliente;
        this.plato = plato;
    }

    public void mostrarInformacion() {
        System.out.println("Numero de pedido: " + numero);
        System.out.println("Fecha: " + fecha);
        System.out.println("Cliente: " + cliente);
        System.out.println("Plato: " + plato.getNombre());
        System.out.println("Precio: " + plato.getPrecio());
    }
}

public class Ejercicio8 {
    public static void main(String[] args) {
        Plato plato = new Plato("Arroz con pollo", 20000);
        Pedido pedido = new Pedido(777, "2026-07-31", "Juan Cuellar", plato);
        pedido.mostrarInformacion();
    }
}
