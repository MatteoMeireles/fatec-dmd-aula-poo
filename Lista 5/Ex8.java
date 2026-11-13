public class Ex8 {

    static class Pessoa {
        private String nome;
        private Pessoa pai;
        private Pessoa mae;

        // i) nome e antecessores
        public Pessoa(String nome, Pessoa pai, Pessoa mae) {
            this.nome = nome;
            this.pai = pai;
            this.mae = mae;
        }

        // ii) so o nome (pai e mae ficam null)
        public Pessoa(String nome) {
            this.nome = nome;
            this.pai = null;
            this.mae = null;
        }

        public String getNome() {
            return nome;
        }

        // b) iguais se tem o mesmo nome e a mesma mae
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Pessoa)) {
                return false;
            }
            Pessoa outra = (Pessoa) obj;

            if (!this.nome.equals(outra.nome)) {
                return false;
            }
            return mesmaPessoa(this.mae, outra.mae);
        }

        // compara duas pessoas que podem ser null
        private boolean mesmaPessoa(Pessoa p1, Pessoa p2) {
            if (p1 == null && p2 == null) {
                return true;
            }
            if (p1 == null || p2 == null) {
                return false;
            }
            return p1.equals(p2);
        }

        // c) irmas: mesmo pai e mesma mae (conhecidos), e nao sao a mesma pessoa
        public boolean saoIrmas(Pessoa outra) {
            if (outra == null || this.equals(outra)) {
                return false;
            }
            if (this.pai == null || this.mae == null || outra.pai == null || outra.mae == null) {
                return false;
            }
            return this.pai.equals(outra.pai) && this.mae.equals(outra.mae);
        }

        // d) verifica se "possivel" e antecessora de quem recebeu a mensagem
        public boolean ehAntecessora(Pessoa possivel) {
            if (possivel == null) {
                return false;
            }
            if (pai != null) {
                if (pai.equals(possivel) || pai.ehAntecessora(possivel)) {
                    return true;
                }
            }
            if (mae != null) {
                if (mae.equals(possivel) || mae.ehAntecessora(possivel)) {
                    return true;
                }
            }
            return false;
        }

        public String toString() {
            return nome;
        }
    }

    public static void main(String[] args) {
        Pessoa jose = new Pessoa("Jose");
        Pessoa maria = new Pessoa("Maria");
        Pessoa ana = new Pessoa("Ana");
        Pessoa carlos = new Pessoa("Carlos", jose, maria);
        Pessoa pedro = new Pessoa("Pedro", carlos, ana);
        Pessoa lucia = new Pessoa("Lucia", carlos, ana);
        Pessoa joao = new Pessoa("Joao"); // sem pais conhecidos

        System.out.println("Pedro e Lucia sao irmas? " + pedro.saoIrmas(lucia));
        System.out.println("Pedro e Joao sao irmas? " + pedro.saoIrmas(joao));
        System.out.println("Pedro e Pedro sao irmas? " + pedro.saoIrmas(pedro));

        System.out.println("Carlos e antecessor de Pedro? " + pedro.ehAntecessora(carlos));
        System.out.println("Maria e antecessora de Pedro? " + pedro.ehAntecessora(maria));
        System.out.println("Pedro e antecessor de Carlos? " + carlos.ehAntecessora(pedro));
        System.out.println("Joao e antecessor de Pedro? " + pedro.ehAntecessora(joao));

        Pessoa outroPedro = new Pessoa("Pedro", carlos, ana);
        System.out.println("Pedro e outro 'Pedro' (mesmo nome e mae) sao iguais? " + pedro.equals(outroPedro));
        System.out.println("Pedro e Lucia sao iguais? " + pedro.equals(lucia));
    }
}
