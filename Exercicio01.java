
import java.util.Scanner;

public class Exercicio01 {
	public static void executar(){
		Scanner leitor = new Scanner(System.in);
		
		int num;
		
		System.out.println("Digite o numero: ");
		num = leitor.nextInt();
		
		if(num > 10){
		    System.out.println("Número maior do que 10!");
		} else {
		    System.out.println("Número menor ou igual a 10!");
		}
		leitor.close();
	}
}


