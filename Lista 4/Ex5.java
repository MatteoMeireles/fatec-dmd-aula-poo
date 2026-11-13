import java.util.Scanner;

public class Ex5 {

    static Scanner sc = new Scanner(System.in);

    public static void mostrarMenu() {
        System.out.println();
        System.out.println("===== CALCULADORA =====");
        System.out.println("1 - Somar");
        System.out.println("2 - Subtrair");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");
        System.out.println("0 - Sair");
    }

    public static double lerNumero() {
        System.out.print("Digite um numero: ");
        return sc.nextDouble();
    }

    public static double somar(double a, double b) {
        return a + b;
    }

    public static double subtrair(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        return a / b;
    }

    public static void mostrarResultado(double resultado) {
        System.out.println("Resultado: " + resultado);
    }

    // le os dois numeros e chama a operacao escolhida
    public static void calcular(int opcao) {
        double n1 = lerNumero();
        double n2 = lerNumero();

        if (opcao == 1) {
            mostrarResultado(somar(n1, n2));
        } else if (opcao == 2) {
            mostrarResultado(subtrair(n1, n2));
        } else if (opcao == 3) {
            mostrarResultado(multiplicar(n1, n2));
        } else if (opcao == 4) {
            if (n2 == 0) {
                System.out.println("Nao existe divisao por zero!");
            } else {
                mostrarResultado(dividir(n1, n2));
            }
        }
    }

    public static void main(String[] args) {
        int opcao;

        do {
            mostrarMenu();
            System.out.print("Escolha uma opcao: ");
            opcao = sc.nextInt();

            if (opcao >= 1 && opcao <= 4) {
                calcular(opcao);
            } else if (opcao != 0) {
                System.out.println("Opcao invalida!");
            }
        } while (opcao != 0);

        System.out.println("Calculadora encerrada.");
    }
}
