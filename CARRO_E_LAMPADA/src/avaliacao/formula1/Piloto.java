package avaliacao.formula1;
public class Piloto extends Pessoa {

    private Integer numVitorias;

    //Construtor de classe
    public Piloto(String nome, Integer idade, String nacionalidade, Integer numVitorias){
        super(nome, idade, nacionalidade);
        this.numVitorias= numVitorias;
    }

    public Integer getNumVitorias() {
        return numVitorias;
    }

    public void setNumVitorias(Integer numVitorias) {
        this.numVitorias = numVitorias;
    }

    //Métodos
    public void Pilotar(){
        System.out.println("RANDANDANDANDAN");
    }
}