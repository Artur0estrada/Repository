import java.util.ArrayList;
import java.util.List;

public class LibroRepositoryImpl implements LibroRepository {
    private List<Libro> libros = new ArrayList<>();

    @Override
    public void guardarLibro(Libro libro) {
        libros.add(libro);
    }

    @Override
    public Libro obtenerLibro(int isbn) {
        for (Libro libro : libros) {
            if (libro.getIsbn() == isbn) {
                return libro;
            }
        }
        return null;
    }

    @Override
    public List<Libro> listarLibros() {
        return libros;
    }

    @Override
    public void eliminarLibro(int isbn) {
        libros.removeIf(libro -> libro.getIsbn() == isbn);
    }
}
