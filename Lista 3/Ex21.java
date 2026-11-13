import java.util.Scanner;

public class Ex21 {

    public static void mostrarTabuleiro(char[][] tab) {
        System.out.println();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" " + tab[i][j] + " ");
                if (j < 2) {
                    System.out.print("|");
                }
            }
            System.out.println();
            if (i < 2) {
                System.out.println("-----------");
            }
        }
        System.out.println();
    }

    public static boolean ganhou(char[][] tab, char jogador) {
        // linhas e colunas
        for (int i = 0; i < 3; i++) {
            if (tab[i][0] == jogador && tab[i][1] == jogador && tab[i][2] == jogador) {
                return true;
            }
            if (tab[0][i] == jogador && tab[1][i] == jogador && tab[2][i] == jogador) {
                return true;
            }
        }
        // diagonais
        if (tab[0][0] == jogador && tab[1][1] == jogador && tab[2][2] == jogador) {
            return true;
        }
        if (tab[0][2] == jogador && tab[1][1] == jogador && tab[2][0] == jogador) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] tabuleiro = new char[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tabuleiro[i][j] = ' ';
            }
        }

        char jogadorAtual = 'X';
        int jogadas = 0;
        boolean terminou = false;

        System.out.println("=== JOGO DA VELHA ===");
        System.out.println("Linhas e colunas vao de 1 a 3.");

        while (!terminou) {
            mostrarTabuleiro(tabuleiro);
            System.out.println("Vez do jogador " + jogadorAtual);
            System.out.print("Linha (1 a 3): ");
            int linha = sc.nextInt() - 1;
            System.out.print("Coluna (1 a 3): ");
            int coluna = sc.nextInt() - 1;

            if (linha < 0 || linha > 2 || coluna < 0 || coluna > 2) {
                System.out.println("Posicao invalida! Tente de novo.");
            } else if (tabuleiro[linha][coluna] != ' ') {
                System.out.println("Essa posicao ja esta ocupada! Tente de novo.");
            } else {
                tabuleiro[linha][coluna] = jogadorAtual;
                jogadas++;

                if (ganhou(tabuleiro, jogadorAtual)) {
                    mostrarTabuleiro(tabuleiro);
                    System.out.println("O jogador " + jogadorAtual + " ganhou!");
                    terminou = true;
                } else if (jogadas == 9) {
                    mostrarTabuleiro(tabuleiro);
                    System.out.println("Deu velha! Empate.");
                    terminou = true;
                } else {
                    // troca o jogador
                    if (jogadorAtual == 'X') {
                        jogadorAtual = 'O';
                    } else {
                        jogadorAtual = 'X';
                    }
                }
            }
        }

        sc.close();
    }
}
