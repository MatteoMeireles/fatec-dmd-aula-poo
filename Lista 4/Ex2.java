public class Ex2 {

    public static int somar(int a, int b) {
        return a + b;
    }

    public static void mostrarResultado(int resultado) {
        System.out.println("Resultado: " + resultado);
    }

    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 20;

        int soma = somar(n1, n2);
        mostrarResultado(soma);
    }
}
