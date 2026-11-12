import java.util.Scanner;

public class Ex6 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int maior = Integer.MIN_VALUE;

        for (int i = 1; i <= 5; i++) {

            System.out.print("Digite um número: ");
            int numero = entrada.nextInt();

            if (numero > maior) {
                maior = numero;
            }

        }

        System.out.println("Maior número: " + maior);

    }
}