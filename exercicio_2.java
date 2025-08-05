
import java.util.Scanner;

public class exercicio_2 {
    final static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {

        int Valor = 0;

        System.out.println("Digite um valor");
        Valor = LER.nextInt();

        if (Valor % 2 == 0) {
            System.out.println("É um numero par" );
        }else{
            System.out.println("O número é ímpar ");
        }
        
    }
}
