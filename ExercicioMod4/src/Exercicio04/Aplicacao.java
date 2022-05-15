package Exercicio04;

public class Aplicacao {
	public static void main(String[] args) {
		
		Turma turmaFG = new Turma();
		
		Aluno gabriela = new Aluno();
		Aluno jhonathan = new Aluno();
		Aluno yvan = new Aluno();
		
		turmaFG.aluno1 = gabriela;
		turmaFG.aluno2 = jhonathan;
		turmaFG.aluno3 = yvan;
		
		Prova gabrielaProva01 = new Prova();
		gabrielaProva01.notaParte1 = 5.5;
		gabrielaProva01.notaParte2 = 3.0;
		gabriela.prova1 = gabrielaProva01;
		
		Prova gabrielaProva02 = new Prova();
		gabrielaProva02.notaParte1 = 3.0;
		gabrielaProva02.notaParte2 = 1.0;
		gabriela.prova2 = gabrielaProva02;
		
		
		Prova jhonathanProva01 = new Prova();
		jhonathanProva01.notaParte1 = 3.9;
		jhonathanProva01.notaParte2 = 4.0;
		jhonathan.prova1 = jhonathanProva01;
		
		Prova jhonathanProva02 = new Prova();
		jhonathanProva02.notaParte1 = 4.3;
		jhonathanProva02.notaParte2 = 3.3;
		jhonathan.prova2 = jhonathanProva02;
		
		Prova yvanProva01 = new Prova();
		yvanProva01.notaParte1 = 2.0;
		yvanProva01.notaParte2 = 0.5;
		yvan.prova1 = yvanProva01;
		
		Prova yvanProva02 = new Prova();
		yvanProva02.notaParte1 = 5.0;
		yvanProva02.notaParte2 = 4.0;
		yvan.prova2 = yvanProva02;
		
		System.out.println("Aluno(a): Gabriela | Média: " + gabriela.calcularMedia());
		System.out.println("Aluno(a): Jhonathan | Média: " + jhonathan.calcularMedia());
		System.out.println("Aluno(a): Yvan | Média: " + yvan.calcularMedia() + "\n");
		System.out.printf("Média da TurmaFG: %.02f", turmaFG.calcularMedia());
		
	}
}
