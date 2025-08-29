import java.util.Scanner;

public class exercico_16 {
    public static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {

        float saldoCliente = 0f;
        System.out.println("Digete o seu saldo : ");
        saldoCliente = LER.nextInt();

        float saldoMédio = 0f;
        saldoMédio =( saldoCliente / 2 );
        System.out.println("Seu saldo médio é de: " + saldoMédio);


        if (saldoMédio >= 0 && saldoMédio <= 200) {
            System.out.println("Vocé não tem nenhum crédito") ;
        }else{
        if (saldoMédio >= 201 && saldoMédio <= 400) {
            System.out.println("Seu percentual é de 20%");                
        }else{
        if (saldoMédio >= 401 && saldoMédio <= 600) {
            System.out.println("Seu percentual é de 30%");
        }else{
        if (saldoMédio > 600 ) {
            System.out.println("Seu percentual é de 40%");
            }
            }
            }
        }





    }
}
