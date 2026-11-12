import java.util.Scanner;

public class Ex8 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Quantos números deseja informar? ");
        int quantidade = entrada.nextInt();

        double soma = 0;

        for (int i = 1; i <= quantidade; i++) {

            System.out.print("Digite um número: ");
            double numero = entrada.nextDouble();

            soma = soma + numero;

        }

        double media = soma / quantidade;

        System.out.println("Média = " + media);

    }
}