package Exercicio01;

public class Quadrado implements AreaCalculavel {
	
	private double l;
	
	public double getL() {
		return l;
	}

	public void setL(double l) {
		this.l = l;
	}
	
	public Quadrado(double lado) {
		l = lado;
	}

	@Override
	public void calcularArea() {
		
		double area = l*l;
		System.out.printf("A �rea deste quadrado �: %.2fcm \n",area);
	}

	@Override
	public void perimetro() {
		
		double p = l*4;
		System.out.printf("O per�metro deste quadrado �: %.2fcm \n\n",p);
	}
	
	
}
