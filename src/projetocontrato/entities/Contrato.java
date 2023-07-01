package projetocontrato.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contrato {
    private Integer numero;
    private LocalDate data;
    private Double valor;
    private List<ParcelaContrato> parcelasContrato = new ArrayList<>();


    public Contrato(){}
    public Contrato(Integer numero,LocalDate data,Double valor){
        this.numero = numero;
        this.data = data;
        this.valor = valor;
    }

    public Integer getNumero(){
        return numero;
    }

    public void setNumero(Integer numero){
        this.numero = numero;
    }

    public LocalDate getData(){
        return data;
    }

    public void setData(LocalDate data){
        this.data = data;
    }

    public Double getValor(){
        return valor;
    }

    public void setValor(Double valor){
        this.valor = valor;
    }

    public List<ParcelaContrato> getParcelasContrato(){
        return parcelasContrato;
    }

    public void addParcela(ParcelaContrato parcela){
        parcelasContrato.add(parcela);
    }

}
