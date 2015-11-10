import java.io.IOException;
import java.util.Scanner;


public class Main {
	
	public static void main(String args[]) throws IOException {
		Scanner key = new Scanner(System.in);
		
		String path = "d:\\arquivo.txt";
		int x;
		
		do {
			System.out.println("Digite 1 para continuar e 2 para sair :");
			x = key.nextInt();
			Manipuladorr.escritor(path);
			Manipuladorr.leitor(path);
		} while (x != 2);
	}

}
