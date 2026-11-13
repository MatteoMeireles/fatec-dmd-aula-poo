import java.util.Scanner;

public class Ex25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int somaSecundaria = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite o valor da posicao [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < 3; i++) {
            somaSecundaria = somaSecundaria + matriz[i][2 - i];
        }

        System.out.println("Soma da diagonal secundaria: " + somaSecundaria);

        sc.close();
    }
}
