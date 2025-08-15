import java.util.Scanner;

public class exercicio_11{

    final static Scanner LER = new Scanner(System.in);
    
    public static void main(String[] args) {


        // Possíveis erros: 
        // •Caso1: Quando o usuário digitar um nível não existente(1,2 ou 3), o comando rodar mesmo assim.
        // •Caso2: Quando tentei usar o while, qualquer num. dentro do padrão, dava erro(aparecia a mngs. que foi progamada para aparecer quando o nível fosse diferente de 1, 2 ou 3)


        
        int nivel = 0;
        System.out.println("Digite o seu nível de professor, sendo eles, 1, 2 ou 3: ");
        nivel = LER.nextInt();

        // while (nivel != 1|| nivel != 2 || nivel != 3) {
        //     System.out.println("                     ");
        //     System.out.println("!!!!!Digite um nível de professor valido!!!!");

        //     if (nivel == 1 || nivel == 2 || nivel == 3) {
        //    break;
           
        

        float hora_aula = 0f;
        System.out.println("Digite a sua quantidade de horas/aula: ");
        hora_aula = LER.nextInt();


        if(nivel == 1){
         System.out.println("Seu slário deve ser de: "+12.00 * hora_aula);
        }else{
            if(nivel == 2){
                System.out.println("Seu slário deve ser de: "+17.00 * hora_aula);

            }else{
                if(nivel == 3){
                    System.out.println("Seu slário deve ser de: "+25.00 * hora_aula);

                }
            }
       
        }

    }
    
 }



