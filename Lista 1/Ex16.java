import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int valor = sc.nextInt();

        int n100 = valor / 100;
        valor %= 100;

        int n50 = valor / 50;
        valor %= 50;

        int n20 = valor / 20;
        valor %= 20;

        int n10 = valor / 10;
        valor %= 10;

        int n5 = valor / 5;
        valor %= 5;

        int n2 = valor / 2;
        valor %= 2;

        int n1 = valor;

        System.out.println("100 = " + n100);
        System.out.println("50 = " + n50);
        System.out.println("20 = " + n20);
        System.out.println("10 = " + n10);
        System.out.println("5 = " + n5);
        System.out.println("2 = " + n2);
        System.out.println("1 = " + n1);

        sc.close();
    }
}