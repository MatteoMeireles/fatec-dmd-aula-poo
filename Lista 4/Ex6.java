import java.util.Scanner;

public class Ex6 {

    static Scanner sc = new Scanner(System.in);

    public static int lerNumero() {
        System.out.print("Digite o numero da tabuada: ");
        return sc.nextInt();
    }

    public static void mostrarLinha(int numero, int multiplicador) {
        System.out.println(numero + " x " + multiplicador + " = " + (numero * multiplicador));
    }

    public static void exibirTabuada(int numero) {
        for (int i = 1; i <= 10; i++) {
            mostrarLinha(numero, i);
        }
    }

    public static void main(String[] args) {
        int numero = lerNumero();
        exibirTabuada(numero);
    }
}
