import java.util.Scanner;

public class Exercicio12{
    public static void executar(){
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o mês: ");
        int mes = leitor.nextInt();
        
        String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        
        if (mes >= 1 && mes <= 12){
            System.out.println(meses[mes - 1]);
        } else {
            System.out.println("Mês inválido!");
        }
        
        leitor.close();
        }
}

