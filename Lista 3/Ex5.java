import java.util.Scanner;

public class Ex5 {
        public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] numeros = new int[10];
        int pares = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = entrada.nextInt();

            if (numeros[i] % 2 == 0) {
                pares++;
            }
        }

        System.out.println("Quantidade de pares: " + pares);

        entrada.close();
    }
}