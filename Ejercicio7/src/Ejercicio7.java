class Mascota {
    private String nombre;
    private String especie;
    private int edad;
    private double peso;
    private String propietario;

    public Mascota(String nombre, String especie, int edad, double peso, String propietario) {
        if (edad < 0) {
            throw new IllegalArgumentException("La edad no puede ser negativa.");
        }
        if (peso < 0) {
            throw new IllegalArgumentException("El peso no puede ser negativo.");
        }
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.peso = peso;
        this.propietario = propietario;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad);
        System.out.println("Peso: " + peso);
        System.out.println("Propietario: " + propietario);
    }

    public void registrarConsulta(String motivo) {
        System.out.println("Consulta registrada para " + nombre + ". Motivo: " + motivo);
    }
}

public class Ejercicio7 {
    public static void main(String[] args) {
        Mascota mascota = new Mascota("Luna", "Perro", 3, 16.2, "katherin Calderon");
        mascota.mostrarInformacion();
        mascota.registrarConsulta("Vacunacion contra la rabia");
    }
}
