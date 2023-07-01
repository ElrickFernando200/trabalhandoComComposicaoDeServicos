package projetolocacao.entities;

public class Veiculo {

    private Integer id;
    private String modelo;


    public Veiculo(Integer id, String modelo){
        if (id == null || modelo == null) {
            throw new IllegalArgumentException("O valor não pode ser nulo");
        }
        this.id = id;
        this.modelo = modelo;
    }

    public Integer getId(){
        return id;
    }
    public void setId(Integer id){
        if (id  == null){
            throw new IllegalArgumentException("O valor não pode ser nulo");
        }
        this.id = id;
    }

    public String getModelo(){
        return modelo;
    }

    public void setModelo(String modelo){
        if (modelo == null){
            throw new IllegalArgumentException("O valor não pode ser nulo");
        }
        this.modelo = modelo;
    }



}
