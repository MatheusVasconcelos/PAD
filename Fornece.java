import java.io.IOException;
import java.util.Scanner;

public class Fornecedor {

	public static void main(String[] args) throws IOException {

		Scanner key = new Scanner(System.in);
		int val1, val2, res = 0, i=0;
		char op;

		do{
		val1 = key.nextInt();
		op = key.next().charAt(0);
		val2 = key.nextInt();
		
		Manipulador.escritor(val1,val2,op, getPID());
		i++;
		}while (i<6);

	}

	public static int getPID() {  
        String processName =  
                java.lang.management.ManagementFactory.getRuntimeMXBean().getName();  
        //System.out.println(processName);  
        return (int) Long.parseLong(processName.split("@")[0]);  
    } 
}
