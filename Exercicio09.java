import java.util.Scanner;

public class Exercicio09
{
	public static void executar() {
		Scanner leitor = new Scanner(System.in);
		float num1;
		float num2;
		
		System.out.println("Digite o primeiro número: ");
		num1 = leitor.nextFloat();
		System.out.println("Digite o segundo número: ");
		num2 = leitor.nextFloat();
		
		if(num1 == num2){
		    System.out.println("Os números são iguais!");
		} else{
		    System.out.println("Os números são distintos!");
		}
		    
		leitor.close();

	}
}



