import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[][] matriz = new int[3][3];
        int pares = 0;

        System.out.println("Digite os 9 valores da matriz:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = entrada.nextInt();

                if (matriz[i][j] % 2 == 0) {
                    pares++;
                }
            }
        }

        System.out.println("Quantidade de pares = " + pares);

        entrada.close();
    }
}