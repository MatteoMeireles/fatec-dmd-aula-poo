import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] numeros = new int[10];
        boolean encontrou = false;

        for (int i = 0; i < 10; i++) {
            numeros[i] = entrada.nextInt();
        }

        System.out.print("Digite o valor X: ");
        int x = entrada.nextInt();

        for (int i = 0; i < 10; i++) {
            if (numeros[i] == x) {
                encontrou = true;
            }
        }

        if (encontrou) {
            System.out.println("Está presente.");
        } else {
            System.out.println("Não está presente.");
        }

        entrada.close();
    }
}
