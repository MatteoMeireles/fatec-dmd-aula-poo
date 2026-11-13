import java.util.Scanner;

public class Ex22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite o valor da posicao [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        boolean temRepetido = false;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    for (int l = 0; l < 3; l++) {
                        // so compara se nao for a mesma posicao
                        if (!(i == k && j == l)) {
                            if (matriz[i][j] == matriz[k][l]) {
                                temRepetido = true;
                            }
                        }
                    }
                }
            }
        }

        if (temRepetido) {
            System.out.println("A matriz possui numeros repetidos.");
        } else {
            System.out.println("A matriz NAO possui numeros repetidos.");
        }

        sc.close();
    }
}
