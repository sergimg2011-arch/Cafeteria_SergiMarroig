import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TicketTest {

    private Ticket ticket;
    private Bebidas cafe;
    private Comida pizza;

    @BeforeEach
    public void setUp() {
        ticket = new Ticket();
        cafe = new Bebidas("Café", 1.50, "Bebida caliente", "mediano");
        pizza = new Comida("Pizza", 4.50, "Plato caliente", true);
    }

    @AfterEach
    public void tearDown() {
        ticket = null;
        cafe = null;
        pizza = null;
    }

    @Test
    public void testCalcularTotalTicketVacio_CasoNegativo() {
        double total = ticket.calcularTotal();
        assertEquals(0.0, total, 0.001, "El total de un ticket vacío debería ser 0.0");
    }

    @Test
    public void testAgregarProductosYCalcularTotal_CasoPositivo() {
        ticket.agregarproductos(cafe);
        ticket.agregarproductos(pizza);

        double totalEsperado = 6.00;
        assertEquals(totalEsperado, ticket.calcularTotal(), 0.001, "El cálculo del total del ticket es incorrecto");
    }

    @Test
    public void testCalcularTotalNoCoincide_CasoNegativo() {
        ticket.agregarproductos(cafe);

        double totalIncorrecto = 5.00;
        assertNotEquals(totalIncorrecto, ticket.calcularTotal(), "El total no debería ser 5.00 € para un solo café de 1.50 €");
    }
}