public class Ex10 {

    static class Matriz {
        private double[][] dados;
        private int linhas;
        private int colunas;

        // construtor com as dimensoes (comeca tudo com 0)
        public Matriz(int linhas, int colunas) {
            this.linhas = linhas;
            this.colunas = colunas;
            this.dados = new double[linhas][colunas];
        }

        public int getLinhas() {
            return linhas;
        }

        public int getColunas() {
            return colunas;
        }

        // acesso (leitura/escrita) de cada elemento
        public double get(int linha, int coluna) {
            return dados[linha][coluna];
        }

        public void set(int linha, int coluna, double valor) {
            dados[linha][coluna] = valor;
        }

        private boolean ehQuadrada() {
            return linhas == colunas;
        }

        // a) comparacao semantica
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Matriz)) {
                return false;
            }
            Matriz outra = (Matriz) obj;

            if (this.linhas != outra.linhas || this.colunas != outra.colunas) {
                return false;
            }
            for (int i = 0; i < linhas; i++) {
                for (int j = 0; j < colunas; j++) {
                    if (this.dados[i][j] != outra.dados[i][j]) {
                        return false;
                    }
                }
            }
            return true;
        }

        // b) transposta
        public Matriz transposta() {
            Matriz resultado = new Matriz(colunas, linhas);
            for (int i = 0; i < linhas; i++) {
                for (int j = 0; j < colunas; j++) {
                    resultado.dados[j][i] = this.dados[i][j];
                }
            }
            return resultado;
        }

        // c) oposta (todos os sinais trocados)
        public Matriz oposta() {
            Matriz resultado = new Matriz(linhas, colunas);
            for (int i = 0; i < linhas; i++) {
                for (int j = 0; j < colunas; j++) {
                    resultado.dados[i][j] = 0 - this.dados[i][j];
                }
            }
            return resultado;
        }

        // d) matriz nula (mesmas dimensoes, tudo 0)
        public Matriz gerarNula() {
            return new Matriz(linhas, colunas);
        }

        // e) identidade
        public boolean ehIdentidade() {
            if (!ehQuadrada()) {
                return false;
            }
            for (int i = 0; i < linhas; i++) {
                for (int j = 0; j < colunas; j++) {
                    if (i == j && dados[i][j] != 1) {
                        return false;
                    }
                    if (i != j && dados[i][j] != 0) {
                        return false;
                    }
                }
            }
            return true;
        }

        // f) diagonal
        public boolean ehDiagonal() {
            if (!ehQuadrada()) {
                return false;
            }
            for (int i = 0; i < linhas; i++) {
                for (int j = 0; j < colunas; j++) {
                    if (i != j && dados[i][j] != 0) {
                        return false;
                    }
                }
            }
            return true;
        }

        // g) "singular" (como definido na lista): diagonal com todos os elementos da diagonal iguais
        public boolean ehSingular() {
            if (!ehDiagonal()) {
                return false;
            }
            for (int i = 1; i < linhas; i++) {
                if (dados[i][i] != dados[0][0]) {
                    return false;
                }
            }
            return true;
        }

        // h) simetrica: igual a sua transposta
        public boolean ehSimetrica() {
            if (!ehQuadrada()) {
                return false;
            }
            return this.equals(this.transposta());
        }

        // i) anti-simetrica: a oposta e igual a transposta
        public boolean ehAntiSimetrica() {
            if (!ehQuadrada()) {
                return false;
            }
            return this.oposta().equals(this.transposta());
        }

        // j) somar (altera a matriz que recebeu a mensagem). Retorna false se as dimensoes forem diferentes
        public boolean somar(Matriz outra) {
            if (this.linhas != outra.linhas || this.colunas != outra.colunas) {
                System.out.println("Nao da pra somar: dimensoes diferentes!");
                return false;
            }
            for (int i = 0; i < linhas; i++) {
                for (int j = 0; j < colunas; j++) {
                    this.dados[i][j] = this.dados[i][j] + outra.dados[i][j];
                }
            }
            return true;
        }

        // k) subtrair (altera a matriz que recebeu a mensagem)
        public boolean subtrair(Matriz outra) {
            if (this.linhas != outra.linhas || this.colunas != outra.colunas) {
                System.out.println("Nao da pra subtrair: dimensoes diferentes!");
                return false;
            }
            for (int i = 0; i < linhas; i++) {
                for (int j = 0; j < colunas; j++) {
                    this.dados[i][j] = this.dados[i][j] - outra.dados[i][j];
                }
            }
            return true;
        }

        // l) multiplicar (altera a matriz que recebeu a mensagem)
        // precisa que colunas desta = linhas da outra. O resultado tem linhas desta x colunas da outra
        public boolean multiplicar(Matriz outra) {
            if (this.colunas != outra.linhas) {
                System.out.println("Nao da pra multiplicar: colunas da primeira diferente das linhas da segunda!");
                return false;
            }
            double[][] resultado = new double[this.linhas][outra.colunas];

            for (int i = 0; i < this.linhas; i++) {
                for (int j = 0; j < outra.colunas; j++) {
                    double soma = 0;
                    for (int k = 0; k < this.colunas; k++) {
                        soma = soma + this.dados[i][k] * outra.dados[k][j];
                    }
                    resultado[i][j] = soma;
                }
            }

            this.dados = resultado;
            this.colunas = outra.colunas;
            return true;
        }

        // m) copia
        public Matriz copia() {
            Matriz resultado = new Matriz(linhas, colunas);
            for (int i = 0; i < linhas; i++) {
                for (int j = 0; j < colunas; j++) {
                    resultado.dados[i][j] = this.dados[i][j];
                }
            }
            return resultado;
        }

        public void mostrar() {
            for (int i = 0; i < linhas; i++) {
                for (int j = 0; j < colunas; j++) {
                    System.out.print(dados[i][j] + "\t");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        // matriz 2x3
        Matriz a = new Matriz(2, 3);
        double valor = 1;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                a.set(i, j, valor);
                valor++;
            }
        }
        System.out.println("A (2x3):");
        a.mostrar();

        System.out.println("Transposta de A:");
        a.transposta().mostrar();

        System.out.println("Oposta de A:");
        a.oposta().mostrar();

        System.out.println("Matriz nula do tamanho de A:");
        a.gerarNula().mostrar();

        // copia
        Matriz copiaA = a.copia();
        System.out.println("A e a copia sao iguais? " + a.equals(copiaA));
        copiaA.set(0, 0, 99);
        System.out.println("Depois de mudar a copia, sao iguais? " + a.equals(copiaA));

        // testes de tipos de matriz
        Matriz identidade = new Matriz(3, 3);
        identidade.set(0, 0, 1);
        identidade.set(1, 1, 1);
        identidade.set(2, 2, 1);
        System.out.println();
        System.out.println("Matriz identidade 3x3:");
        identidade.mostrar();
        System.out.println("e identidade? " + identidade.ehIdentidade());
        System.out.println("e diagonal? " + identidade.ehDiagonal());
        System.out.println("e singular? " + identidade.ehSingular());
        System.out.println("e simetrica? " + identidade.ehSimetrica());

        Matriz diagonal = new Matriz(2, 2);
        diagonal.set(0, 0, 2);
        diagonal.set(1, 1, 5);
        System.out.println();
        System.out.println("Matriz diagonal 2x2 (2 e 5):");
        diagonal.mostrar();
        System.out.println("e identidade? " + diagonal.ehIdentidade());
        System.out.println("e diagonal? " + diagonal.ehDiagonal());
        System.out.println("e singular? " + diagonal.ehSingular());

        Matriz simetrica = new Matriz(2, 2);
        simetrica.set(0, 0, 1);
        simetrica.set(0, 1, 7);
        simetrica.set(1, 0, 7);
        simetrica.set(1, 1, 3);
        System.out.println();
        System.out.println("Matriz [1 7; 7 3] e simetrica? " + simetrica.ehSimetrica());
        System.out.println("e anti-simetrica? " + simetrica.ehAntiSimetrica());

        Matriz anti = new Matriz(2, 2);
        anti.set(0, 1, 2);
        anti.set(1, 0, -2);
        System.out.println("Matriz [0 2; -2 0] e anti-simetrica? " + anti.ehAntiSimetrica());
        System.out.println("e simetrica? " + anti.ehSimetrica());

        // soma e subtracao
        System.out.println();
        Matriz m1 = new Matriz(2, 2);
        Matriz m2 = new Matriz(2, 2);
        m1.set(0, 0, 1);
        m1.set(0, 1, 2);
        m1.set(1, 0, 3);
        m1.set(1, 1, 4);
        m2.set(0, 0, 10);
        m2.set(0, 1, 20);
        m2.set(1, 0, 30);
        m2.set(1, 1, 40);

        m1.somar(m2);
        System.out.println("m1 depois de somar m2:");
        m1.mostrar();

        m1.subtrair(m2);
        System.out.println("m1 depois de subtrair m2 (volta ao original):");
        m1.mostrar();

        // multiplicacao: A (2x3) * B (3x2) = 2x2
        Matriz b = new Matriz(3, 2);
        valor = 1;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                b.set(i, j, valor);
                valor++;
            }
        }
        System.out.println();
        System.out.println("B (3x2):");
        b.mostrar();

        Matriz produto = a.copia();
        produto.multiplicar(b);
        System.out.println("A * B (2x2):");
        produto.mostrar();

        // tentativa invalida
        a.multiplicar(a);
    }
}
