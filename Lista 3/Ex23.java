import java.util.Scanner;

public class Ex23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int[][] girada = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite o valor da posicao [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                girada[j][2 - i] = matriz[i][j];
            }
        }

        System.out.println("Matriz original:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Matriz girada 90 graus:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(girada[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
