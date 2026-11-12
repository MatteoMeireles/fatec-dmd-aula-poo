import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();

        System.out.print("Operação (+,-,*,/): ");
        char op = sc.next().charAt(0);

        switch (op) {
            case '+':
                System.out.println(n1 + n2);
                break;

            case '-':
                System.out.println(n1 - n2);
                break;

            case '*':
                System.out.println(n1 * n2);
                break;

            case '/':
                if (n2 != 0) {
                    System.out.println(n1 / n2);
                } else {
                    System.out.println("Divisão por zero");
                }
                break;

            default:
                System.out.println("Operação inválida");
        }

        sc.close();
    }
}