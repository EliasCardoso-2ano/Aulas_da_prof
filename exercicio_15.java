import java.util.Scanner;

public class exercicio_15 {
    final static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {

        int salario = 0;
        System.out.println("Digite o seu salário");
        salario = LER.nextInt();

        int cargo = 0;
        System.out.println("Digite o seu código de acordo com o seu cargo");
        cargo = LER.nextInt();

        // é o percentual do ganho do salário sem ser em porcentagem e saparado do N.Salário
        float percentualOutroCargo = (salario * 40/100f) ;
            float percentualGerente = (salario * 10/100f);
                float percentualEngenheiro = (salario * 20/100f);
                    float percentualTecnico = (salario * 30/100f);

        // salário mais o percentua = novo salário 
                    float novoSalarioOutroCargo = (salario + percentualOutroCargo);
                float novoSalarioGerente = (salario + percentualGerente);
            float novoSalarioEngenheiro = (salario + percentualEngenheiro);
        float novoSalarioTecnico = (salario + percentualTecnico);



    if (!(cargo == 101 || cargo == 102 || cargo == 103)) {
        // estou negando todos ao mesmo tempo 
            // salario * (1 + 0,40);
                    System.out.println("Seu novo salário é de: " + novoSalarioOutroCargo);
                    System.out.println("seu antigo salário era de: "+ salario);
                    System.out.println("Com a diferença de: " + (novoSalarioOutroCargo - salario));
                }else{
    if (cargo == 101) {
        System.out.println("Seu novo salário é de: " + novoSalarioGerente);
        System.out.println("seu antigo salário era de: "+ salario);
        System.out.println("Com a diferença de: " + (novoSalarioGerente - salario));
                }else{
                if (cargo == 102) {
                    System.out.println("Seu novo salário é de: " + novoSalarioEngenheiro);
                    System.out.println("seu antigo salário era de: "+ salario);
                    System.out.println("Com a diferença de: " + (novoSalarioEngenheiro - salario));
                }else{
    if (cargo == 103) {
        System.out.println("Seu novo salaro é de: "+ novoSalarioTecnico);   
        System.out.println("seu antigo salário era de: " + salario);
        System.out.println("Com a diferença de: " + (novoSalarioTecnico - salario));
                    }
                }
            }

        }
        
    }
}