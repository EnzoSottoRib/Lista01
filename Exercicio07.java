import java.util.Scanner;

public class Exercicio07
{
	public static void executar() {
		Scanner leitor = new Scanner(System.in);
		float num;
		
		System.out.println("Digite o número: ");
		num = leitor.nextFloat();
		
		if(num >= 100 && num <= 200){
		    System.out.println("Número dentro do intervalo entre 100 e 200!");
		} else{
		    System.out.println("Número fora do intervalo entre 100 e 200!");
		}
		
        leitor.close();

	}
}


