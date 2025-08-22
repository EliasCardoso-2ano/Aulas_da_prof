import java.util.Scanner;

public class exercicio12 {

    final static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {
        
        double ladoX = 0;
        System.out.print("Digite o número do primeiro ladodo triângulo: ");
        ladoX =  LER.nextDouble();

        double ladoZ = 0;
        System.out.print("Digite o núnemro do segundo lado do triângulo: ");
        ladoZ = LER.nextDouble();
        
        double ladoW = 0;
        System.out.print("Digete o número do terceiro lodo do triândulo: ");
        ladoW = LER.nextDouble();

         if (ladoW + ladoZ > ladoX || ladoW + ladoX > ladoZ || ladoZ + ladoX > ladoW) {
         System.out.println("O comprimento de cada lado em um triângulo é menor que a soma dos outros dois lados");
         }
            
        if (ladoW == ladoX && ladoW == ladoZ && ladoX == ladoZ) {
                System.out.println("O triângulo é Equilátero, pois tem os comprimentos de três lados iguais");
                
        }else if (ladoW != ladoX && ladoW != ladoZ && ladoX != ladoZ ){
                System.out.println("O triângulo é Escaleno, pois tem os comprimentos dos três lados diferentes.");
       
        }else{
                System.out.println("O triânguloo é Isósceles, pois tem os comprimentos de dois lados iguais;");
            }
        }
  
    }


