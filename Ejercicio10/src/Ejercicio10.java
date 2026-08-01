import java.util.ArrayList;
import java.util.List;

class Cliente {
    private String nombre;
    private String correo;
    private String numeroIdentificacion;

    public Cliente(String nombre, String correo, String numeroIdentificacion) {
        this.nombre = nombre;
        this.correo = correo;
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }
}

class ProductoCompra {
    private String nombre;
    private double precio;
    private int cantidadComprada;

    public ProductoCompra(String nombre, double precio, int cantidadComprada) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadComprada = cantidadComprada;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidadComprada() {
        return cantidadComprada;
    }

    public double calcularSubtotal() {
        return precio * cantidadComprada;
    }
}

class Compra {
    private int numero;
    private String fecha;
    private Cliente cliente;
    private List<ProductoCompra> productos;

    public Compra(int numero, String fecha, Cliente cliente) {
        this.numero = numero;
        this.fecha = fecha;
        this.cliente = cliente;
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(ProductoCompra producto) {
        productos.add(producto);
    }

    public void mostrarInformacion() {
        System.out.println("Numero de compra: " + numero);
        System.out.println("Fecha: " + fecha);
        System.out.println("Cliente: " + cliente.getNombre());
        System.out.println("Correo: " + cliente.getCorreo());
        System.out.println("Identificacion: " + cliente.getNumeroIdentificacion());
        System.out.println("Productos:");
        for (ProductoCompra producto : productos) {
            System.out.println(" - " + producto.getNombre() + " x" + producto.getCantidadComprada()
                    + " = " + producto.calcularSubtotal());
        }
        System.out.println("Total a pagar: " + calcularTotal());
    }

    public double calcularTotal() {
        double total = 0;
        for (ProductoCompra producto : productos) {
            total += producto.calcularSubtotal();
        }
        return total;
    }
}

public class Ejercicio10 {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Yudy Rodriguez", "yudyvalentinar@gmail.com", "1135854945");
        Compra compra = new Compra(85, "2026-07-31", cliente);
        compra.agregarProducto(new ProductoCompra("Labial", 10000, 1));
        compra.agregarProducto(new ProductoCompra("Brillo", 5000, 2));
        compra.mostrarInformacion();
    }
}
