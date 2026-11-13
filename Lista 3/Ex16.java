import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[][] matriz = new int[3][3];

        System.out.println("Digite os 9 valores da matriz:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = entrada.nextInt();
            }
        }

        System.out.println("Transposta:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[j][i] + " ");
            }
            System.out.println();
        }

        entrada.close();
    }
}
