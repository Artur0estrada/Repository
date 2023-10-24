import java.util.List;

public interface LibroRepository {
    void guardarLibro(Libro libro);

    Libro obtenerLibro(int isbn);

    List<Libro> listarLibros();

    void eliminarLibro(int isbn);
}
