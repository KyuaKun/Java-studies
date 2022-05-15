package Exercicio01;

public class Relogio {
	Ponteiro ponteiroSegundo = new Ponteiro();
	Ponteiro ponteiroMinuto = new Ponteiro();
	Ponteiro ponteiroHora = new Ponteiro();

	public void acertarRelogio(int hora, int minuto, int segundo) {
		hora =hora%12;
		ponteiroHora.posicao = hora;
		ponteiroMinuto.posicao = minuto/5;
		ponteiroSegundo.posicao = segundo/5;
		System.out.printf("%02d:%02d:%02d \n", ponteiroHora.posicao, ponteiroMinuto.posicao, ponteiroSegundo.posicao);
	}

	int lerHora() {
		return ponteiroHora.posicao;
	}

	int lerMinuto() {
		return ponteiroMinuto.posicao*5;		
	}

	int lerSegundo() {
		return ponteiroSegundo.posicao*5;
	}
}	
