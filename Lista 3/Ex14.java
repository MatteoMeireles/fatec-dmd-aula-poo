import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[][] matriz = new int[4][4];

        System.out.println("Digite os 16 valores da matriz:");

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = entrada.nextInt();
            }
        }

        int maior = matriz[0][0];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                }
            }
        }

        System.out.println("Maior valor = " + maior);

        entrada.close();
    }
}