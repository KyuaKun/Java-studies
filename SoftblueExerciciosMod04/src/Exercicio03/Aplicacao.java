package Exercicio03;

public class Aplicacao {
	public static void main(String[] args) {
		Triangulo tri1 = new Triangulo();
		tri1.altura = 23.5;
		tri1.base = 8;
		
		Quadrado quad1 = new Quadrado();
		quad1.lado = 46.5;
		
		Trapezio trap1 = new Trapezio();
		trap1.bm = 5;
		trap1.bM = 6;
		trap1.h = 7;
		
		Circunferencia circu1 = new Circunferencia();
		circu1.raio = 46.3;
		
		System.out.println("A �rea do tri�ngulo �: "+ tri1.calcularArea());
		System.out.println("A �rea do quadrado �: "+ quad1.calcularArea());
		System.out.println("A �rea do trap�zio �: "+ trap1.calcularArea());
		System.out.println("A �rea do circulo �: "+ circu1.calcularArea());
		
	}
}
