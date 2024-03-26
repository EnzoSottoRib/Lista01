
import java.util.Scanner;


public class Exercicio05
{
	public static void executar() {
		Scanner leitor = new Scanner(System.in);
		
		float Aantes;
        float Bantes;
        float Adepois;
        float Bdepois;
        
		System.out.println("Digite o primeiro número: ");
		Aantes = leitor.nextFloat();
		
		System.out.println("Digite o segundo número: ");
		Bantes = leitor.nextFloat();
		
		Adepois = Bantes;
		Bdepois = Aantes;
		
		System.out.println("O primeiro número original era: " + Aantes);
		System.out.println("O segundo número original era: " + Bantes);
		System.out.println("O primeiro número trocado é: " + Adepois);
		System.out.println("O segundo número trocado é: " + Bdepois);
	
        leitor.close();

	}
}


