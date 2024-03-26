
import java.util.Scanner;

public class Exercicio03 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);
    
        System.out.println("Digite o primeiro valor: ");
        int A = leitor.nextInt();
        
        System.out.println("Digite o segundo valor: ");
        int B = leitor.nextInt();
        
        int maior = 0;
        
        if(A > B){
            maior = A;
        } else if(B > A) {
            maior = B;
        } else {
            System.out.println("Sequência de números inválida!");
        }
    
        System.out.println("O maior é o: " + maior);
        
        leitor.close();
        
    }
}



