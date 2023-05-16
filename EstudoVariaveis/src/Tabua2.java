import java.util.Scanner;

public class Tabua2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a tabuada desejada: ");
        int tabuada =scan.nextInt();

        for(int i = 1; i <= 10 ; i++){
            System.out.println(tabuada + " X " + i + " = " + (tabuada*i));
        }
    }
}
