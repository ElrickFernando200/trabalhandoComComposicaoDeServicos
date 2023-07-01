package projetocontrato.service;

public interface PagamentoService {


    public double juros(double valorParcela,int numeroParcela);

    public double taxa(double valor);
}
