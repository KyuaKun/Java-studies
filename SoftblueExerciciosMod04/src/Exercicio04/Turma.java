package Exercicio04;

public class Turma {
	Aluno aluno1, aluno2, aluno3;
	
	double calcularMedia() {
		double media = aluno1.calcularMedia() + aluno2.calcularMedia() + aluno3.calcularMedia();
		return media/3;
	}
}
