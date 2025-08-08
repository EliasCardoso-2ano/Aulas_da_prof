import java.util.Scanner;

public class exercicio_6 {
    final static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {

        int num1 = 0;
        System.out.println("Digite o primeiro valor:");
        num1 = LER.nextInt();

        int num2 = 0;
        System.out.println("Digite o segundo valor:");
        num2 = LER.nextInt();

        int num3 = 0;
        System.out.println("Digite o terceiro valor:");
        num3 = LER.nextInt();

        int primeiroValor = 0;

        int segundoValor = 0;

        int terceiroValor = 0;

        // verifica se todos são diferentes
        while ((num1 == num2 || num1 == num3) || num2 == num3) {
            System.out.println("                     ");
            System.out.println("!!!!!Digite os valores diferentes dos demais!!!!!");
            System.out.println("_____Digite novamente todos os valores sem repetir_____");
            num1 = LER.nextInt();
            num2 = LER.nextInt();
            num3 = LER.nextInt();

            if ((primeiroValor != segundoValor && primeiroValor != terceiroValor && segundoValor != terceiroValor)) {
                break;
            }

        }

        // após todos os valores serem diferentes, começa a organizar os valores em
        // ordem crescente
        if (num1 > num2 && num2 > num3) {
            primeiroValor = num1;
            segundoValor = num2;
            terceiroValor = num3;
        } else if (num1 > num2 && num2 < num3) {
            primeiroValor = num1;
            segundoValor = num3;
            terceiroValor = num2;
        } else if (num1 < num2 && num2 < num3) {
            primeiroValor = num3;
            segundoValor = num2;
            terceiroValor = num1;
        } else if (num1 > num2 && num1 < num3) {
            primeiroValor = num3;
            segundoValor = num1;
            terceiroValor = num2;
        } else if (num1 < num2 && num1 > num3) {
            primeiroValor = num2;
            segundoValor = num1;
            terceiroValor = num3;
        } else if (num3 < num2 && num1 < num3) {
            primeiroValor = num2;
            segundoValor = num3;
            terceiroValor = num1;
        }

        System.out.println("Valores em ordem crescente: " + terceiroValor + ", " + segundoValor + ", " + primeiroValor);
        // após todos os valores serem diferentes, começa a organizar os valores em
        // ordem decrescente

        if (num1 > num2 && num2 > num3) {
            primeiroValor = num3;
            segundoValor = num2;
            terceiroValor = num1;
        } else if (num1 > num2 && num2 < num3) {
            primeiroValor = num2;
            segundoValor = num3;
            terceiroValor = num1;
        } else if (num1 < num2 && num2 < num3) {
            primeiroValor = num1;
            segundoValor = num2;
            terceiroValor = num3;
        } else if (num1 > num2 && num1 < num3) {
            primeiroValor = num2;
            segundoValor = num1;
            terceiroValor = num3;
        } else if (num1 < num2 && num1 > num3) {
            primeiroValor = num3;
            segundoValor = num1;
            terceiroValor = num2;
        } else if (num3 < num2 && num1 < num3)

            System.out.println();
        System.out.println("Valores em ordem decrescente: " + terceiroValor + ", " + segundoValor + ", " + primeiroValor
                + "   *extra.");
    }
}
