import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Curriculo2 {
	public static void main(String[] args) {
		String linkCurriculo = "C:\\Users\\vinicin\\Desktop\\vinicius\\curriculum.txt";
		FileReader leitorArq = null;
		BufferedReader br = null;
		
		try {
			
			leitorArq = new FileReader(linkCurriculo);
			br = new BufferedReader(leitorArq);
			
			String line = br.readLine();
			while(line != null){
				System.out.println(line);
				line = br.readLine();
			}
		}
		catch(IOException e){
			System.out.println("Erro: " + e.getLocalizedMessage());
		}
		finally {
			try {
				leitorArq.close();
				br.close();
			}
			catch (IOException e) {
				e.setStackTrace(null);
			}
		}
	}
}
