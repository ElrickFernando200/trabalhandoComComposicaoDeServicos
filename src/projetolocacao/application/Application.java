package projetolocacao.application;

import projetolocacao.entities.Locacao;
import projetolocacao.entities.Veiculo;
import projetolocacao.services.ImpostoBrasilService;
import projetolocacao.services.LocacaoService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Application {
    public static void main(String[] args) {
        DateTimeFormatter dt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        Veiculo v = new Veiculo(15,"Civic");

        Locacao locacao = new Locacao(1, LocalDateTime.parse("24/04/2023 09:53",dt),LocalDateTime.parse("26/04/2023 13:00",dt),v);

        LocacaoService ls = new LocacaoService(25.0,100.0,new ImpostoBrasilService());
        ls.gerarNotaPagamento(locacao);

        System.out.println(locacao.getNotaPagamento());
    }
}
