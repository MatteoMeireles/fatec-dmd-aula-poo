import java.util.Random;
import java.util.Scanner;

public class Ex13 {

    static Scanner sc = new Scanner(System.in);
    static Random random = new Random();

    static final int VIDA_MAXIMA = 100;
    static String nome;
    static int vida;
    static int vidaGoblin = 60;

    public static void criarPersonagem() {
        System.out.print("Digite o nome do seu heroi: ");
        nome = sc.nextLine();
        vida = VIDA_MAXIMA;
    }

    public static void mostrarStatus() {
        System.out.println();
        System.out.println("--- STATUS ---");
        System.out.println(nome + ": " + vida + " de vida");
        System.out.println("Goblin: " + vidaGoblin + " de vida");
    }

    public static void mostrarMenu() {
        System.out.println("1 - Atacar");
        System.out.println("2 - Curar");
    }

    // o heroi ataca o goblin
    public static void atacar() {
        int dano = random.nextInt(11) + 10; // de 10 a 20
        vidaGoblin = vidaGoblin - dano;
        if (vidaGoblin < 0) {
            vidaGoblin = 0;
        }
        System.out.println(nome + " atacou e causou " + dano + " de dano!");
    }

    // o heroi perde vida
    public static void receberDano(int dano) {
        vida = vida - dano;
        if (vida < 0) {
            vida = 0;
        }
        System.out.println("O goblin atacou e causou " + dano + " de dano!");
    }

    public static void curar() {
        vida = vida + 20;
        if (vida > VIDA_MAXIMA) {
            vida = VIDA_MAXIMA;
        }
        System.out.println(nome + " se curou!");
    }

    public static void turnoDoGoblin() {
        int dano = random.nextInt(11) + 5; // de 5 a 15
        receberDano(dano);
    }

    public static void main(String[] args) {
        criarPersonagem();

        while (vida > 0 && vidaGoblin > 0) {
            mostrarStatus();
            mostrarMenu();
            System.out.print("Escolha: ");
            int opcao = sc.nextInt();

            if (opcao == 1) {
                atacar();
            } else if (opcao == 2) {
                curar();
            } else {
                System.out.println("Opcao invalida!");
                continue;
            }

            if (vidaGoblin > 0) {
                turnoDoGoblin();
            }
        }

        if (vida > 0) {
            System.out.println("Voce derrotou o goblin! Vitoria!");
        } else {
            System.out.println("Seu heroi caiu em batalha... Fim de jogo.");
        }
    }
}
