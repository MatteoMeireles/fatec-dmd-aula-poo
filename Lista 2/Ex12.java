import java.util.Scanner;

public class Ex12 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int opcao;

        do {

            System.out.println("1 - Somar");
            System.out.println("2 - Subtrair");
            System.out.println("3 - Sair");

            System.out.print("Escolha uma opção: ");
            opcao = entrada.nextInt();

            if (opcao == 1) {

                System.out.print("Digite o primeiro número: ");
                int n1 = entrada.nextInt();

                System.out.print("Digite o segundo número: ");
                int n2 = entrada.nextInt();

                System.out.println("Resultado = " + (n1 + n2));

            } else if (opcao == 2) {

                System.out.print("Digite o primeiro número: ");
                int n1 = entrada.nextInt();

                System.out.print("Digite o segundo número: ");
                int n2 = entrada.nextInt();

                System.out.println("Resultado = " + (n1 - n2));

            }

        } while (opcao != 3);

        System.out.println("Programa encerrado.");

    }
}