package projetocontrato.service;

public class PaypalService implements PagamentoService{

    public PaypalService(){}

    @Override
    public double juros(double valorParcela, int numeroParcela){
        return valorParcela * 0.01 * numeroParcela;
    }
    @Override
    public double taxa(double valor){
        return valor * 0.02;
    }
}
