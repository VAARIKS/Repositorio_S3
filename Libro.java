// Ejercicio 6: Libro
public class Libro {
    private String titulo;

    public Libro(String titulo) {
        this.titulo = titulo;
    }

    class Pagina {
        private String contenido;

        public Pagina(String contenido) {
            this.contenido = contenido;
        }

        public void mostrarContenido() {
            System.out.println("Libro: " + titulo);
            System.out.println("Contenido: " + contenido);
        }
    }

    public static void main(String[] args) {
        Libro libro = new Libro("Programación en Java");
        Libro.Pagina pagina = libro.new Pagina("Introducción a la programación orientada a objetos.");
        pagina.mostrarContenido();
    }
}
