package Exercicio01;

public class Retangulo implements AreaCalculavel {
	private double b;
	private double h;
		
	public double getBase() {
		return b;
	}

	public void setBase(double b) {
		this.b = b;
	}

	public double getAltura() {
		return h;
	}

	public void setAltura(double h) {
		this.h = h;
	}

	public Retangulo(double altura, double base) {
		this.h = altura;
		this.b = base;
	}
	
	@Override
	public void calcularArea() {
		double area = (b*h);
		System.out.printf("A área deste retângulo é: %.2fcm \n",area);
	}

	@Override
	public void perimetro() {
		double p = 2*(b+h);
		System.out.printf("O perímetro deste retângulo é: %.2fcm \n\n",p);
	}

}
