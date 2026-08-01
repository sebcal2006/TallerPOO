class EstudianteU {
    private String nombre;
    private String codigo;

    public EstudianteU(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCodigo() {
        return codigo;
    }
}

class Asignatura {
    private String nombre;
    private int creditos;

    public Asignatura(String nombre, int creditos) {
        this.nombre = nombre;
        this.creditos = creditos;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCreditos() {
        return creditos;
    }
}

class Inscripcion {
    private EstudianteU estudiante;
    private Asignatura asignatura;

    public Inscripcion(EstudianteU estudiante, Asignatura asignatura) {
        this.estudiante = estudiante;
        this.asignatura = asignatura;
    }

    public void mostrarInformacion() {
        System.out.println("Estudiante: " + estudiante.getNombre());
        System.out.println("Codigo: " + estudiante.getCodigo());
        System.out.println("Asignatura: " + asignatura.getNombre());
        System.out.println("Creditos: " + asignatura.getCreditos());
    }
}

public class Ejercicio9 {
    public static void main(String[] args) {
        EstudianteU estudiante = new EstudianteU("Alfaro Corrales", "EST-2026-17");
        Asignatura asignatura = new Asignatura("Cocina", 5);
        Inscripcion inscripcion = new Inscripcion(estudiante, asignatura);
        inscripcion.mostrarInformacion();
    }
}
