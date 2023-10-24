import java.util.List;

public class Main {
    public static void main(String[] args) {
        LibroRepository libroRepository = new LibroRepositoryImpl();

        Libro libro1 = new Libro(1, "El Libro 1", "Autor 1");
        Libro libro2 = new Libro(2, "El Libro 2", "Autor 2");

        libroRepository.guardarLibro(libro1);
        libroRepository.guardarLibro(libro2);

        System.out.println("Lista de libros:");
        List<Libro> libros = libroRepository.listarLibros();
        for (Libro libro : libros) {
            System.out.println(libro);
        }

        int isbnABuscar = 1;
        Libro libroEncontrado = libroRepository.obtenerLibro(isbnABuscar);
        if (libroEncontrado != null) {
            System.out.println("Libro encontrado: " + libroEncontrado);
        } else {
            System.out.println("Libro no encontrado");
        }

        int isbnAEliminar = 2;
        libroRepository.eliminarLibro(isbnAEliminar);

        System.out.println("Lista de libros después de eliminar:");
        libros = libroRepository.listarLibros();
        for (Libro libro : libros) {
            System.out.println(libro);
        }
    }
}
