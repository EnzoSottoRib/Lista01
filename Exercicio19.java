

import java.util.Scanner;

public class Exercicio19{
    public static void executar(){
        Scanner leitor = new Scanner(System.in);
    
        System.out.println("Digite o raio: ");
        float raio = leitor.nextFloat();
        
        System.out.println("Digite a altura: ");
        float altura = leitor.nextFloat();
        
        double vol = ((3.14 * (raio * raio)) * altura);
        
        System.out.println("Volume: " + vol);
        
        leitor.close();

    }
}


