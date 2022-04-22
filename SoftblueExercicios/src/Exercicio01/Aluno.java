package Exercicio01;

public class Aluno {
	 static String nome;
	 static Double notaB1;
	 static Double notaB2;
	 static Double notaB3;
	 final Integer PESO_B1 = 3;
	 final Integer PESO_B2 = 2;
	 final Integer PESO_B3 = 5;
//	 final Double MEDIA_DA_PROVA;
	
	public Aluno(String nome, Double notaB1, Double notaB2, Double notaB3) {
		Aluno.nome = nome;
		Aluno.notaB1 = notaB1;
		Aluno.notaB2 = notaB2;
		Aluno.notaB3 = notaB3;	
	}
	
//	static {
//		MEDIA_DA_PROVA = (notaB1*3) + (notaB2*2) + (notaB3*5)/3+2+5;
//	}
	
}
