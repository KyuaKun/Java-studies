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
		
		System.out.println("A área do triângulo é: "+ tri1.calcularArea());
		System.out.println("A área do quadrado é: "+ quad1.calcularArea());
		System.out.println("A área do trapézio é: "+ trap1.calcularArea());
		System.out.println("A área do circulo é: "+ circu1.calcularArea());
		
	}
}
