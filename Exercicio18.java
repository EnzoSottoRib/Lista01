

import java.util.Scanner;

public class Exercicio18{
    public static void executar(){
        Scanner leitor = new Scanner(System.in);
    
        System.out.println("Digite a nota 1: ");
        float nota1 = leitor.nextFloat();

        System.out.println("Digite a nota 2: ");
        float nota2 = leitor.nextFloat();
    
        System.out.println("Digite a nota 3: ");
        float nota3 = leitor.nextFloat();
        
        float mediah = 3/((1/nota1) + (1/nota2) + (1/nota3));
        
        System.out.println("Média harmônica: " + mediah);
     
        leitor.close();

    }
}


