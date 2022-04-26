package Exercicio03;

public class Fatorial {
	public int fatorial(int num) {
		if (num == 0) return 1;
		return num *fatorial(num -1);	
	}
}
