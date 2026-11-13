public class Ex1 {

    // as classes ficam dentro do arquivo para cada exercicio ser um arquivo so
    static class Contador {
        private int valor;

        public Contador() {
            valor = 0;
        }

        public void zerar() {
            valor = 0;
        }

        public void incrementar() {
            valor = valor + 1;
        }

        public int getValor() {
            return valor;
        }
    }

    public static void main(String[] args) {
        Contador contador = new Contador();
        System.out.println("Valor inicial: " + contador.getValor());

        for (int i = 0; i < 5; i++) {
            contador.incrementar();
        }
        System.out.println("Depois de incrementar 5 vezes: " + contador.getValor());

        contador.zerar();
        System.out.println("Depois de zerar: " + contador.getValor());
    }
}
