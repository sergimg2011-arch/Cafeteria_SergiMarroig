/**
 * Clase que representa un producto de tipo comida dentro de la cafetería.
 * Hereda de la clase abstracta {@link Producto} e incluye un indicador sobre si el plato se sirve caliente o frío.
 *
 * @author TuNombre
 * @version 1.0
 */
public class Comida extends Producto {

    /** Indica si la comida debe servirse caliente (true) o fría (false). */
    private boolean esCaliente;

    /**
     * Constructor para inicializar los atributos de la comida, incluidos
     * los heredados de la clase base Producto.
     *
     * @param nombre     El nombre del plato o comida.
     * @param precio     El precio de la comida en euros.
     * @param categoria  La categoría del plato (ej. Bocadillo, Plato caliente).
     * @param esCaliente Indica si la comida se sirve caliente (true) o no (false).
     */
    public Comida(String nombre, double precio, String categoria, boolean esCaliente) {
        super(nombre, precio, categoria);
        this.esCaliente = esCaliente;
    }

    /**
     * Obtiene el estado de la temperatura de la comida.
     *
     * @return {@code true} si la comida se sirve caliente, {@code false} si se sirve fría.
     */
    public boolean isEsCaliente() {
        return esCaliente;
    }

    /**
     * Establece o modifica si la comida se debe servir caliente.
     *
     * @param esCaliente {@code true} para caliente, {@code false} para frío.
     */
    public void setEsCaliente(boolean esCaliente) {
        this.esCaliente = esCaliente;
    }

    /**
     * Devuelve una cadena detallada con el nombre, la temperatura ("caliente" o "frío") y el precio.
     * Implementa el método abstracto heredado de {@link Producto}.
     *
     * @return Cadena con el formato: "Nombre (caliente/frío) - Precio €".
     */
    @Override
    public String mostrarInfo() {
        String tipo = esCaliente ? "caliente" : "frío";
        return getNombre() + " (" + tipo + ") - " + String.format("%.2f", getPrecio()) + " €";
    }
}