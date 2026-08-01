class CuentaBancaria {
    private String numeroCuenta;
    private String nombreTitular;
    private double saldo;

    public CuentaBancaria(String numeroCuenta, String nombreTitular, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.nombreTitular = nombreTitular;
        this.saldo = saldo;
    }

    public void mostrarInformacion() {
        System.out.println("Numero de cuenta: " + numeroCuenta);
        System.out.println("Titular: " + nombreTitular);
        System.out.println("Saldo: " + saldo);
    }

    public void depositar(double monto) {
        saldo += monto;
    }

    public void retirar(double monto) {
        if (monto <= saldo) {
            saldo -= monto;
        } else {
            System.out.println("Fondos insuficientes.");
        }
    }
}

public class Ejercicio4 {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("5445152481", "Sebastian Calderon", 2000000);
        cuenta.mostrarInformacion();
        cuenta.depositar(500000);
        cuenta.retirar(200000);
        cuenta.mostrarInformacion();
    }
}
