import java.util.Scanner;
import java.util.Locale;

public class Tabuada {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Programa de Tabuada! ");

        System.out.println("Informe a tabuada que deseja: ");
        String tabuada = scanner.next();

        int n1 = Integer.parseInt(tabuada);
        int contador = 1;

        while (contador <=10){
            int multiplica = n1 * contador;
            System.out.println(tabuada + " x " + contador + " = " + multiplica);
            contador++;
        }
    }
}