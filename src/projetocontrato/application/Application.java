package projetocontrato.application;

import projetocontrato.entities.Contrato;
import projetocontrato.entities.ParcelaContrato;
import projetocontrato.service.ContratoService;
import projetocontrato.service.PaypalService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Application {
    public static void main(String[] args) {
        DateTimeFormatter dt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Contrato contrato = new Contrato(20, LocalDate.parse("25/06/2023",dt),3800.0);

        ContratoService cs = new ContratoService(new PaypalService());
        cs.gerarParcelasContrato(contrato,24);

        for (ParcelaContrato p : contrato.getParcelasContrato()){
            System.out.println( "Id: " +  p.getId());
            System.out.println( "Data: " + dt.format(p.getData()));
            System.out.println( "Valor: " + String.format("%.2f",p.getValor()));
            System.out.println("------------------------");
        }
    }
}
