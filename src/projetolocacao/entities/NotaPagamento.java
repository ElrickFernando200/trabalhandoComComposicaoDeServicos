package projetolocacao.entities;


public class NotaPagamento {

    private Double valorLocacao;
    private Double valorImposto;

    public NotaPagamento(Double valorLocacao,Double valorImposto){
        this.valorLocacao = valorLocacao;
        this.valorImposto = valorImposto;
    }

    public Double getValorLocacao(){
        return valorLocacao;
    }

    public void setValorLocacao(Double valorLocacao){
        this.valorLocacao = valorLocacao;
    }

    public Double getValorImposto(){
        return valorImposto;
    }

    public void setValorImposto(Double valorImposto){
        this.valorImposto = valorImposto;
    }

    public Double valorTotal(){
        return valorLocacao + valorImposto;
    }

    @Override
    public String toString() {
        return "NotaPagamento" +
                " valorLocacao=" + valorLocacao +
                ", valorImposto=" + valorImposto +
                ", valor total = "
                + String.format("%.2f",valorTotal());
    }
}
