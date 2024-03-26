
import java.util.Scanner;

public class Exercicio14{
    public static void executar(){
        Scanner leitor = new Scanner(System.in);
    
        System.out.println("Digite a1: ");
        int a1 = leitor.nextInt();
    
        System.out.println("Digite n: ");
        int n = leitor.nextInt();
    
        System.out.println("Digite r: ");
        int r = leitor.nextInt();
        
        int an = (a1 + ((n - 1) * r));
        
        System.out.println("O resultado é: " + an);
        
        leitor.close();

        }
    
}


