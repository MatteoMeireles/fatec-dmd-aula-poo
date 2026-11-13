import java.util.Scanner;

public class Ex3 {

    static Scanner sc = new Scanner(System.in);

    public static int lerNumero() {
        System.out.print("Digite um numero: ");
        return sc.nextInt();
    }

    public static boolean ehPar(int numero) {
        return numero % 2 == 0;
    }

    public static void mostrarResultado(int numero, boolean par) {
        if (par) {
            System.out.println("O numero " + numero + " e par.");
        } else {
            System.out.println("O numero " + numero + " e impar.");
        }
    }

    public static void main(String[] args) {
        int numero = lerNumero();
        boolean par = ehPar(numero);
        mostrarResultado(numero, par);
    }
}
