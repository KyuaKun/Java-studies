package Exercicio01;

public class MediaAluno {
	static Double mediaDaProva;
	
	  public static void imprimirResultado(Aluno aluno)  {
		  mediaDaProva = (Aluno.notaB1*3) + (Aluno.notaB2*2) + (Aluno.notaB3*5)/(3+2+5);
		  System.out.println("Aluno : " + Aluno.nome + "\nNota 1° do bimestre: " + Aluno.notaB1 +
				  "\nNota 2° do bimestre: " + Aluno.notaB2 +
				  "\nNota 3° do bimestre: " + Aluno.notaB3+ "\nMédia final: " + MediaAluno.mediaDaProva);
	}
}
