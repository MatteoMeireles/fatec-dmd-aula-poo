public class Ex3 {

    static class NumeroComplexo {
        private double real;
        private double imaginario;

        public NumeroComplexo(double real, double imaginario) {
            this.real = real;
            this.imaginario = imaginario;
        }

        public double getReal() {
            return real;
        }

        public double getImaginario() {
            return imaginario;
        }

        public void setReal(double real) {
            this.real = real;
        }

        public void setImaginario(double imaginario) {
            this.imaginario = imaginario;
        }

        // (a+bi) + (c+di) = (a+c) + (b+d)i  -> altera o numero que recebeu a mensagem
        public void somar(NumeroComplexo outro) {
            this.real = this.real + outro.real;
            this.imaginario = this.imaginario + outro.imaginario;
        }

        // (a+bi) - (c+di) = (a-c) + (b-d)i
        public void subtrair(NumeroComplexo outro) {
            this.real = this.real - outro.real;
            this.imaginario = this.imaginario - outro.imaginario;
        }

        // (a+bi) * (c+di) = (ac-bd) + (ad+bc)i
        public void multiplicar(NumeroComplexo outro) {
            double a = this.real;
            double b = this.imaginario;
            double c = outro.real;
            double d = outro.imaginario;

            this.real = a * c - b * d;
            this.imaginario = a * d + b * c;
        }

        // (a+bi) / (c+di) = (ac+bd)/(c^2+d^2) + (bc-ad)/(c^2+d^2)i
        public void dividir(NumeroComplexo outro) {
            double a = this.real;
            double b = this.imaginario;
            double c = outro.real;
            double d = outro.imaginario;

            double denominador = c * c + d * d;

            if (denominador == 0) {
                System.out.println("Nao existe divisao por zero! O numero nao foi alterado.");
                return;
            }

            this.real = (a * c + b * d) / denominador;
            this.imaginario = (b * c - a * d) / denominador;
        }

        // comparacao semantica
        public boolean equals(Object obj) {
            if (!(obj instanceof NumeroComplexo)) {
                return false;
            }
            NumeroComplexo outro = (NumeroComplexo) obj;
            return this.real == outro.real && this.imaginario == outro.imaginario;
        }

        // representacao: a + bi
        public String toString() {
            if (imaginario < 0) {
                return real + " - " + (-imaginario) + "i";
            } else {
                return real + " + " + imaginario + "i";
            }
        }

        // modulo: raiz de (a^2 + b^2)
        public double modulo() {
            return Math.sqrt(real * real + imaginario * imaginario);
        }
    }

    public static void main(String[] args) {
        NumeroComplexo z1 = new NumeroComplexo(3, 4);
        NumeroComplexo z2 = new NumeroComplexo(1, 2);

        System.out.println("z1 = " + z1);
        System.out.println("z2 = " + z2);

        NumeroComplexo r = new NumeroComplexo(z1.getReal(), z1.getImaginario());
        r.somar(z2);
        System.out.println("z1 + z2 = " + r);

        r = new NumeroComplexo(z1.getReal(), z1.getImaginario());
        r.subtrair(z2);
        System.out.println("z1 - z2 = " + r);

        r = new NumeroComplexo(z1.getReal(), z1.getImaginario());
        r.multiplicar(z2);
        System.out.println("z1 * z2 = " + r);

        r = new NumeroComplexo(z1.getReal(), z1.getImaginario());
        r.dividir(z2);
        System.out.println("z1 / z2 = " + r);

        System.out.println("z1 e igual a z2? " + z1.equals(z2));
        System.out.println("z1 e igual a 3 + 4i? " + z1.equals(new NumeroComplexo(3, 4)));

        // exemplos do enunciado
        NumeroComplexo ex1 = new NumeroComplexo(3, 4);
        NumeroComplexo ex2 = new NumeroComplexo(6, -8);
        System.out.println("|" + ex1 + "| = " + ex1.modulo());
        System.out.println("|" + ex2 + "| = " + ex2.modulo());
    }
}
