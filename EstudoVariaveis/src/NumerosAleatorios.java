import java.util.Random;

public class NumerosAleatorios {
    
    public static void main(String[] args) {
        Random random = new Random();

        int[] numerosAleato = new int[20];

        for( int i = 0; i <numerosAleato.length; i++ ){
            int numero = random.nextInt(100);
            numerosAleato[i] = numero;
        }

        System.out.print("\nNumeros gerados Automaticamente: ");
        for (int numero : numerosAleato){
            System.out.print(numero + " ");
        }

        System.out.print("\nNumeros apos aos gerados Automaticamente: ");
        for (int numero : numerosAleato){
            System.out.print((numero+1) + " ");
        }

        System.out.print("\nNumeros que antecedem aos gerados Automaticamente: ");
        for (int numero : numerosAleato){
            System.out.print((numero-1) + " ");
        }
    }
}
