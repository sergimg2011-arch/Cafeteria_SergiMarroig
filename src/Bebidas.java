/**
 * Clase que representa un producto de tipo bebida dentro de la cafetería.
 * Hereda de la clase abstracta {@link Producto} e incluye el atributo específico de tamaño.
 *
 * @author TuNombre
 * @version 1.0
 */
public class Bebidas extends Producto {

    /** Tamaño de la bebida (ej. pequeño, mediano, grande). */
    private String tamanio;

    /**
     * Constructor para inicializar los atributos de la bebida, incluyendo
     * los heredados de la clase base Producto.
     *
     * @param nombre    El nombre de la bebida.
     * @param precio    El precio de la bebida en euros.
     * @param categoria La categoría de la bebida (ej. Bebida caliente, Bebida fría).
     * @param tamanio   El tamaño de la bebida.
     */
    public Bebidas(String nombre, double precio, String categoria, String tamanio) {
        super(nombre, precio, categoria);
        this.tamanio = tamanio;
    }

    /**
     * Obtiene el tamaño de la bebida.
     *
     * @return El tamaño actual de la bebida.
     */
    public String getTamanio() {
        return tamanio;
    }

    /**
     * Establece o modifica el tamaño de la bebida.
     *
     * @param tamanio El nuevo tamaño de la bebida.
     */
    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    /**
     * Devuelve una cadena detallada con el nombre, el tamaño y el precio de la bebida.
     * Implementa el método abstracto heredado de {@link Producto}.
     *
     * @return Cadena con el formato: "Nombre (Tamaño) - Precio €".
     */
    @Override
    public String mostrarInfo() {
        return getNombre() + " (" + tamanio + ") - " + String.format("%.2f", getPrecio()) + " €";
    }
}