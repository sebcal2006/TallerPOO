class Vehiculo {
    private String placa;
    private String marca;
    private String modelo;
    private double combustible;
    private boolean encendido;

    public Vehiculo(String placa, String marca, String modelo, double combustible) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.combustible = combustible;
        this.encendido = false;
    }

    public void mostrarInformacion() {
        System.out.println("Placa: " + placa);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Combustible: " + combustible);
        System.out.println("Encendido: " + encendido);
    }

    public void encender() {
        encendido = true;
    }

    public void apagar() {
        encendido = false;
    }

    public void registrarRecorrido(double combustibleConsumido) {
        if (!encendido) {
            System.out.println("El vehiculo debe estar encendido para recorrer.");
            return;
        }
        if (combustibleConsumido <= combustible) {
            combustible -= combustibleConsumido;
        } else {
            System.out.println("Combustible insuficiente para el recorrido.");
        }
    }
}

public class Ejercicio5 {
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo("DJS525", "Mazda", "323", 40);
        vehiculo.mostrarInformacion();
        vehiculo.encender();
        vehiculo.registrarRecorrido(10);
        vehiculo.apagar();
        vehiculo.mostrarInformacion();
    }
}
