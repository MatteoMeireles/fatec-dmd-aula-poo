public class Ex5 {

    static class Ponto2D {
        private double x;
        private double y;

        public Ponto2D(double x, double y) {
            this.x = x;
            this.y = y;
        }

        public double getX() {
            return x;
        }

        public double getY() {
            return y;
        }

        public String toString() {
            return "(" + x + ", " + y + ")";
        }
    }

    static class Circulo {
        private double raio;
        private Ponto2D centro;

        // a) raio e ponto (centro)
        public Circulo(double raio, Ponto2D centro) {
            this.raio = raio;
            this.centro = new Ponto2D(centro.getX(), centro.getY());
        }

        // b) so o raio: centro na origem
        public Circulo(double raio) {
            this.raio = raio;
            this.centro = new Ponto2D(0, 0);
        }

        // c) acesso ao raio
        public double getRaio() {
            return raio;
        }

        public void setRaio(double raio) {
            this.raio = raio;
        }

        public Ponto2D getCentro() {
            return centro;
        }

        // d) inflar e desinflar de um valor dado
        public void inflar(double valor) {
            raio = raio + valor;
        }

        public void desinflar(double valor) {
            raio = raio - valor;
            if (raio < 0) {
                raio = 0; // o raio nao pode ficar negativo
            }
        }

        // e) inflar e desinflar de uma unidade
        public void inflar() {
            inflar(1);
        }

        public void desinflar() {
            desinflar(1);
        }

        // h) mover (sobrecarregado)
        public void mover() {
            centro = new Ponto2D(0, 0);
        }

        public void mover(double x, double y) {
            centro = new Ponto2D(x, y);
        }

        public void mover(Ponto2D novoCentro) {
            centro = new Ponto2D(novoCentro.getX(), novoCentro.getY());
        }

        // f) area
        public double area() {
            return Math.PI * raio * raio;
        }

        public String toString() {
            return "Circulo de raio " + raio + " com centro em " + centro;
        }
    }

    public static void main(String[] args) {
        Circulo c1 = new Circulo(2, new Ponto2D(3, 4));
        Circulo c2 = new Circulo(5);

        System.out.println("c1: " + c1);
        System.out.println("c2: " + c2);
        System.out.println("Area de c1: " + c1.area());
        System.out.println("Raio de c2: " + c2.getRaio());

        c1.inflar(3);
        System.out.println("c1 depois de inflar(3): raio = " + c1.getRaio());
        c1.desinflar(1);
        System.out.println("c1 depois de desinflar(1): raio = " + c1.getRaio());
        c1.inflar();
        System.out.println("c1 depois de inflar(): raio = " + c1.getRaio());
        c1.desinflar();
        System.out.println("c1 depois de desinflar(): raio = " + c1.getRaio());

        c1.mover(10, 20);
        System.out.println("c1 depois de mover(10, 20): " + c1);
        c1.mover(new Ponto2D(-1, -2));
        System.out.println("c1 depois de mover(outro ponto): " + c1);
        c1.mover();
        System.out.println("c1 depois de mover(): " + c1);
    }
}
