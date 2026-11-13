import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] numeros = new int[10];

        System.out.println("Digite 10 números:");

        for (int i = 0; i < 10; i++) {
            numeros[i] = entrada.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            for (int j = i + 1; j < 10; j++) {
                if (numeros[i] > numeros[j]) {
                    int temp = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = temp;
                }
            }
        }

        System.out.println("Ordenado:");

        for (int i = 0; i < 10; i++) {
            System.out.print(numeros[i] + " ");
        }

        entrada.close();
    }
}