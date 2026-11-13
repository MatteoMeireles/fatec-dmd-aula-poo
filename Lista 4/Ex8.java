import java.util.Scanner;

public class Ex8 {

    static Scanner sc = new Scanner(System.in);

    public static String lerNome() {
        System.out.print("Digite seu nome: ");
        return sc.nextLine();
    }

    public static int lerIdade() {
        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();
        sc.nextLine(); // limpa o enter que sobrou
        return idade;
    }

    public static String lerCidade() {
        System.out.print("Digite sua cidade: ");
        return sc.nextLine();
    }

    public static void mostrarResumo(String nome, int idade, String cidade) {
        System.out.println();
        System.out.println("===== RESUMO =====");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Cidade: " + cidade);
    }

    public static void main(String[] args) {
        String nome = lerNome();
        int idade = lerIdade();
        String cidade = lerCidade();

        mostrarResumo(nome, idade, cidade);
    }
}
