public class Ex7 {

    static class Pais {
        private String codigoISO;
        private String nome;
        private long populacao;
        private double dimensao;

        public Pais(String codigoISO, String nome, long populacao, double dimensao) {
            this.codigoISO = codigoISO;
            this.nome = nome;
            this.populacao = populacao;
            this.dimensao = dimensao;
        }

        public String getCodigoISO() {
            return codigoISO;
        }

        public String getNome() {
            return nome;
        }

        public long getPopulacao() {
            return populacao;
        }

        public double getDimensao() {
            return dimensao;
        }

        public String toString() {
            return nome + " (" + codigoISO + ")";
        }
    }

    static class Continente {
        private String nome;
        private Pais[] paises = new Pais[48]; // no maximo 48 paises
        private int qtdPaises = 0;

        // a) construtor
        public Continente(String nome) {
            this.nome = nome;
        }

        public String getNome() {
            return nome;
        }

        // b) adicionar pais
        public void adicionarPais(Pais pais) {
            if (pais == null) {
                return;
            }
            if (qtdPaises >= 48) {
                System.out.println("O continente ja tem 48 paises!");
                return;
            }
            paises[qtdPaises] = pais;
            qtdPaises++;
        }

        // c) dimensao total
        public double dimensaoTotal() {
            double total = 0;
            for (int i = 0; i < qtdPaises; i++) {
                total = total + paises[i].getDimensao();
            }
            return total;
        }

        // d) populacao total
        public long populacaoTotal() {
            long total = 0;
            for (int i = 0; i < qtdPaises; i++) {
                total = total + paises[i].getPopulacao();
            }
            return total;
        }

        // e) densidade populacional
        public double densidadePopulacional() {
            double dimensao = dimensaoTotal();
            if (dimensao == 0) {
                return 0;
            }
            return populacaoTotal() / dimensao;
        }

        // f) pais com maior populacao
        public Pais paisMaiorPopulacao() {
            if (qtdPaises == 0) {
                return null;
            }
            Pais maior = paises[0];
            for (int i = 1; i < qtdPaises; i++) {
                if (paises[i].getPopulacao() > maior.getPopulacao()) {
                    maior = paises[i];
                }
            }
            return maior;
        }

        // g) pais com menor populacao
        public Pais paisMenorPopulacao() {
            if (qtdPaises == 0) {
                return null;
            }
            Pais menor = paises[0];
            for (int i = 1; i < qtdPaises; i++) {
                if (paises[i].getPopulacao() < menor.getPopulacao()) {
                    menor = paises[i];
                }
            }
            return menor;
        }

        // h) pais de maior dimensao
        public Pais paisMaiorDimensao() {
            if (qtdPaises == 0) {
                return null;
            }
            Pais maior = paises[0];
            for (int i = 1; i < qtdPaises; i++) {
                if (paises[i].getDimensao() > maior.getDimensao()) {
                    maior = paises[i];
                }
            }
            return maior;
        }

        // i) pais de menor dimensao
        public Pais paisMenorDimensao() {
            if (qtdPaises == 0) {
                return null;
            }
            Pais menor = paises[0];
            for (int i = 1; i < qtdPaises; i++) {
                if (paises[i].getDimensao() < menor.getDimensao()) {
                    menor = paises[i];
                }
            }
            return menor;
        }

        // j) razao territorial: dimensao do maior / dimensao do menor
        public double razaoTerritorial() {
            Pais maior = paisMaiorDimensao();
            Pais menor = paisMenorDimensao();

            if (maior == null || menor.getDimensao() == 0) {
                return 0;
            }
            return maior.getDimensao() / menor.getDimensao();
        }
    }

    public static void main(String[] args) {
        Continente america = new Continente("America do Sul (alguns paises)");

        america.adicionarPais(new Pais("BRA", "Brasil", 193946886, 8515767.049));
        america.adicionarPais(new Pais("ARG", "Argentina", 40117096, 2780400));
        america.adicionarPais(new Pais("URY", "Uruguai", 3286314, 176215));
        america.adicionarPais(new Pais("PRY", "Paraguai", 6454548, 406752));
        america.adicionarPais(new Pais("BOL", "Bolivia", 10027254, 1098581));

        System.out.println("Continente: " + america.getNome());
        System.out.println("Dimensao total: " + america.dimensaoTotal() + " km2");
        System.out.println("Populacao total: " + america.populacaoTotal());
        System.out.println("Densidade populacional: " + america.densidadePopulacional() + " hab/km2");
        System.out.println("Pais com maior populacao: " + america.paisMaiorPopulacao());
        System.out.println("Pais com menor populacao: " + america.paisMenorPopulacao());
        System.out.println("Pais de maior dimensao: " + america.paisMaiorDimensao());
        System.out.println("Pais de menor dimensao: " + america.paisMenorDimensao());
        System.out.println("Razao territorial (maior / menor): " + america.razaoTerritorial());
    }
}
