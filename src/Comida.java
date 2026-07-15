public class Comida extends Producto {
    private boolean esCaliente;

    public Comida(String nombre, double precio, String categoria, boolean esCaliente) {
        super(nombre, precio, categoria);
        this.esCaliente = esCaliente;
    }

    public boolean isEsCaliente() {
        return esCaliente;
    }

    public void setEsCaliente(boolean esCaliente) {
        this.esCaliente = esCaliente;
    }

    @Override
    public String mostrarInfo() {
        String tipo = esCaliente ? "caliente" : "frío";
        return getNombre() + " (" + tipo + ") - " + String.format("%.2f", getPrecio()) + " €";
    }
}