

import java.util.Scanner;

public class Exercicio16{
    public static void executar(){
        Scanner leitor = new Scanner(System.in);
    
        System.out.println("Digite a primeira nota: ");
        float nota1 = leitor.nextFloat();
        
        System.out.println("Digite a segunda nota: ");
        float nota2 = leitor.nextFloat();
        
        System.out.println("Digite a terceira nota: ");
        float nota3 = leitor.nextFloat();
        
        float notaf = (nota1 + nota2 + nota3)/3;
        
        System.out.println("A nota final é: " + notaf);
    
        leitor.close();

    }
}


