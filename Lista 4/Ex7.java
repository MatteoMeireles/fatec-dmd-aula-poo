public class Ex7 {

    public static void mostrarNumeros() {
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void mostrarPares() {
        for (int i = 2; i <= 100; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void mostrarImpares() {
        for (int i = 1; i <= 100; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("Numeros de 1 a 100:");
        mostrarNumeros();

        System.out.println();
        System.out.println("Pares:");
        mostrarPares();

        System.out.println();
        System.out.println("Impares:");
        mostrarImpares();
    }
}
