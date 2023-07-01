package projetocontrato.service;

import projetocontrato.entities.Contrato;
import projetocontrato.entities.ParcelaContrato;

import java.time.LocalDate;

public class ContratoService {

    private PagamentoService pagamentoService;

    public ContratoService(PagamentoService pagamentoService){
        this.pagamentoService = pagamentoService;
    }



    public void gerarParcelasContrato(Contrato contrato, int quantidadeParcelas){
        double parcelaSemJuros = contrato.getValor()/ quantidadeParcelas;
        for (int i = 1; i <= quantidadeParcelas; i++){
            LocalDate dataParcelas = contrato.getData().plusMonths(i);
            double valorComJuros = parcelaSemJuros + pagamentoService.juros(parcelaSemJuros,i);
            double parcelaComTaxa = valorComJuros + pagamentoService.taxa(valorComJuros);

            contrato.addParcela(new ParcelaContrato(i,dataParcelas,valorComJuros));
        }
    }
}
