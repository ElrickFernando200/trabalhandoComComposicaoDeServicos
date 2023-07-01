package projetolocacao.entities;

import java.time.LocalDateTime;

public class Locacao {

    private Integer id;
    private LocalDateTime dataRetirada;
    private LocalDateTime dataDevolucao;
    private Veiculo veiculo;
    private NotaPagamento notaPagamento;


    public Locacao(Integer id, LocalDateTime dataRetirada, LocalDateTime dataDevolucao,Veiculo veiculo){
        this.id = id;
        this.dataRetirada = dataRetirada;
        this.dataDevolucao = dataDevolucao;
        this.veiculo = veiculo;
    }

    public Integer getId(){
        return id;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public LocalDateTime getDataRetirada(){
        return dataRetirada;
    }

    public void setDataRetirada(LocalDateTime dataRetirada){
        this.dataRetirada = dataRetirada;
    }

    public LocalDateTime getDataDevolucao(){
        return dataDevolucao;
    }

    public void setDataDevolucao(LocalDateTime dataDevolucao){
        this.dataDevolucao = dataDevolucao;
    }

    public Veiculo getVeiculo(){
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo){
        this.veiculo = veiculo;
    }

    public NotaPagamento getNotaPagamento(){
        return notaPagamento;
    }

    public void setNotaPagamento(NotaPagamento notaPagamento){
        this.notaPagamento = notaPagamento;
    }
}
