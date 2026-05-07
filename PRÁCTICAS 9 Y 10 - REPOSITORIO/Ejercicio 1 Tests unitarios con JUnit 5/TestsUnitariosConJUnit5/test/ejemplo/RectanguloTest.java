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
            // Valores positivos
            () -> assertEquals(12, rPositivo.area(), "Positivos: área"),
            () -> assertEquals(14, rPositivo.perimetro(), "Positivos: perímetro"),
            
            // Valores negativos (debe devolver -1)
            () -> assertEquals(-1, rNegativo.area(), "Negativos: área debe ser -1"),
            () -> assertEquals(-1, rNegativo.perimetro(), "Negativos: perímetro debe ser -1"),
            
            // Valores cero (debe devolver 0)
            () -> assertEquals(0, rCero.area(), "Cero: área debe ser 0"),
            () -> assertEquals(0, rCero.perimetro(), "Cero: perímetro debe ser 0")
        );
	}

    @Test
    void testAsercionesErroneas() {
        Rectangulo r = new Rectangulo(3, 4);
        
        assertAll("Forzando fallos de prueba",
            () -> assertEquals(999, r.area(), "Este test fallará porque 3*4 no es 999"),
            () -> assertEquals(10, r.perimetro(), "Este test fallará porque el perímetro es 14")
        );
    }

}
