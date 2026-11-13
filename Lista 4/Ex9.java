import java.util.Scanner;

public class Ex9 {

    static Scanner sc = new Scanner(System.in);
    static double saldo = 0;

    public static void mostrarMenu() {
        System.out.println();
        System.out.println("===== BANCO =====");
        System.out.println("1 - Depositar");
        System.out.println("2 - Sacar");
        System.out.println("3 - Consultar saldo");
        System.out.println("0 - Sair");
    }

    public static double lerValor() {
        System.out.print("Digite o valor: ");
        return sc.nextDouble();
    }

    public static void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor invalido!");
        } else {
            saldo = saldo + valor;
            System.out.println("Deposito realizado.");
        }
    }

    public static void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor invalido!");
        } else if (valor > saldo) {
            System.out.println("Saldo insuficiente!");
        } else {
            saldo = saldo - valor;
            System.out.println("Saque realizado.");
        }
    }

    public static void consultarSaldo() {
        System.out.println("Seu saldo e: R$ " + saldo);
    }

    public static void main(String[] args) {
        int opcao;

        do {
            mostrarMenu();
            System.out.print("Escolha uma opcao: ");
            opcao = sc.nextInt();

            if (opcao == 1) {
                depositar(lerValor());
            } else if (opcao == 2) {
                sacar(lerValor());
            } else if (opcao == 3) {
                consultarSaldo();
            } else if (opcao != 0) {
                System.out.println("Opcao invalida!");
            }
        } while (opcao != 0);

        System.out.println("Obrigado por usar o banco!");
    }
}
