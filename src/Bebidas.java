public class Bebidas extends Producto {
    private String tamanio;

    public Bebidas(String nombre, double precio, String categoria, String tamanio) {
        super(nombre, precio, categoria);
        this.tamanio = tamanio;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public String mostrarInfo() {
        return getNombre() + " (" + tamanio + ") - " + String.format("%.2f", getPrecio()) + " €";
    }
}