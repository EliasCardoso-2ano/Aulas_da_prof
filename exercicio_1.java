
import java.util.Scanner;

public class exercicio_1{
    final static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {
        

        int ValorA = 0;
        int ValorB = 0;

        System.out.print("ValorA: ");
        ValorA =  LER.nextInt();

        System.out.println("ValorB: ");
        ValorB = LER.nextInt();


        if (ValorA > ValorB) {
            System.out.println("Valor A é maior" );
        }else{
            if (ValorB > ValorA) {
                System.out.println("Valor B é maior");
            }else{
                System.out.println("Os valores são iguais");
            }
        }
        
    }
}