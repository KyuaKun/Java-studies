package Exercicio04;

public class Aplicacao {
	public static void main(String[] args) {
		
		Turma turmaFG = new Turma();
		
		Aluno aluno01 = new Aluno();
		Aluno aluno02 = new Aluno();
		Aluno aluno03 = new Aluno();
		
		turmaFG.aluno1 = aluno01;
		turmaFG.aluno2 = aluno02;
		turmaFG.aluno3 = aluno03;
		
		Prova prova = new Prova();
	}
}
