import java.util.Random;
import java.util.Scanner;

public class Ex11 {

    static Scanner sc = new Scanner(System.in);
    static Random random = new Random();

    public static int sortearNumero() {
        return random.nextInt(100) + 1; // de 1 a 100
    }

    public static int lerPalpite() {
        System.out.print("Qual o seu palpite? ");
        return sc.nextInt();
    }

    public static boolean verificarAcerto(int palpite, int numeroSorteado) {
        return palpite == numeroSorteado;
    }

    public static void mostrarDica(int palpite, int numeroSorteado) {
        if (palpite < numeroSorteado) {
            System.out.println("Dica: o numero e MAIOR.");
        } else {
            System.out.println("Dica: o numero e MENOR.");
        }
    }

    public static void mostrarVitoria(int tentativas) {
        System.out.println("Parabens, voce acertou em " + tentativas + " tentativa(s)!");
    }

    public static void main(String[] args) {
        System.out.println("=== JOGO DE ADIVINHACAO ===");
        System.out.println("Estou pensando em um numero de 1 a 100.");

        int numeroSorteado = sortearNumero();
        int tentativas = 0;
        boolean acertou = false;

        while (!acertou) {
            int palpite = lerPalpite();
            tentativas++;

            if (verificarAcerto(palpite, numeroSorteado)) {
                acertou = true;
                mostrarVitoria(tentativas);
            } else {
                mostrarDica(palpite, numeroSorteado);
            }
        }
    }
}
