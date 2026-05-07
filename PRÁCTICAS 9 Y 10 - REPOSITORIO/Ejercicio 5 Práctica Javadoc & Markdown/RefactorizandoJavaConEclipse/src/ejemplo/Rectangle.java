package ejemplo;

public class Rectangle {

	private static final int FACTOR_PERIMETRO = 2;
	private int ancho;
	private int alto;

	public Rectangle(int ancho, int alto) {
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

	public int surface() {
		int validation = checkParameters();
		if (validation <= 0) return validation;
		
		return ancho * alto;
	}

	public int perimeter() {
		int validation = checkParameters();
		if (validation <= 0) return validation;
		
		
		return FACTOR_PERIMETRO * ancho + FACTOR_PERIMETRO * alto;
	}

	
}
