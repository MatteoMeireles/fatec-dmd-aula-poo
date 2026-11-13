import java.util.Scanner;

public class Ex24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Digite o valor da posicao [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.print("Digite o numero que voce quer procurar: ");
        int numero = sc.nextInt();

        boolean achou = false;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (matriz[i][j] == numero) {
                    // soma 1 para mostrar linha e coluna comecando do 1
                    System.out.println("Encontrado na linha " + (i + 1) + " e coluna " + (j + 1));
                    achou = true;
                }
            }
        }

        if (!achou) {
            System.out.println("O numero " + numero + " nao esta na matriz.");
        }

        sc.close();
    }
}
