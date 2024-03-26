import java.util.Scanner;

public class Exercicio08
{
	public static void executar() {
		Scanner leitor = new Scanner(System.in);
		float num;
		
		System.out.println("Digite o número: ");
		num = leitor.nextFloat();
		
		if(num >= 50){
		    System.out.println("Número maior ou igual a 50!");
		} else{
		    System.out.println("Número menor que 50!");
		}
		    
		leitor.close();

	}
}


