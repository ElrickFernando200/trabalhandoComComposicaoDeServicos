package projetocontrato.entities;

import java.time.LocalDate;

public class ParcelaContrato {

    private Integer id;
    private LocalDate data;
    private Double valor;


    public ParcelaContrato(){}
    public ParcelaContrato(Integer id, LocalDate data, Double valor){
        this.id = id;
        this.data = data;
        this.valor = valor;
    }


    public Integer getId(){
        return id;
    }

    public void setId(Integer id){
        this.id = id;
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
}
