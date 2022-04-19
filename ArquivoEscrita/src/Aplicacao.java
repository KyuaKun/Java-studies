import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Aplicacao {

	public static void main(String[] args) throws IOException {
		String txt = "Hello, world!";		
		
		// esse try nos possibilita escrever.
		try (BufferedWriter digitar = new BufferedWriter(new FileWriter("arquivoTeste.txt"))){
			digitar.write(txt + "\n");
			digitar.write("Olá, mundo!" + "\n");
			digitar.write("Fsociety");
		}
		
		// esse try nos possibilita ler o que foi escrito.
		try(BufferedReader br = new BufferedReader(new FileReader("arquivoTeste.txt"))){
			String line = br.readLine();
					while(line != null){
						System.out.println(line);
						line = br.readLine();
					}
		}
	}
}
