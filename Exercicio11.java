import java.util.Scanner;

public class Exercicio11{
    public static void executar(){
        Scanner leitor = new Scanner(System.in);
        
        int maior;
        int meio;
        int menor;
        
        System.out.println("Digite o primeiro número: ");
        int num1 = leitor.nextInt();
        maior = num1;
        meio = num1;
        menor = num1;
        
        System.out.println("Digite o segundo número: ");
        int num2 = leitor.nextInt();
        if(num2 > maior){
            meio = maior;
            maior = num2;
        } else if(num2 < menor){
            meio = menor;
            menor = num2;
        } else {
            meio = num2;
        }
        
        System.out.println("Digite o terceiro número: ");
        int num3 = leitor.nextInt();
        
        if(num3 > maior){
            meio = maior;
            maior = num3;
        } else if(num3 < menor){
            meio = menor;
            menor = num3;
        } else{
            meio = num3;
        }
        
        System.out.println("Maior: " + maior + " Meio: " + meio + " Menor: " + menor);

        leitor.close();

    }

}

