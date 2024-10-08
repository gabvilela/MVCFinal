package Model;

public class Custo {
    private int idAtracao;
    private double custoManutencaoBilhete;
    private double custoFixoMes;

    public double getCustoManutencaoBilhete() {
        return custoManutencaoBilhete;
    }

    public double getCustoFixoMes() {
        return custoFixoMes;
    }

    public Custo(int idAtracao, double custoManutencaoBilhete, double custoFixoMes) {
        this.idAtracao = idAtracao;
        this.custoManutencaoBilhete = custoManutencaoBilhete;
        this.custoFixoMes = custoFixoMes;

    }

}
