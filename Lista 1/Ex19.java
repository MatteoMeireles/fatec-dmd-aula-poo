import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double temp = sc.nextDouble();

        if (temp < 18) {
            System.out.println("Frio");
        } else if (temp <= 28) {
            System.out.println("Agradável");
        } else {
            System.out.println("Quente");
        }

        sc.close();
    }
}