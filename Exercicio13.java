import java.util.Scanner;

public class Exercicio13{
    public static void executar(){
        Scanner leitor = new Scanner(System.in);
        
        
        System.out.println("Digite primeiro valor: ");
        float A = leitor.nextFloat();
        
        System.out.println("Digite o segundo valor: ");
        float B = leitor.nextFloat();
        
        System.out.println("Digite o operador: ");
        char op = leitor.next().charAt(0);
        
        if(op == '+'){
            System.out.println(A + B);
        }else if(op == '-'){
            System.out.println(A - B);
        }else if(op == '*'){
            System.out.println(A * B);
        }else if(op == '/'){
            if(B == 0){
                System.out.println("Indivisível por 0!");
            }
            else{
                System.out.println(A / B);
            }
        }else{
            System.out.println("Operador não definido!");
        }

        leitor.close();

    }
}

