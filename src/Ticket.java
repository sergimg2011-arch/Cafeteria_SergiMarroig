import java.util.ArrayList;

/**
 * Clase que representa el ticket de compra en la cafetería.
 * Se encarga de gestionar la lista de productos seleccionados por el cliente,
 * calcular el importe total y mostrar el desglose por consola.
 *
 * @author TuNombre
 * @version 1.0
 */
public class Ticket {

    /** Lista de productos incluidos en el ticket. */
    private ArrayList<Producto> productos;

    /**
     * Constructor que inicializa la lista vacía de productos del ticket.
     */
    public Ticket() {
        productos = new ArrayList<>();
    }

    /**
     * Añade un nuevo producto a la lista del ticket.
     *
     * @param producto El producto de tipo {@link Producto} que se desea agregar.
     */
    public void agregarproductos(Producto producto) {
        productos.add(producto);
    }

    /**
     * Calcula la suma total de los precios de todos los productos añadidos al ticket.
     *
     * @return El importe total acumulado en euros.
     */
    public double calcularTotal() {
        double total = 0;
        for (Producto producto : productos) {
            total += producto.getPrecio();
        }
        return total;
    }

    /**
     * Imprime por consola el desglose completo del ticket, mostrando el nombre
     * de cada producto y el total formateado a dos decimales.
     */
    public void mostrarTicket() {
        System.out.println("----- TICKET -----");

        for (Producto producto : productos) {
            System.out.println(producto.getNombre());
        }
        System.out.println("------------------");
        System.out.println("Total: " + String.format("%.2f", calcularTotal()) + " €");
    }
}