/**
 * Clase que representa a un cliente de la cafetería.
 * Almacena la información básica necesaria para identificar al cliente
 * asociado a un pedido o ticket.
 *
 * @author TuNombre
 * @version 1.0
 */
public class Cliente {

    /** Nombre del cliente. */
    private String nombre;

    /**
     * Constructor para inicializar un cliente con su nombre.
     *
     * @param nombre El nombre del cliente.
     */
    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el nombre del cliente.
     *
     * @return El nombre del cliente.
     */
    public String getNombre() {
        return nombre;
    }
}