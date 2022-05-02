package Exercicio03;

public class Porta implements Cloneable {

	private String qualPorta;
	private double altura;
	private double largura;
	private boolean aberta;
	
	public String getQualPorta() {
		return qualPorta;
	}
	
	public double getAltura() {
		return altura;
	}

	
	public double getLargura() {
		return largura;
	}

	
	public boolean isAberta() {
		return aberta;
	}

	
	public Porta(String qualPorta, double altura, double largura) {
		this.qualPorta = qualPorta;
		this.altura = altura;
		this.largura = largura;
		this.aberta = false;
	}
	
	
	public void abrir() {
		this.aberta = true;
	}
	
	
	public void fechar() {
		this.aberta = false;
	}
	
	public void estadoPorta() {
		if (this.aberta == true) {
			System.out.printf("A porta %s está aberta. \n", this.qualPorta);
		} else {
			System.out.printf("A porta %s está fechada. \n", this.qualPorta);
		}
	}
	
	
	public void imprimirDados() {
		System.out.printf("A porta %s tem %.2fm de altura e %.2fm de largura \n\n", getQualPorta(),
				getAltura(), getLargura());
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// Cria um novo objeto e copia os valores dos atributos para este novo objeto
		Porta p = new Porta(this.qualPorta, this.altura, this.largura) ;
			p.aberta = this.aberta;
			
			// Retorna o novo objeto, que  é uma cópia do objeto anterior	
			return p;	
	}

}
