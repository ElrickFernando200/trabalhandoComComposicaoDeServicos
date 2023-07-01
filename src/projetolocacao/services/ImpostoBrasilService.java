package projetolocacao.services;

public class ImpostoBrasilService implements ImpostoService {

    public ImpostoBrasilService(){}


    @Override
    public double imposto(double valor){
        if (valor <= 100){
            return valor * 0.2;
        } else {
            return valor * 0.15;
        }
    }

}
