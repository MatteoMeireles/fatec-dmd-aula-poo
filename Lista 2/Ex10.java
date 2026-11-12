import java.util.Scanner;

public class Ex10 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero;
        int soma = 0;

        do {

            System.out.print("Digite um número (0 para parar): ");
            numero = entrada.nextInt();

            soma = soma + numero;

        } while (numero != 0);

        System.out.println("Soma total = " + soma);

    }
}