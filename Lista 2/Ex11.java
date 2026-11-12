import java.util.Scanner;

public class Ex11 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero;

        do {

            System.out.print("Digite um número entre 1 e 10: ");
            numero = entrada.nextInt();

        } while (numero < 1 || numero > 10);

        System.out.println("Número válido!");

    }
}