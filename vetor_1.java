import java.util.Scanner;

public class vetor_1 {
   public static void main(String[] args) {
    Scanner LER = new Scanner(System.in);
    
    // guardar só valores pares no vetor 

    int pos = 0;

    int valor = 0; 

    int[] vetor = new int[5];
    
    do {
        System.out.println("informe um valor par.");
        valor = LER.nextInt();
        if (valor %2 == 0) {
            vetor[pos] = valor;
            pos++;
        }



    } while (pos<vetor.length);
    LER.close();



   }
}
