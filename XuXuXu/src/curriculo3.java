import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class curriculo3 {

	public static void main(String[] args) {
		
		String caminho = "C:\\Users\\vinicin\\Desktop\\vinicius\\curriculum.txt";
		
		try(BufferedReader br = new BufferedReader(new FileReader(caminho))){
			String line = br.readLine();
					while(line != null){
						System.out.println(line);
						line = br.readLine();
					}
		}
		catch(IOException e) {
			System.out.println("Erro: " + e.getLocalizedMessage());
		}
	}

}
