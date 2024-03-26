
import java.util.Scanner;


public class Exercicio04
{
	public static void executar() {
		Scanner leitor = new Scanner(System.in);
		
		float A;
        float B;
        
		System.out.println("Digite o primeiro número: ");
		A = leitor.nextFloat();
		
		System.out.println("Digite o segundo número: ");
		B = leitor.nextFloat();
		
		System.out.println("A soma deles é: " + (A + B));
		System.out.println("A subtração deles é: " + (A - B));
		System.out.println("A multiplicação deles é: " + (A * B));
		if(B != 0){
		    System.out.println("A divisão deles é: " + (A / B));
		} else {
		    System.out.println("O número é indivisível por 0");
		}
		
        leitor.close();

	}
}



