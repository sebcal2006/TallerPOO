class Estudiante {
    private String nombre;
    private int edad;
    private String grado;

    public Estudiante(String nombre, int edad, String grado) {
        this.nombre = nombre;
        this.edad = edad;
        this.grado = grado;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Grado: " + grado);
    }
}

public class Ejercicio2 {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Sebastian Calderon", 19, "Once");
        estudiante.mostrarInformacion();
    }
}
