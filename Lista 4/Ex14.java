import java.util.Scanner;

public class Ex14 {

    static Scanner sc = new Scanner(System.in);
    static double saldo = 500;

    public static void mostrarMenu() {
        System.out.println();
        System.out.println("===== CAIXA ELETRONICO =====");
        System.out.println("1 - Depositar");
        System.out.println("2 - Sacar");
        System.out.println("3 - Consultar saldo");
        System.out.println("4 - Encerrar");
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
            System.out.println("Saque realizado. Retire o dinheiro.");
        }
    }

    public static void consultarSaldo() {
        System.out.println("Saldo atual: R$ " + saldo);
    }

    public static void encerrarSistema() {
        System.out.println("Sistema encerrado. Retire seu cartao.");
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
            } else if (opcao == 4) {
                encerrarSistema();
            } else {
                System.out.println("Opcao invalida!");
            }
        } while (opcao != 4);
    }
}
