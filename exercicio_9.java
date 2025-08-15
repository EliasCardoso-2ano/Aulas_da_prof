
import java.util.Scanner;


public class exercicio_9 {

    final static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {
        
        double id = 0;
        System.out.print("Digire seu ID: ");
        id= LER.nextInt();
        
        int nota1 = 0;
        System.out.println("Digite a primeira nota: ");
        nota1 = LER.nextInt();

        int nota2 = 0;
        System.out.println("Digite a segunda nota:");
        nota2 = LER.nextInt();

        int nota3 = 0;
        System.out.println("Digite a terceira nota:");
        nota3 = LER.nextInt();

        System.out.println("ID do aluno: " + id);

        int calcularMédia = ( nota1 + nota2 + nota3 ) /3 ;
        System.out.println("Sua média é de: " + calcularMédia);

        if (calcularMédia >= 6) {
            System.out.println("Você está aprovado!");
        }else{
            System.out.println("Você está reprovado!");
        }


    }
}