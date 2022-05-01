package Exercicio01;

public class Aplicacao {
	public static void main(String[] args) {
		
		AreaCalculavel c = new Circulo(8.3);
		AreaCalculavel q = new Quadrado(7.8);
		AreaCalculavel r = new Retangulo(4.8, 5.1);
		AreaCalculavel t = new Trianguloiso(5.2, 8.7, 1.9);
		
		Propriedades p = new Propriedades();
		
		p.showPropriedades(c);
		p.showPropriedades(q);
		p.showPropriedades(r);
		p.showPropriedades(t);
	}
}
