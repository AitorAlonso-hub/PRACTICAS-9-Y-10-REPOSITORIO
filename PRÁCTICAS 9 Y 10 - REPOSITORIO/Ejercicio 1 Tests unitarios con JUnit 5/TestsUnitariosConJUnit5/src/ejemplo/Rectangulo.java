package ejemplo;

public class Rectangulo {

	private int ancho;
		
	private int alto;
	
	public Rectangulo(int ancho, int alto) {
		this.ancho = ancho;
		this.alto = alto;
	}
	
	public int area() {
		// Si alguno es negativo, devuelve -1
        if (ancho < 0 || alto < 0) {
            return -1;
        }
        // Si alguno es cero, devuelve 0
        if (ancho == 0 || alto == 0) {
            return 0;
        }
        return ancho * alto; // Corregido el asterisco
    }
	
	public int perimetro() {
		// Misma lógica para el perímetro
        if (ancho < 0 || alto < 0) {
            return -1;
        }
        if (ancho == 0 || alto == 0) {
            return 0;
        }
        return 2 * ancho + 2 * alto;
    }

}
