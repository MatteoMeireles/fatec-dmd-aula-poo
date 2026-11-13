public class Ex4 {

    // versao simples do Ponto2D (o mesmo da questao 2), so o que a Reta precisa
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

    // reta y = a x + b
    static class Reta {
        private double a; // coeficiente angular
        private double b; // coeficiente linear

        // i) a partir do coeficiente angular e do linear
        public Reta(double a, double b) {
            this.a = a;
            this.b = b;
        }

        // ii) a partir de dois pontos
        public Reta(Ponto2D p1, Ponto2D p2) {
            // reta vertical (x = constante) nao da pra escrever como y = ax + b
            if (p1.getX() == p2.getX()) {
                throw new IllegalArgumentException("Os pontos tem o mesmo x: a reta e vertical.");
            }
            this.a = (p2.getY() - p1.getY()) / (p2.getX() - p1.getX());
            this.b = p1.getY() - this.a * p1.getX();
        }

        public double getA() {
            return a;
        }

        public double getB() {
            return b;
        }

        // verifica se o ponto esta na reta (y = a*x + b)
        public boolean pertence(Ponto2D p) {
            double yDaReta = a * p.getX() + b;
            // pequena tolerancia por causa de erros dos numeros double
            return Math.abs(p.getY() - yDaReta) < 0.000001;
        }

        public String toString() {
            if (b < 0) {
                return "y = " + a + "x - " + (-b);
            } else {
                return "y = " + a + "x + " + b;
            }
        }

        // retorna o ponto de intersecao ou null se as retas forem paralelas
        public Ponto2D interseccao(Reta outra) {
            if (this.a == outra.a) {
                return null;
            }
            double x = (outra.b - this.b) / (this.a - outra.a);
            double y = this.a * x + this.b;
            return new Ponto2D(x, y);
        }
    }

    public static void main(String[] args) {
        Reta r1 = new Reta(1, 1);      // y = x + 1
        Reta r2 = new Reta(-2, 2);     // y = -2x + 2
        Reta r3 = new Reta(1, 5);      // y = x + 5 (paralela a r1)

        System.out.println("r1: " + r1);
        System.out.println("r2: " + r2);
        System.out.println("r3: " + r3);

        System.out.println("Coeficiente angular de r2: " + r2.getA());
        System.out.println("Coeficiente linear de r2: " + r2.getB());

        Ponto2D p1 = new Ponto2D(0, 1);
        Ponto2D p2 = new Ponto2D(2, 3);
        Ponto2D p3 = new Ponto2D(1, 5);

        System.out.println("O ponto " + p1 + " pertence a r1? " + r1.pertence(p1));
        System.out.println("O ponto " + p3 + " pertence a r1? " + r1.pertence(p3));

        Reta r4 = new Reta(p1, p2);
        System.out.println("Reta que passa por " + p1 + " e " + p2 + ": " + r4);

        Ponto2D inter = r1.interseccao(r2);
        System.out.println("Intersecao de r1 com r2: " + inter);

        Ponto2D inter2 = r1.interseccao(r3);
        if (inter2 == null) {
            System.out.println("r1 e r3 sao paralelas (intersecao = null)");
        }
    }
}
