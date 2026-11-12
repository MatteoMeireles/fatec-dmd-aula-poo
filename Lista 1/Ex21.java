    import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String usuarioCorreto = "admin";
        String senhaCorreta = "1234";

        System.out.print("Usuário: ");
        String usuario = sc.next();

        System.out.print("Senha: ");
        String senha = sc.next();

        if (!usuario.equals(usuarioCorreto) || !senha.equals(senhaCorreta)) {
            System.out.println("Login inválido");
            return;
        }

        double saldo = 1000;
        int opcao;

        do {
            System.out.println("\n1 - Consultar saldo");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("0 - Sair");

            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Saldo: R$ " + saldo);
                    break;

                case 2:
                    System.out.print("Valor do depósito: ");
                    saldo += sc.nextDouble();
                    break;

                case 3:
                    System.out.print("Valor do saque: ");
                    double saque = sc.nextDouble();

                    if (saque <= saldo) {
                        saldo -= saque;
                        System.out.println("Saque realizado");
                    } else {
                        System.out.println("Saldo insuficiente");
                    }
                    break;

                case 0:
                    System.out.println("Sistema encerrado");
                    break;

                default:
                    System.out.println("Opção inválida");
            }

        } while (opcao != 0);

        sc.close();
    }
}