import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite o valor da posicao [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        boolean identidade = true;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    // na diagonal tem que ser 1
                    if (matriz[i][j] != 1) {
                        identidade = false;
                    }
                } else {
                    // fora da diagonal tem que ser 0
                    if (matriz[i][j] != 0) {
                        identidade = false;
                    }
                }
            }
        }

        if (identidade) {
            System.out.println("A matriz e identidade.");
        } else {
            System.out.println("A matriz NAO e identidade.");
        }

        sc.close();
    }
}
