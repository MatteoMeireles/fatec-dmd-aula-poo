public class Ex2 {

    static class Ponto2D {
        private double x;
        private double y;

        // a) construtores sobrecarregados
        public Ponto2D() {
            this.x = 0;
            this.y = 0;
        }

        public Ponto2D(double x, double y) {
            this.x = x;
            this.y = y;
        }

        public Ponto2D(Ponto2D outro) {
            this.x = outro.x;
            this.y = outro.y;
        }

        // b) getters e setters
        public double getX() {
            return x;
        }

        public double getY() {
            return y;
        }

        public void setX(double x) {
            this.x = x;
        }

        public void setY(double y) {
            this.y = y;
        }

        // c) metodos de movimentacao sobrecarregados
        public void mover() {
            this.x = 0;
            this.y = 0;
        }

        public void mover(double x, double y) {
            this.x = x;
            this.y = y;
        }

        public void mover(Ponto2D outro) {
            this.x = outro.x;
            this.y = outro.y;
        }

        // d) comparacao semantica
        public boolean equals(Object obj) {
            if (!(obj instanceof Ponto2D)) {
                return false;
            }
            Ponto2D outro = (Ponto2D) obj;
            return this.x == outro.x && this.y == outro.y;
        }

        // e) representacao em String
        public String toString() {
            return "(" + x + ", " + y + ")";
        }

        // distancia entre dois pontos
        public double distancia(Ponto2D outro) {
            double dx = outro.x - this.x;
            double dy = outro.y - this.y;
            return Math.sqrt(dx * dx + dy * dy);
        }

        // f) clone: cria um novo ponto no mesmo local
        public Ponto2D clone() {
            return new Ponto2D(this.x, this.y);
        }
    }

    public static void main(String[] args) {
        Ponto2D origem = new Ponto2D();
        Ponto2D a = new Ponto2D(3, 4);
        Ponto2D b = new Ponto2D(a);

        System.out.println("origem = " + origem);
        System.out.println("a = " + a);
        System.out.println("b (copia de a) = " + b);

        System.out.println("a e b sao iguais? " + a.equals(b));
        System.out.println("a e origem sao iguais? " + a.equals(origem));
        System.out.println("Distancia de a ate a origem: " + a.distancia(origem));

        Ponto2D c = a.clone();
        c.mover(10, 20);
        System.out.println("c (clone de a, movido para 10,20) = " + c);
        System.out.println("a continua em " + a);

        c.mover(origem);
        System.out.println("c movido para o ponto origem = " + c);

        c.setX(7);
        c.setY(8);
        System.out.println("c depois dos setters = " + c + " (x=" + c.getX() + ", y=" + c.getY() + ")");

        c.mover();
        System.out.println("c depois de mover() sem parametros = " + c);
    }
}
