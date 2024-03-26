

import java.util.Scanner;

public class Exercicio20{
    public static void executar(){
        Scanner leitor = new Scanner(System.in);
    
        System.out.println("Digite o tempo de viagem em horas: ");
        float tempo = leitor.nextFloat();
        
        System.out.println("Digite a velocidade média da viagem em (km/h): ");
        float velmed = leitor.nextFloat();
        
        float dist = tempo * velmed;
        
        float qtdlt =  dist / 12;
        
        System.out.println("Quantidade de litros de combustível gasta: " + qtdlt);
        
        leitor.close();

    }
}


