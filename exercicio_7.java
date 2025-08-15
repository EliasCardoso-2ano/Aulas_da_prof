
import java.util.Locale;
import java.util.Scanner;

public class exercicio_7 {
    final static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {


        int sexo;
        System.out.println("Digite o seu sexo:");
        System.out.println("Exemplo: mulher = 1 ou homem = 2");
        sexo = LER.nextInt();

        float altura = 0; 
        System.out.println("Digite a sua altura:");
        LER.useLocale(Locale.US);
        altura = LER.nextFloat();

        float pesoIdeal = 0;

        
        if (sexo == 1) {//mulher
            pesoIdeal = 62.1f * altura - 44.7f;

            System.out.println("seu peso ideal é: "+pesoIdeal);
            
        }else{
            if (sexo == 2) {   //homem
                pesoIdeal = 72.7f * altura - 58f;
                pesoIdeal = (altura-100)*90;

                System.out.println("seu peso ideal é: "+pesoIdeal);
            }
        }




    }
    


}
