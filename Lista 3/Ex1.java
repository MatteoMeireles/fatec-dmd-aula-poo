import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] numeros = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = entrada.nextInt();
        }

        System.out.println("Valores digitados:");

        for (int i = 0; i < 5; i++) {
            System.out.println(numeros[i]);
        }

        entrada.close();
    }
}