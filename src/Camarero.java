/**
 * Clase que representa a un camarero de la cafetería.
 * Guarda la información del empleado que atiende y procesa los pedidos.
 *
 * @author TuNombre
 * @version 1.0
 */
public class Camarero {

    /** Nombre del camarero. */
    private String nombre;

    /**
     * Constructor para inicializar un camarero con su nombre.
     *
     * @param nombre El nombre del camarero.
     */
    public Camarero(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el nombre del camarero.
     *
     * @return El nombre del camarero.
     */
    public String getNombre() {
        return nombre;
    }
}