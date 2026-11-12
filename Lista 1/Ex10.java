import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Valor da compra: ");
        double valor = sc.nextDouble();

        if (valor >= 100) {
            valor = valor * 0.9;
        }

        System.out.println("Valor final: R$ " + valor);

        sc.close();
    }
}