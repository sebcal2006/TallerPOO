class Producto {
    private String nombre;
    private double precio;
    private int cantidad;

    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: " + precio);
        System.out.println("Cantidad: " + cantidad);
    }

    public double calcularValorTotal() {
        return precio * cantidad;
    }
}

public class Ejercicio3 {
    public static void main(String[] args) {
        Producto producto = new Producto("Frijol", 3500, 30);
        producto.mostrarInformacion();
        System.out.println("Valor total del inventario: " + producto.calcularValorTotal());
    }
}
