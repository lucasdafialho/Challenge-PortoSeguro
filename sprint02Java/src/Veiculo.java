public class Veiculo {
        private String placa;
        private String cor;
        private int ano;
        private String tipoCombustivel;
        private double quilometragem;
        private String transmissao;
        private boolean manutencoes;


        public Veiculo(String placa, String cor, int ano, String tipoCombustivel, double quilometragem, String transmissao, boolean manutencoes) {
            this.placa = placa;
            this.cor = cor;
            this.ano = ano;
            this.tipoCombustivel = tipoCombustivel;
            this.quilometragem = quilometragem;
            this.transmissao = transmissao;
            this.manutencoes = manutencoes;
        }

        public String getPlaca() {
            return placa;
        }

        public void setCor(String cor) {
            this.cor = cor;
        }

        public void setAno(int ano) {
            this.ano = ano;
        }

        public void setTipoCombustivel(String tipoCombustivel) {
            this.tipoCombustivel = tipoCombustivel;
        }

        public void setQuilometragem(double quilometragem) {
            this.quilometragem = quilometragem;
        }

        public void setTransmissao(String transmissao) {
            this.transmissao = transmissao;
        }

        public void setManutencoes(boolean manutencoes) {
            this.manutencoes = manutencoes;
        }

        @Override
        public String toString() {
            return "Veiculo{" +
                    "placa='" + placa + '\'' +
                    ", cor='" + cor + '\'' +
                    ", ano=" + ano +
                    ", tipoCombustivel='" + tipoCombustivel + '\'' +
                    ", quilometragem=" + quilometragem +
                    ", transmissao='" + transmissao + '\'' +
                    ", manutencoes=" + manutencoes +
                    '}';
        }
}
