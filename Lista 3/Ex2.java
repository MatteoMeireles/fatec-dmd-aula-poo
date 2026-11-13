import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] numeros = new int[10];
        int soma = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = entrada.nextInt();

            soma += numeros[i];
        }

        System.out.println("Soma = " + soma);

        entrada.close();
    }
}