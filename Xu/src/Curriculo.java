import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Curriculo {
	public static void main(String[] args) {
		File curriculum = new File("C:\\Users\\vinicin\\Desktop\\vinicius\\curriculum.txt");
		Scanner scanner = null;
		try {
			scanner = new Scanner(curriculum);
			while (scanner.hasNextLine()) {
				System.out.println(scanner.nextLine());
			}
				
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		finally {
			
			if(scanner != null) {
				scanner.close();
			}
		}
	}	 
}
