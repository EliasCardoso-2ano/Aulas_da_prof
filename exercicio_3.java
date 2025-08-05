
import java.util.Scanner;

public class exercicio_3 {
    final static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {
        
        int valorIntA = 0;
        System.out.println("Digite um valor");
        valorIntA = LER.nextInt();

        int valorIntB = 0;
        System.out.println("Digite um valor");
        valorIntB = LER.nextInt();


        int R_soma = 0;

        if (valorIntA == valorIntB) {
           R_soma = (valorIntA + valorIntB);
           System.out.println("Os valores são iguais ");
        }else{
            R_soma =(valorIntA * valorIntB);
            System.out.println("Resultado multiplicado: "+R_soma);
        }
        
    }
}
