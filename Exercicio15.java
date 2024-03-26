

import java.util.Scanner;

import java.lang.Math;

public class Exercicio15{
    public static void executar(){
        Scanner leitor = new Scanner(System.in);
    
        System.out.println("Digite x1: ");
        float x1 = leitor.nextFloat();
        
        System.out.println("Digite y1: ");
        float y1 = leitor.nextFloat();
        
        System.out.println("Digite x2: ");
        float x2 = leitor.nextFloat();
        
        System.out.println("Digite y2: ");
        float y2 = leitor.nextFloat();
        
        float d = (((x2 - x1)*(x2 - x1)) + ((y2 - y1) * (y2 - y1)));
        
        System.out.println("A distância é: " + Math.sqrt(d));
    
        leitor.close();

    }
}


