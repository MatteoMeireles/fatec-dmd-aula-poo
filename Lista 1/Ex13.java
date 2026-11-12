import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ano = sc.nextInt();

        if ((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0) {
            System.out.println("Ano bissexto");
        } else {
            System.out.println("Não é bissexto");
        }

        sc.close();
    }
}