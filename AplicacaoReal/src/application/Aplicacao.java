package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import entities.Produtos;


public class Aplicacao {
	
	public static void main(String[] args) {
		
		String arquivoProdutosEletronicos = "C:\\Users\\vinicin\\Desktop\\produtosEletronicos.txt";
		List<Produtos> list = new ArrayList<Produtos>();
		
		try (BufferedReader gerenciador = new BufferedReader(new FileReader(arquivoProdutosEletronicos))){
			
			String line = gerenciador.readLine();
			line = gerenciador.readLine();
			
			while (line != null) {
				
				String[] vetor = line.split(",");
				String nome = vetor[0];
				double preco = Double.parseDouble(vetor[1]);
				Integer quantidade = Integer.parseInt(vetor[2]);
				Produtos produto = new Produtos(nome, preco, quantidade);
				list.add(produto);
				line = gerenciador.readLine();
			}
			System.out.println("PRODUTOS: ");
			for (Produtos p : list) {
				System.out.println(p);
			}
		}
		catch (IOException erroIOE) {
			
			System.out.println("erro: "+ erroIOE.getLocalizedMessage());
		}
	}
}
