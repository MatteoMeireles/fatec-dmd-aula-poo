import java.util.Scanner;

// Mini jogo: Quiz de Java
public class Ex15 {

    static Scanner sc = new Scanner(System.in);
    static String jogador;
    static int pontos = 0;

    static String[] perguntas = {
        "Qual comando mostra algo na tela?",
        "Qual tipo guarda numeros inteiros?",
        "Qual laco repete um bloco varias vezes?",
        "Qual e o primeiro indice de um array?",
        "Qual simbolo compara se dois valores sao iguais?"
    };

    static String[] opcoes = {
        "1 - System.out.println\n2 - Scanner\n3 - for",
        "1 - String\n2 - int\n3 - boolean",
        "1 - if\n2 - for\n3 - return",
        "1 - 0\n2 - 1\n3 - -1",
        "1 - =\n2 - ==\n3 - =>"
    };

    static int[] respostasCorretas = {1, 2, 2, 1, 2};

    public static void mostrarMenu() {
        System.out.println("===== QUIZ DE JAVA =====");
        System.out.println("1 - Jogar");
        System.out.println("2 - Sair");
    }

    public static int lerOpcao() {
        System.out.print("Escolha: ");
        int opcao = sc.nextInt();
        sc.nextLine(); // limpa o enter que sobrou
        return opcao;
    }

    public static void criarJogador() {
        System.out.print("Digite seu nome: ");
        jogador = sc.nextLine();
        pontos = 0;
    }

    public static void executarTurno(int numero) {
        System.out.println();
        System.out.println("Pergunta " + (numero + 1) + ": " + perguntas[numero]);
        System.out.println(opcoes[numero]);

        int resposta = lerOpcao();

        if (resposta == respostasCorretas[numero]) {
            pontos++;
            System.out.println("Resposta certa!");
        } else {
            System.out.println("Resposta errada.");
        }
    }

    public static boolean verificarVitoria() {
        return pontos >= 3;
    }

    public static void encerrarJogo() {
        System.out.println();
        System.out.println(jogador + ", voce fez " + pontos + " ponto(s) de " + perguntas.length + ".");

        if (verificarVitoria()) {
            System.out.println("Parabens, voce venceu o quiz!");
        } else {
            System.out.println("Voce perdeu. Estude mais e tente de novo!");
        }
    }

    public static void iniciarJogo() {
        mostrarMenu();
        int opcao = lerOpcao();

        if (opcao == 1) {
            criarJogador();
            for (int i = 0; i < perguntas.length; i++) {
                executarTurno(i);
            }
            encerrarJogo();
        } else {
            System.out.println("Ate a proxima!");
        }
    }

    public static void main(String[] args) {
        iniciarJogo();
    }
}
