package ejemplo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class RectanguloTest {

    @Test
    void testCasuisticas() {
        Rectangulo rPositivo = new Rectangulo(3, 4);
        Rectangulo rNegativo = new Rectangulo(-3, 4);
        Rectangulo rCero = new Rectangulo(0, 5);

        assertAll(
            () -> assertEquals(12, rPositivo.surface(), "Positivos: área"),
            () -> assertEquals(14, rPositivo.perimeter(), "Positivos: perímetro"),
            () -> assertEquals(-1, rNegativo.surface(), "Negativos: área debe ser -1"),
            () -> assertEquals(-1, rNegativo.perimeter(), "Negativos: perímetro debe ser -1"),
            () -> assertEquals(0, rCero.surface(), "Cero: área debe ser 0"),
            () -> assertEquals(0, rCero.perimeter(), "Cero: perímetro debe ser 0")
        );
    }

    @Test
    void testParaCoberturaTotal() {
        Rectangulo rPositivo = new Rectangulo(3, 4);
        assertEquals(12, rPositivo.surface());
        assertEquals(14, rPositivo.perimeter());

        Rectangulo rNegatio = new Rectangulo(-2, 5);
        assertEquals(-1, rNegatio.surface());
        assertEquals(-1, rNegatio.perimeter());

        Rectangulo rCero = new Rectangulo(0, 8);
        assertEquals(0, rCero.surface());
        assertEquals(0, rCero.perimeter());
    }
}
