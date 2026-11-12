import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcao;

        do {
            System.out.println("1 - Somar");
            System.out.println("2 - Subtrair");
            System.out.println("0 - Sair");

            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    int a = sc.nextInt();
                    int b = sc.nextInt();
                    System.out.println("Resultado: " + (a + b));
                    break;

                case 2:
                    int x = sc.nextInt();
                    int y = sc.nextInt();
                    System.out.println("Resultado: " + (x - y));
                    break;

                case 0:
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("Opção inválida");
            }

        } while (opcao != 0);

        sc.close();
    }
}