import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] numeros = new int[8];

        for (int i = 0; i < 8; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = entrada.nextInt();
        }

        int maior = numeros[0];
        int menor = numeros[0];

        for (int i = 1; i < 8; i++) {

            if (numeros[i] > maior) {
                maior = numeros[i];
            }

            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);

        entrada.close();
    }
}