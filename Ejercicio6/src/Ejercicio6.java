class Empleado {
    private String nombre;
    private String cargo;
    private double salarioBase;
    private int horasExtras;
    private static final double VALOR_HORA_EXTRA = 20000;

    public Empleado(String nombre, String cargo, double salarioBase, int horasExtras) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.salarioBase = salarioBase;
        this.horasExtras = horasExtras;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salario base: " + salarioBase);
        System.out.println("Horas extras: " + horasExtras);
    }

    public double calcularSalarioFinal() {
        return salarioBase + (horasExtras * VALOR_HORA_EXTRA);
    }
}

public class Ejercicio6 {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Cristhian Rodriguez", "Electrisista", 2000000, 8);
        empleado.mostrarInformacion();
        System.out.println("Salario final: " + empleado.calcularSalarioFinal());
    }
}
