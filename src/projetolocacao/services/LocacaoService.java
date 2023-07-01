package projetolocacao.services;

import projetolocacao.entities.Locacao;
import projetolocacao.entities.NotaPagamento;

import java.time.Duration;

public class LocacaoService {

    private Double valorPorHora;
    private Double valorPorDia;
    private ImpostoService impostoService;

    public LocacaoService(Double valorPorHora, Double valorPorDia,ImpostoService impostoService){
        this.valorPorHora = valorPorHora;
        this.valorPorDia = valorPorDia;
        this.impostoService = impostoService;
    }

    public Double getValorPorHora(){
        return valorPorHora;
    }

    public void setValorPorHora(Double valorPorHora){
        this.valorPorHora = valorPorHora;
    }

    public Double getValorPorDia(){
        return valorPorDia;
    }


    public void setValorPorDia(Double valorPorDia){
        this.valorPorDia = valorPorDia;
    }

    public ImpostoService getImpostoService(){
        return impostoService;
    }

    public void setImpostoService(ImpostoService impostoService){
        this.impostoService = impostoService;
    }

    public void gerarNotaPagamento(Locacao locacao){
        Duration d = Duration.between(locacao.getDataRetirada(), locacao.getDataDevolucao());
        double horas = (double) d.toMillis()/1000/60/60;

        double valorSemImposto = 0.0;
        if (horas <= 12.0){
            valorSemImposto = Math.ceil(horas) * valorPorHora;
        } else {
            valorSemImposto = Math.ceil(horas/24) * valorPorDia;
        }
        locacao.setNotaPagamento(new NotaPagamento(valorSemImposto,impostoService.imposto(valorSemImposto)));
    }


}
