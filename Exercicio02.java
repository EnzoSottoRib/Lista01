
import java.util.Scanner;

public class Exercicio02 {
	public static void executar(){
		Scanner leitor = new Scanner(System.in);
		
		float num1;
        float num2;
        
		System.out.println("Digite o primeiro número:7 ");
		num1 = leitor.nextFloat();
		
		System.out.println("Digite o segundo número: ");
		num2 = leitor.nextFloat();
		
		System.out.println("A soma dos dois é: " + (num1 + num2));
		
        leitor.close();
	}
}


