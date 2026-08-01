class Libro {
    private String titulo;
    private String autor;
    private int numeroPaginas;

    public Libro(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    public void mostrarInformacion() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Numero de paginas: " + numeroPaginas);
    }
}

public class Ejercicio1 {
    public static void main(String[] args) {
        Libro libro = new Libro("Cien años de soledad", "Gabriel Garcia Marquez", 471);
        libro.mostrarInformacion();
    }
}
