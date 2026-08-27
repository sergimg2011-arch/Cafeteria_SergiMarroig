import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Clase principal que actúa como punto de entrada de la aplicación de la cafetería.
 * Se encarga de gestionar el flujo interactivo de la consola para la creación
 * de clientes, camareros, interacción con el menú de productos y generación del ticket final.
 *
 * @author TuNombre
 * @version 1.0
 */
public class Main {

    /**
     * Método principal que ejecuta la lógica de la cafetería.
     * Permite registrar al cliente y al camarero, mostrar el menú disponible,
     * seleccionar productos para añadirlos al ticket y aplicar descuentos mediante código.
     *
     * @param args Argumentos de la línea de comandos (no utilizados en esta aplicación).
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nombre del cliente: ");
        Cliente cliente = new Cliente(sc.nextLine());
        System.out.print("Nombre del camarero: ");
        Camarero camarero = new Camarero(sc.nextLine());
        ArrayList<Producto> menu = new ArrayList();
        menu.add(new Bebidas("Café", (double)1.5F, "Bebida caliente", "mediano"));
        menu.add(new Bebidas("Refresco", (double)2.0F, "Bebida fría", "grande"));
        menu.add(new Comida("Bocadillo de jamón", 3.2, "Bocadillo", false));
        menu.add(new Comida("Pizza", (double)4.5F, "Plato caliente", true));
        Ticket ticket = new Ticket();

        int opcion;
        do {
            System.out.println();
            System.out.println("----- MENÚ -----");

            for(int i = 0; i < menu.size(); ++i) {
                System.out.println(i + 1 + ". " + ((Producto)menu.get(i)).mostrarInfo());
            }

            System.out.println("0. Terminar pedido");
            System.out.print("Elige un producto: ");
            opcion = sc.nextInt();
            if (opcion >= 1 && opcion <= menu.size()) {
                ticket.agregarproductos((Producto)menu.get(opcion - 1));
                System.out.println("Añadido al ticket.");
            } else if (opcion != 0) {
                System.out.println("Opción no válida.");
            }
        } while(opcion != 0);

        System.out.println();
        System.out.println("Cliente: " + cliente.getNombre());
        System.out.println("Atendido por: " + camarero.getNombre());
        System.out.println();
        ticket.mostrarTicket();
        System.out.println();
        System.out.print("¿Aplicar descuento a algún producto? (s/n): ");
        sc.nextLine();
        String respuesta = sc.nextLine();
        if (respuesta.equalsIgnoreCase("s")) {
            System.out.print("Número del producto en el ticket (1 a " + menu.size() + "): ");
            int idx = sc.nextInt() - 1;
            sc.nextLine();
            System.out.print("Introduce el código de descuento: ");
            String codigo = sc.nextLine();
            if (codigo.equals("JoseApruebame")) {
                double precioConDescuento = ((Producto)menu.get(idx)).aplicarDescuento((double)10.0F);
                System.out.println("Código válido. Descuento del 10% aplicado.");
                PrintStream var10000 = System.out;
                Object[] var10002 = new Object[]{precioConDescuento};
                var10000.println("Precio con descuento: " + String.format("%.2f", var10002) + " €");
            } else {
                System.out.println("Código no válido. No se aplica descuento.");
            }
        }

    }
}