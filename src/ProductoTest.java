import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProductoTest {

    private Bebidas refresco;
    private Comida bocadillo;

    @BeforeEach
    public void setUp() {
        refresco = new Bebidas("Refresco", 2.00, "Bebida fría", "grande");
        bocadillo = new Comida("Bocadillo de jamón", 3.20, "Bocadillo", false);
    }

    @AfterEach
    public void tearDown() {
        refresco = null;
        bocadillo = null;
    }

    @Test
    public void testAplicarDescuentoCorrecto_CasoPositivo() {
        double precioConDescuento = refresco.aplicarDescuento(10.0);
        assertEquals(1.80, precioConDescuento, 0.001, "El descuento del 10% no se ha calculado correctamente");
    }

    @Test
    public void testAplicarDescuentoInvalidoOIncorrecto_CasoNegativo() {
        double precioConDescuento = bocadillo.aplicarDescuento(50.0);
        assertNotEquals(3.20, precioConDescuento, "El precio debería haber cambiado tras aplicar el descuento");
    }

    @Test
    public void testMostrarInfoComidaFria_CasoPositivo() {
        String info = bocadillo.mostrarInfo();
        assertTrue(info.contains("frío"), "El bocadillo debería indicar que es un plato frío");
    }
}