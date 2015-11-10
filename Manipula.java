import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Manipulador {
	public static void escritor(int val1, int val2, char op, int pid) throws IOException {

		BufferedWriter buffWrite = new BufferedWriter(
				new FileWriter("arquivo.txt", true));

		int res =0;
		Calc calc = new Calc();
		
		switch (op) {
		case '+': {
			res = Calc.soma(val1, val2);
			System.out.println(res);
			break;
		}
		case '-': {
			res = Calc.subtrai(val1, val2);
			break;
		}
		case '*': {
			res = Calc.multiplica(val1, val2);
			break;
		}
		case '/': {
			res = Calc.divide(val1, val2);
		}
		}

		buffWrite.append(val1 + " " + op + " " + val2 + " = " + res + "   \n");
		buffWrite.close();
	}

	public static void leitor(String path) throws IOException {

		BufferedReader buffRead = new BufferedReader(new FileReader(path));
		String linha = "";
		while (true) {
			if (linha != null) {
				System.out.println(linha);
			} else
				break;
			linha = buffRead.readLine();
		}
		buffRead.close();
	}

}
