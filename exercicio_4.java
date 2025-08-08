
import java.util.Scanner;

public class exercicio_4 {
    final static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {

        int num = 0;
        System.out.println("Digite um número: ");
        num = LER.nextInt();

        if (num > 0) {
            System.out.println("Dobro do número positivo: "+num*2);
        }else {
            if (num < 0){
            System.out.println("Triplo do número negativo: "+num*3);
            }
        }
        
    }
    
}
