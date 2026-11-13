import java.util.Random;
import java.util.Scanner;

public class Ex12 {

    static Scanner sc = new Scanner(System.in);
    static Random random = new Random();

    public static void mostrarMenu() {
        System.out.println();
        System.out.println("===== PEDRA, PAPEL OU TESOURA =====");
        System.out.println("1 - Pedra");
        System.out.println("2 - Papel");
        System.out.println("3 - Tesoura");
        System.out.println("0 - Sair");
    }

    public static String nomeDaJogada(int jogada) {
        if (jogada == 1) {
            return "Pedra";
        } else if (jogada == 2) {
            return "Papel";
        } else {
            return "Tesoura";
        }
    }

    public static int jogadaComputador() {
        return random.nextInt(3) + 1; // 1, 2 ou 3
    }

    public static int jogadaJogador() {
        int jogada;
        do {
            mostrarMenu();
            System.out.print("Sua jogada: ");
            jogada = sc.nextInt();
            if (jogada < 0 || jogada > 3) {
                System.out.println("Opcao invalida!");
            }
        } while (jogada < 0 || jogada > 3);
        return jogada;
    }

    // retorna 0 = empate, 1 = jogador venceu, 2 = computador venceu
    public static int verificarVencedor(int jogador, int computador) {
        if (jogador == computador) {
            return 0;
        } else if ((jogador == 1 && computador == 3)
                || (jogador == 2 && computador == 1)
                || (jogador == 3 && computador == 2)) {
            return 1;
        } else {
            return 2;
        }
    }

    public static void mostrarResultado(int jogador, int computador, int vencedor) {
        System.out.println("Voce jogou: " + nomeDaJogada(jogador));
        System.out.println("Computador jogou: " + nomeDaJogada(computador));

        if (vencedor == 0) {
            System.out.println("Deu empate!");
        } else if (vencedor == 1) {
            System.out.println("Voce venceu!");
        } else {
            System.out.println("O computador venceu!");
        }
    }

    public static void main(String[] args) {
        boolean jogando = true;

        while (jogando) {
            int jogador = jogadaJogador();

            if (jogador == 0) {
                jogando = false;
            } else {
                int computador = jogadaComputador();
                int vencedor = verificarVencedor(jogador, computador);
                mostrarResultado(jogador, computador, vencedor);
            }
        }

        System.out.println("Fim de jogo!");
    }
}
