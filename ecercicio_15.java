import java.util.Scanner;

public class ecercicio_15 {
    final static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {

        int salario = 0;
        System.out.println("Digite o seu salário");
        salario = LER.nextInt();

        int cargo = 0;
        System.out.println("Digite o seu código de acordo com o seu cargo");
        cargo = LER.nextInt();

        if (cargo != 101 && 102 || 103) {
            salario * (1 + 0,40)
            System.out.println("Seu novo saário é de: " + salario);
        }


        
    }
}
