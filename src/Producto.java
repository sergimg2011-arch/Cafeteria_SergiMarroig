/**
 * Clase abstracta que representa un producto genérico dentro del menú de la cafetería.
 * Sirve como clase base para tipos específicos de productos (como Bebidas o Comida)
 * e implementa la interfaz {@link Descontable} para la gestión de promociones.
 *
 * @author TuNombre
 * @version 1.0
 */
public abstract class Producto implements Descontable {

    /** Nombre del producto. */
    private String nombre;

    /** Precio base del producto en euros. */
    private double precio;

    /** Categoría a la que pertenece el producto (ej. Bebida caliente, Bocadillo, etc.). */
    private String categoria;

    /**
     * Constructor para inicializar los atributos principales de un producto.
     *
     * @param nombre    El nombre del producto.
     * @param precio    El precio base del producto.
     * @param categoria La categoría del producto.
     */
    public Producto(String nombre, double precio, String categoria) {
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
    }

    /**
     * Obtiene el nombre del producto.
     *
     * @return El nombre del producto.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece o modifica el nombre del producto.
     *
     * @param nombre El nuevo nombre del producto.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el precio actual del producto.
     *
     * @return El precio en euros.
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Establece o modifica el precio del producto.
     *
     * @param precio El nuevo precio del producto.
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Obtiene la categoría del producto.
     *
     * @return La categoría del producto.
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * Establece o modifica la categoría del producto.
     *
     * @param categoria La nueva categoría.
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /**
     * Devuelve una cadena con el nombre y el precio formateado del producto.
     *
     * @return Formato básico textual con el nombre y precio (ej. "Café - 1,50€").
     */
    public String mostratInformacion(){
        return nombre + " - " + String.format("%.2f", precio) + "€";
    }

    /**
     * Método abstracto para obtener la información detallada del producto.
     * Debe ser implementado por las subclases concretas según sus atributos específicos.
     *
     * @return Cadena de texto con la información detallada del producto.
     */
    public abstract String mostrarInfo();

    /**
     * Calcula y devuelve el precio final tras aplicar un porcentaje de descuento.
     *
     * @param porcentaje El porcentaje de descuento a aplicar (ej. 10.0 para un 10%).
     * @return El precio final reducido tras aplicar el descuento.
     */
    @Override
    public double aplicarDescuento(double porcentaje) {
        return precio - (precio * porcentaje / 100);
    }
}