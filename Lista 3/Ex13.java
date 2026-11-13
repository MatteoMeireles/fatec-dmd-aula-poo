import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[][] matriz = new int[3][3];
        int soma = 0;

        System.out.println("Digite os 9 valores da matriz:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = entrada.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            soma += matriz[i][i];
        }

        System.out.println("Soma da diagonal principal = " + soma);

        entrada.close();
    }
}