public class Ex9 {

    static class Conjunto {
        private String[] elementos = new String[2];
        private int tamanho = 0;

        public int getTamanho() {
            return tamanho;
        }

        private void crescer() {
            String[] novo = new String[elementos.length * 2];
            for (int i = 0; i < tamanho; i++) {
                novo[i] = elementos[i];
            }
            elementos = novo;
        }

        public boolean pertence(String elemento) {
            for (int i = 0; i < tamanho; i++) {
                if (elementos[i].equals(elemento)) {
                    return true;
                }
            }
            return false;
        }

        public boolean adicionar(String elemento) {
            if (elemento == null || pertence(elemento)) {
                return false;
            }
            if (tamanho == elementos.length) {
                crescer();
            }
            elementos[tamanho] = elemento;
            tamanho++;
            return true;
        }

        public Conjunto uniao(Conjunto outro) {
            Conjunto resultado = new Conjunto();
            for (int i = 0; i < this.tamanho; i++) {
                resultado.adicionar(this.elementos[i]);
            }
            for (int i = 0; i < outro.tamanho; i++) {
                resultado.adicionar(outro.elementos[i]);
            }
            return resultado;
        }

        public Conjunto inter(Conjunto outro) {
            Conjunto resultado = new Conjunto();
            for (int i = 0; i < this.tamanho; i++) {
                if (outro.pertence(this.elementos[i])) {
                    resultado.adicionar(this.elementos[i]);
                }
            }
            return resultado;
        }

       public Conjunto menos(Conjunto outro) {
            Conjunto resultado = new Conjunto();
            for (int i = 0; i < this.tamanho; i++) {
                if (!outro.pertence(this.elementos[i])) {
                    resultado.adicionar(this.elementos[i]);
                }
            }
            return resultado;
        }

        public String toString() {
            String texto = "{";
            for (int i = 0; i < tamanho; i++) {
                texto = texto + elementos[i];
                if (i < tamanho - 1) {
                    texto = texto + ", ";
                }
            }
            texto = texto + "}";
            return texto;
        }
    }

    public static void main(String[] args) {
        Conjunto a = new Conjunto();
        a.adicionar("maca");
        a.adicionar("banana");
        a.adicionar("uva");
        a.adicionar("pera");
        a.adicionar("maca"); // repetido, nao entra

        Conjunto b = new Conjunto();
        b.adicionar("uva");
        b.adicionar("pera");
        b.adicionar("laranja");
        b.adicionar("kiwi");
        b.adicionar("limao");

        System.out.println("A = " + a + " (tamanho " + a.getTamanho() + ")");
        System.out.println("B = " + b + " (tamanho " + b.getTamanho() + ")");

        System.out.println("'banana' pertence a A? " + a.pertence("banana"));
        System.out.println("'banana' pertence a B? " + b.pertence("banana"));

        System.out.println("A uniao B = " + a.uniao(b));
        System.out.println("A inter B = " + a.inter(b));
        System.out.println("A menos B = " + a.menos(b));
        System.out.println("B menos A = " + b.menos(a));
    }
}
