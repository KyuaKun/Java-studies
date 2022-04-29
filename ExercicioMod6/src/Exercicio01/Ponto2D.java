package Exercicio01;

public class Ponto2D {

	double coordenadaX;
	double coordenadaY;

	public Ponto2D(Double x, Double y) {
		coordenadaX = x;
		coordenadaY = y;
	}

	@Override
	public String toString() {
		return "[CoordenadaX: " + coordenadaX + "][CoordenadaY: " + coordenadaY + "]";
	}

}
