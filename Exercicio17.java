
import java.util.Scanner;

public class Exercicio17{
    public static void executar(){
        Scanner leitor = new Scanner(System.in);
    
        System.out.println("Digite a nota 1: ");
        float nota1 = leitor.nextFloat();

        System.out.println("Digite a nota 2: ");
        float nota2 = leitor.nextFloat();
    
        System.out.println("Digite a nota 3: ");
        float nota3 = leitor.nextFloat();
        
        System.out.println("Digite o peso 1: ");
        float peso1 = leitor.nextFloat();
        
        System.out.println("Digite o peso 2: ");
        float peso2 = leitor.nextFloat();
        
        System.out.println("Digite o peso 3: ");
        float peso3 = leitor.nextFloat();
        
        float mediap = ((nota1*peso1) + (nota2*peso2) + (nota3*peso3))/(peso1+peso2+peso3);
        
        System.out.println("Média ponderada: " + mediap);
        
        leitor.close();

    }
}


