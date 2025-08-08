
import java.util.Scanner;

public class exercicio_5 {
    final static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {

        int variavel = 0;
        System.out.print("Digite um valor: ");
        variavel = LER.nextInt();

        int variavelPar = 0;

        int variavelÍmpar = 0;

        if (variavel % 2 == 0) {
            System.out.println("Carregando ..................");
            // System.out.println("Valor par somado com cinco: "+ variavelPar);
            System.out.println("Valor positivo somado com cinco: " + (variavel + 5));

        } else {
            System.out.println("Carregando ..................");
            // System.out.println("Valor ímpar somado com oito: "+ variavelÍmpar);
            System.out.println("Valor ímpar somado com oito: " + (variavel + 8));
        }

    }

    // public static int imprimirVariavelPar(int variavel) {

    // for (int variavelPar = variavel; variavelPar % 2 == 0; variavelPar++) {
    // // Object elem = arr[idx];

    // }
    // return variavelPar;

    // }

    // public static void imprimirVariavelÍmpar(int variavel) {

    // for (int variavelÍmpar = variavel; variavelÍmpar != variavelPar;
    // variavelÍmpar++ )

    // }

}
