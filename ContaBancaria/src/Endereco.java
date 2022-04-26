package ControlerViewer;

public class Endereco{
	protected String municipio, estado, bairro;
	protected int cep, numCasa;
	Pessoa residente;
	
	public Endereco (Pessoa residente, String municipio, String estado, String bairro, int cep, int numCasa) {
		this.residente = residente;
		this.municipio = municipio;
		this.estado = estado;
		this.bairro = bairro;
		this.cep = cep;
		this.numCasa = numCasa;
	}
}
