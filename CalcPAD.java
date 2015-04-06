
import java.util.Scanner;

public class CalcPAD {

	public static void main (String [] args)
	{
		Scanner in = new Scanner (System.in);
		float s =0 ,s2 = 0;
		float result = 0;
		int op =0;
		
		do{
		System.out.println("1.SOMA");
		System.out.println("2.SUBTRACAO");
		System.out.println("3.MULTIPLICACAO");
		System.out.println("4.DIVISAO");
		System.out.println("5.sair");
		op = in.nextInt();
		
		switch(op){
		case 1: 
			System.out.println("Insira o primeiro valor :");
			s= in.nextFloat();
			System.out.println("Insira o segundo valor :");
			s2= in.nextFloat();
			
			result = s + s2;
			
			System.out.println(result);
			break;
		case 2:
			System.out.println("Insira o primeiro valor :");
			s= in.nextFloat();
			System.out.println("Insira o segundo valor :");
			s2= in.nextFloat();
			
			result = s - s2;
			
			System.out.println(result);
		break;
		
		case 3:
			System.out.println("Insira o primeiro valor :");
			s= in.nextFloat();
			System.out.println("Insira o segundo valor :");
			s2= in.nextFloat();
		
			result = s * s2;
		
			System.out.println(result);
			break;
		case 4:
			System.out.println("Insira o primeiro valor :");
			s= in.nextFloat();
			System.out.println("Insira o segundo valor :");
			s2= in.nextFloat();
			
			result = s / s2;
			
			System.out.println(result);
			break;
		case 5:
			
			break;
		}}while(op != 5);
	}
}
