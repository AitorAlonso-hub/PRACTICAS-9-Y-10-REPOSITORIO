package ejemplo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RectangleTest {

	@Test
    void testCasuisticas() {
        Rectangle rPositivo = new Rectangle(3, 4);
        Rectangle rNegativo = new Rectangle(-3, 4);
        Rectangle rCero = new Rectangle(0, 5);

        assertAll(
            // Valores positivos
            () -> assertEquals(12, rPositivo.surface(), "Positivos: área"),
            () -> assertEquals(14, rPositivo.perimeter(), "Positivos: perímetro"),
            
            // Valores negativos (debe devolver -1)
            () -> assertEquals(-1, rNegativo.surface(), "Negativos: área debe ser -1"),
            () -> assertEquals(-1, rNegativo.perimeter(), "Negativos: perímetro debe ser -1"),
            
            // Valores cero (debe devolver 0)
            () -> assertEquals(0, rCero.surface(), "Cero: área debe ser 0"),
            () -> assertEquals(0, rCero.perimeter(), "Cero: perímetro debe ser 0")
        );
	}

	@Test
	void testParaCoberturaTotal() {
		// Valores positivos	    
		Rectangle rPositivo = new Rectangle(3, 4);
	    assertEquals(12, rPositivo.surface());
	    assertEquals(14, rPositivo.perimeter());

	    // Valores negativos (debe devolver -1)
	    Rectangle rNegatio = new Rectangle(-2, 5);
	    assertEquals(-1, rNegatio.surface());
	    assertEquals(-1, rNegatio.perimeter());

	    // Valores cero (debe devolver 0)
	    Rectangle rCero = new Rectangle(0, 8);
	    assertEquals(0, rCero.surface());
	    assertEquals(0, rCero.perimeter());
	}


}
