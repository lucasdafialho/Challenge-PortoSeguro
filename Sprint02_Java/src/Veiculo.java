public class Veiculo {
        private String placa;
        private String cor;
        private int ano;
        private String tipoCombustivel;
        private double quilometragem;
        private String transmissao;
        private boolean manutencoes;

    public Veiculo() {
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public double getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(double quilometragem) {
        this.quilometragem = quilometragem;
    }

    public String getTransmissao() {
        return transmissao;
    }

    public void setTransmissao(String transmissao) {
        this.transmissao = transmissao;
    }

    public boolean isManutencoes() {
        return manutencoes;
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

    public Veiculo(String placa, String cor, int ano, String tipoCombustivel, double quilometragem, String transmissao, boolean manutencoes) {
        this.placa = placa;
        this.cor = cor;
        this.ano = ano;
        this.tipoCombustivel = tipoCombustivel;
        this.quilometragem = quilometragem;
        this.transmissao = transmissao;
        this.manutencoes = manutencoes;


    }
}
