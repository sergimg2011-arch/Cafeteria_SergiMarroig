import java.util.ArrayList;

public class Ticket {
    private ArrayList<Producto> productos;

    public Ticket() {
        productos = new ArrayList<>();
    }

    public void agregarproductos (Producto producto) {
        productos.add(producto);
    }

    public double calcularTotal() {
        double total = 0;
        for (Producto producto : productos) {
            total += producto.getPrecio();
        }


        return total;
    }

    public void mostrarTicket () {
        System.out.println("----- TICKET -----");

        for (Producto producto : productos) {
            System.out.println(producto.getNombre());
        }
        System.out.println("------------------");
        System.out.println("Total: " + String.format("%.2f", calcularTotal()) + " €");

    }




}