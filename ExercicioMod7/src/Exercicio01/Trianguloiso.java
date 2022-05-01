package Exercicio01;

public class Trianguloiso implements AreaCalculavel{

	private double h;
	private double l;
	private double b;
	
	
	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getH() {
		return h;
	}

	public void setH(double h) {
		this.h = h;
	}

	public double getL() {
		return l;
	}

	public void setL(double l) {
		this.l = l;
	}

	public Trianguloiso(Double lado, double altura, double base) {
		
		l = lado;
		h = altura;
		b = base;
	}
	
	@Override
	public void calcularArea() {
		
		double area = b*h/2;
		System.out.printf("A área deste triângulo é: %.2fcm \n",area);
	}

	@Override
	public void perimetro() {
		
		double p = b + 2*l;
		System.out.printf("O perímetro deste triângulo é: %.2fcm \n\n", p);
	}

}
