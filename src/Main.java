import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nombre del cliente: ");
        Cliente cliente = new Cliente(sc.nextLine());

        System.out.print("Nombre del camarero: ");
        Camarero camarero = new Camarero(sc.nextLine());

        ArrayList<Producto> menu = new ArrayList<>();
        menu.add(new Bebidas("Café", 1.50, "Bebida caliente", "mediano"));
        menu.add(new Bebidas("Refresco", 2.00, "Bebida fría", "grande"));
        menu.add(new Comida("Bocadillo de jamón", 3.20, "Bocadillo", false));
        menu.add(new Comida("Pizza", 4.50, "Plato caliente", true));

        Ticket ticket = new Ticket();
        int opcion;

        do {
            System.out.println();
            System.out.println("----- MENÚ -----");
            for (int i = 0; i < menu.size(); i++) {
                System.out.println((i + 1) + ". " + menu.get(i).mostrarInfo());
            }
            System.out.println("0. Terminar pedido");
            System.out.print("Elige un producto: ");
            opcion = sc.nextInt();

            if (opcion >= 1 && opcion <= menu.size()) {
                ticket.agregarproductos(menu.get(opcion - 1));
                System.out.println("Añadido al ticket.");
            } else if (opcion != 0) {
                System.out.println("Opción no válida.");
            }
        } while (opcion != 0);

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
                double precioConDescuento = menu.get(idx).aplicarDescuento(10);
                System.out.println("Código válido. Descuento del 10% aplicado.");
                System.out.println("Precio con descuento: " + String.format("%.2f", precioConDescuento) + " €");
            } else {
                System.out.println("Código no válido. No se aplica descuento.");
            }
        }
    }
}