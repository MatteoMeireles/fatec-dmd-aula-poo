public class Ex6 {

    static class Pais {
        private String codigoISO;
        private String nome;
        private long populacao;
        private double dimensao; // em km2

        private Pais[] fronteiras = new Pais[40]; // no maximo 40 vizinhos
        private int qtdFronteiras = 0;

        // a) construtor com codigo ISO, nome e dimensao
        public Pais(String codigoISO, String nome, double dimensao) {
            this.codigoISO = codigoISO;
            this.nome = nome;
            this.dimensao = dimensao;
        }

        // b) getters e setters
        public String getCodigoISO() {
            return codigoISO;
        }

        public void setCodigoISO(String codigoISO) {
            this.codigoISO = codigoISO;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public long getPopulacao() {
            return populacao;
        }

        public void setPopulacao(long populacao) {
            this.populacao = populacao;
        }

        public double getDimensao() {
            return dimensao;
        }

        public void setDimensao(double dimensao) {
            this.dimensao = dimensao;
        }

        // c) igualdade: mesmo codigo ISO
        public boolean equals(Object obj) {
            if (!(obj instanceof Pais)) {
                return false;
            }
            Pais outro = (Pais) obj;
            return this.codigoISO.equals(outro.codigoISO);
        }

        // adiciona a fronteira nos dois paises (se um faz fronteira com o outro, o outro tambem faz)
        public void adicionarFronteira(Pais outro) {
            if (outro == null || this.equals(outro) || this.ehLimitrofe(outro)) {
                return;
            }
            if (this.qtdFronteiras >= 40 || outro.qtdFronteiras >= 40) {
                System.out.println("Limite de 40 fronteiras atingido!");
                return;
            }
            this.fronteiras[this.qtdFronteiras] = outro;
            this.qtdFronteiras++;

            outro.fronteiras[outro.qtdFronteiras] = this;
            outro.qtdFronteiras++;
        }

        // d) informa se o outro pais e limitrofe
        public boolean ehLimitrofe(Pais outro) {
            for (int i = 0; i < qtdFronteiras; i++) {
                if (fronteiras[i].equals(outro)) {
                    return true;
                }
            }
            return false;
        }

        // e) densidade populacional (habitantes por km2)
        public double densidadePopulacional() {
            return populacao / dimensao;
        }

        // f) vizinhos comuns aos dois paises
        public Pais[] vizinhosComuns(Pais outro) {
            Pais[] temporario = new Pais[40];
            int quantidade = 0;

            for (int i = 0; i < qtdFronteiras; i++) {
                if (outro.ehLimitrofe(fronteiras[i])) {
                    temporario[quantidade] = fronteiras[i];
                    quantidade++;
                }
            }

            // copia para um array do tamanho certo
            Pais[] resultado = new Pais[quantidade];
            for (int i = 0; i < quantidade; i++) {
                resultado[i] = temporario[i];
            }
            return resultado;
        }

        public String toString() {
            return nome + " (" + codigoISO + ")";
        }
    }

    public static void main(String[] args) {
        Pais brasil = new Pais("BRA", "Brasil", 8515767.049);
        brasil.setPopulacao(193946886);
        Pais argentina = new Pais("ARG", "Argentina", 2780400);
        argentina.setPopulacao(40117096);
        Pais uruguai = new Pais("URY", "Uruguai", 176215);
        uruguai.setPopulacao(3286314);
        Pais paraguai = new Pais("PRY", "Paraguai", 406752);
        paraguai.setPopulacao(6454548);
        Pais bolivia = new Pais("BOL", "Bolivia", 1098581);
        bolivia.setPopulacao(10027254);

        brasil.adicionarFronteira(argentina);
        brasil.adicionarFronteira(uruguai);
        brasil.adicionarFronteira(paraguai);
        brasil.adicionarFronteira(bolivia);
        argentina.adicionarFronteira(uruguai);
        argentina.adicionarFronteira(paraguai);
        argentina.adicionarFronteira(bolivia);
        paraguai.adicionarFronteira(bolivia);

        System.out.println("Brasil faz fronteira com Uruguai? " + brasil.ehLimitrofe(uruguai));
        System.out.println("Uruguai faz fronteira com Bolivia? " + uruguai.ehLimitrofe(bolivia));

        System.out.println("Densidade do Brasil: " + brasil.densidadePopulacional() + " hab/km2");

        Pais outroBrasil = new Pais("BRA", "Brazil", 1);
        System.out.println("Brasil e 'Brazil' (mesmo ISO) sao iguais? " + brasil.equals(outroBrasil));
        System.out.println("Brasil e Argentina sao iguais? " + brasil.equals(argentina));

        Pais[] comuns = brasil.vizinhosComuns(argentina);
        System.out.println("Vizinhos comuns de Brasil e Argentina (" + comuns.length + "):");
        for (int i = 0; i < comuns.length; i++) {
            System.out.println(" - " + comuns[i]);
        }
    }
}
