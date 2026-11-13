import java.util.Scanner;

public class Ex10 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[] numeros = new int[10];

        for (int i = 0; i < 10; i++) {
        
            System.out.print("Digite um número: ");
            numeros[i] = entrada.nextInt();
        }

        System.out.println("Valores únicos:");

        for (int i = 0; i < 10; i++) {

            boolean repetido = false;

            for (int j = 0; j < i; j++) {

                if (numeros[i] == numeros[j]) {
                    repetido = true;
                }
            }

            if (!repetido) {
                System.out.println(numeros[i]);
            }
        }
    }
}
