import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double[] numeros = new double[6];
        double soma = 0;

        for (int i = 0; i < 6; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = entrada.nextDouble();

            soma += numeros[i];
        }

        double media = soma / 6;

        System.out.println("Média = " + media);

        entrada.close();
    }
}