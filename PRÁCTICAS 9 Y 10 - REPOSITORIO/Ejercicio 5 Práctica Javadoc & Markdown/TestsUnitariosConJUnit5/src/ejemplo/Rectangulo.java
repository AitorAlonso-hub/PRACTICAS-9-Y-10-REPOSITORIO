package ejemplo;

/**
 * Clase que representa un rectángulo.
 * @author Aitor Alonso Peña
 * @version 1.0
 */
public class Rectangulo {

	private static final int FACTOR_PERIMETRO = 2;
	private int ancho;
	private int alto;

	/**
	 * Constructor para la clase Rectangulo.
	 * @param ancho El ancho del rectángulo.
	 * @param alto El alto del rectángulo.
	 */
	public Rectangulo(int ancho, int alto) {
		this.ancho = ancho;
		this.alto = alto;
	}

	/**
	 * Realiza la validación de los parámetros del rectángulo.
	 * @return -1 si son negativos, 0 si alguno es cero, 1 si son válidos.
	 */
	private int checkParameters() {
		if (ancho < 0 || alto < 0) {
			return -1;
		}
		if (ancho == 0 || alto == 0) {
			return 0;
		}
		return 1;
	}

	/**
	 * Calcula la superficie (área) del rectángulo.
	 * @return El área calculada o código de error (0 o -1).
	 */
	public int surface() {
		int validation = checkParameters();
		if (validation <= 0) return validation;
		
		return ancho * alto;
	}

	/**
	 * Calcula el perímetro del rectángulo.
	 * @return El perímetro calculado o código de error (0 o -1).
	 */
	public int perimeter() {
		int validation = checkParameters();
		if (validation <= 0) return validation;
		
		return FACTOR_PERIMETRO * ancho + FACTOR_PERIMETRO * alto;
	}
}
