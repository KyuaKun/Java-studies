package entities;

import java.io.Serializable;

public class Produtos implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String nome;
	private double preco;
	private Integer quantidade;
	
	public Produtos(String nome, double preco, Integer quantidade) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	@Override
	public String toString() {
		return "Produtos [nome: " + nome + " | preco: " + preco + " | quantidade: " + quantidade + "]";
	}
	
	
}
