import java.util.Scanner;

public class Ex4 {

    static Scanner sc = new Scanner(System.in);

    public static double lerNota(int numero) {
        double nota;
        do {
            System.out.print("Digite a nota " + numero + " (0 a 10): ");
            nota = sc.nextDouble();
            if (nota < 0 || nota > 10) {
                System.out.println("Nota invalida! Tente de novo.");
            }
        } while (nota < 0 || nota > 10);
        return nota;
    }

    public static double calcularMedia(double n1, double n2, double n3) {
        return (n1 + n2 + n3) / 3;
    }

    public static String verificarSituacao(double media) {
        if (media >= 7) {
            return "Aprovado";
        } else if (media >= 5) {
            return "Recuperacao";
        } else {
            return "Reprovado";
        }
    }

    public static void mostrarResultado(double media, String situacao) {
        System.out.println("Media: " + media);
        System.out.println("Situacao: " + situacao);
    }

    public static void main(String[] args) {
        double nota1 = lerNota(1);
        double nota2 = lerNota(2);
        double nota3 = lerNota(3);

        double media = calcularMedia(nota1, nota2, nota3);
        String situacao = verificarSituacao(media);

        mostrarResultado(media, situacao);
    }
}
