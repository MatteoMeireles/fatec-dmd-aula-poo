import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] numeros = new int[10];
        int contador = 0;

        System.out.println("Digite 10 números:");

        for (int i = 0; i < 10; i++) {
            numeros[i] = entrada.nextInt();
        }

        System.out.print("Digite X: ");
        int x = entrada.nextInt();

        for (int i = 0; i < 10; i++) {
            if (numeros[i] == x) {
                contador++;
            }
        }

        System.out.println("Quantidade: " + contador);

        entrada.close();
    }
}