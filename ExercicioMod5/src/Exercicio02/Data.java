package Exercicio02;

public class Data {
	
	 private Integer dia;
	 private Integer mes; 
	 private Integer ano;
	 private Integer hora = -1 ;
	 private Integer minuto = -1;
	 private Integer segundo = -1;
	 static final int FORMATO_12H = 1;
	 static final int FORMATO_24H = 2;
	 
	 public Integer getDia() {
		return dia;
	}

	public Integer getMes() {
		return mes;
	}

	public Integer getAno() {
		return ano;
	}

	public Integer getHora() {
		return hora;
	}

	public Integer getMinuto() {
		return minuto;
	}

	public Integer getSegundo() {
		return segundo;
	}

	public Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	public Data(int dia, int mes, int ano, int hora, int minuto, int segundo) {
		this(dia, mes, ano);
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;
	}
	
	public void imprimir(int formato) {
		 String data = dia + "/" + mes + "/" + ano;
		 
		 if(hora == -1) {
			 System.out.println(data);
			 
		 } else {
			 String horario = ":" + minuto + ":" + segundo;
			 
			 if(formato == FORMATO_24H) {
				 horario = hora + horario;
				 horario += " AM";
				 
			} else {
				if (hora == 0) {
					horario = (hora + 12) + horario;
				} else if (hora >= 12) {
					horario = (hora - 12) + horario;
					horario += " PM";
				} else {
					horario = hora + horario;
					horario += " AM";
				}
			}
			 System.out.println(data + " às " + horario);
		 }
	}
}
