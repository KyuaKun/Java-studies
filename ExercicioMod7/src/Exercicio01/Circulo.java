package Exercicio01;

public class Circulo implements AreaCalculavel {
	
	private double raio;
	private static double PI = 3.14;
	
	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	public static double getPI() {
		return PI;
	}

	public Circulo (double raio) {
		this.raio = raio;
	}
	
	@Override
	public void calcularArea() {
		
		double area = PI * (raio*2);
		System.out.printf("A area desta circunferência é: %.02fcm \n", area);
	}

	@Override
	public void perimetro() {
			
		System.out.println("Não há perímetro para uma circunferência. \n");
	}

}
