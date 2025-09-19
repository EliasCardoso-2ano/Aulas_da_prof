import java.util.Scanner;

public class exercicio_17 {
    
    final static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Bem vindo a lanchonete do Elias lanches!");
        System.out.println("Dentre as variedades de lanches temos:"); 
        System.out.println("Cachorro quente de R$11,00/código: 001");
        System.out.println("Bauru de R$ 8,50/código: 002");
        System.out.println("Misto Quente de R$ 8,00/código: 003");
        System.out.println("Hamburger de R$ 9,00/código: 004");
        System.out.println("Cheeseburger de R$10,00/código: 005");
        System.out.println("Refrigerante de R$ 4,50/código: 006");      

        double code = 0;
        System.out.println("Digite o código do seu pedido: ");
        code = LER.nextDouble();

        double CachorroQuente = 11.00;
        double Bauru = 8.50;
        double MistoQuente = 8.00;
        double Hamburger = 9.00;
        double Cheeseburger = 10.00;
        double Refrigerante = 4.50;

        if (code == 001) {
            code = CachorroQuente;
            System.out.println("O seu lanche é Cachorro quente");
            }else{
                if (code == 002) {
                    code = Bauru;
                    System.out.println("O seu lanche é Bauru");
                }else{
                    if (code == 003) {
                        code = MistoQuente;
                        System.out.println("O seu lanche é Misto Quente ");
                    }else{
                        if (code == 004) {
                            code = Hamburger;
                            System.out.println("O seu lanche é Hamburger");
                        }else{
                            if (code == 005) {
                            code = Cheeseburger;
                            System.out.println("O seu lanche é Cheeseburger");
                        }else{
                                if (code == 006) {
                                code = Refrigerante;
                              System.out.println("O seu lanche é Refrigerante");
                            }  
                        }

                    }

                }
            }
        }


        int numDeLanches = 0;
        System.out.println("Digite quantos lanches vocé deseja:"); 
        numDeLanches = LER.nextInt();

        double valorLanches = ((numDeLanches)*(code));
        System.out.println("O valor total é de: " + valorLanches);

    

    }

    
    
}
