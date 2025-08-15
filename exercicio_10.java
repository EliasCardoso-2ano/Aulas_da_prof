
import java.util.Scanner;


public class exercicio_10 {

    final static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {
        
        int num1 = 0;
        System.out.println("Digite o primeiro valor: ");
        num1 = LER.nextInt();

        int num2 = 0;
        System.out.println("Digite o segundo valor: ");
        num2 = LER.nextInt();
        
        if(num1 > num2){
            System.out.println("A diferença entre os números é de: " + (num1-num2) );
        }else{
            if(num1 < num2){
                System.out.println("A diferença entre os números é de: " + (num2-num1) );
            }else{
                System.out.println("Os números são iguais, digites números diferentes!");

            }
        }
        




    }
}
