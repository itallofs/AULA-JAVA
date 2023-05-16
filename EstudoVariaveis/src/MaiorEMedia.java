import java.util.Scanner;

public class MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero;
        int count = 0;
        int maior = 0;
        int media = 0;

        do {
            System.out.println("Informe um numero: ");
            numero = scan.nextInt();
            count++;
            if (numero > maior) maior = numero;
            media = media + numero;
        } while(count < 5);  
        media = media/count; 
        System.out.println("O maior numero é, " + maior);
        System.out.println("A media é," + media);     
    }
}
