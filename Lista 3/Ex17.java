import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[][] matriz = new int[3][3];

        System.out.println("Digite os 9 valores da matriz:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = entrada.nextInt();
            }
        }

        System.out.print("Digite o multiplicador: ");
        int numero = entrada.nextInt();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = matriz[i][j] * numero;
            }
        }

        System.out.println("Resultado:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        entrada.close();
    }
}