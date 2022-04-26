package ControlerViewer;

public class Pessoa {
	protected String eMail, nome, sobrenome;
	protected int idade, cpf, diaNasci, mesNasci, anoNasci;
	protected char sexo;
	
	public Pessoa(String nome, String sobrenome,String eMail, int cpf, int diaNasci, int mesNasci, int anoNasci, char sexo){
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.eMail = eMail;
		this.cpf = cpf;
		this.diaNasci = diaNasci;
		this.mesNasci = mesNasci;
		this.anoNasci = anoNasci;
		this.sexo = sexo;
	}
	
	void aniversario() {
		idade++;
	}
	void imprimirPessoa() {
		System.out.println("Nome completo: "+ nome + " " + sobrenome);
		System.out.printf("Data de Nascimento: %d/%d/%d", diaNasci, mesNasci, anoNasci);
		System.out.printf("\n");
		System.out.println("Idade: " + (idade = 2022 - anoNasci) + " anos");
		System.out.println("CPF: " + cpf);
		System.out.println("Sexo: " + sexo);
		System.out.println("E-mail: " + eMail);
	}
}
