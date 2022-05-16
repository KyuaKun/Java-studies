package Exercicio01;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class Produto {
	
	private String nome;
	private double peso;
	private Date dataValidade;
	private static int ID  = 1;
	private static final DateFormat df = DateFormat.getDateInstance();
	
	public Produto () {
		
	}
	

	public Produto(String nome, double peso, int dia, int mes, int ano) {
		
		this.nome = nome;
		this.peso = peso;
		Calendar c = Calendar.getInstance();
		c.set(ano, mes + 1, dia);
		this.dataValidade = c.getTime();
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public Date getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(Date dataValidade) {
		this.dataValidade = dataValidade;
	}
	
	public String getFormattedDataValidate() {
		return df.format(dataValidade);
	}

	public static int getID() {
		return ID++;
	}


	public static void setID(int iD) {
		ID = iD;
	}


	public static DateFormat getDf() {
		return df;
	}
}
