package Exercicio01;

public class Ponto3D extends Ponto2D {

	double coordenadaZ;

	public Ponto3D(Double x, Double y, Double z) {
		super(x, y);
		coordenadaZ = z;
	}

	@Override
	public String toString() {
		return "[CoordenadaX: " + coordenadaX + "][CoordenadaY: " + coordenadaY + "][CoordenadaZ: " + coordenadaZ + "]";
	}
}
