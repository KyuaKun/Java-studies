package Exercicio04;

public class Fibonacci {
	public int fibonacci(int num){
		if (num == 1 || num == 2)return 1;
		return fibonacci(num -1) + fibonacci(num -2);
	}
}
