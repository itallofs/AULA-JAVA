import java.util.Scanner;

public class ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int quantNumeros;
        int count = 0;
        int numero;
        int quantPares = 0;
        int quantImpares = 0;

        System.out.println("Informe a quantidade de repetções: ");
        quantNumeros = scan.nextInt();

        do{
            System.out.println("Informe um numero: ");
            numero = scan.nextInt();
            count++;
            if (numero % 2 == 0) quantPares++;
            else quantImpares++;

        }while(count < quantNumeros);
        System.out.println("A quantidade de pares é, " + quantPares);
        System.out.println("A quantidade de impares é, " + quantImpares);
    }
}
