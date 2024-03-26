import java.util.Scanner;

public class Exercicio06
{
	public static void executar() {
		Scanner leitor = new Scanner(System.in);
		float temp;
		
		System.out.println("Digite a temperatura em ºC: ");
		temp = leitor.nextFloat();
		
		System.out.println("A temperatura em ºF é: " + (((9*temp)) + 160) / 5);
		
        leitor.close();

	}
}



