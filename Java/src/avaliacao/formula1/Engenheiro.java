package avaliacao.formula1;
public class Engenheiro extends Pessoa {
    private Piloto piloto;

    public Engenheiro(String nome, Integer idade, String nacionalidade, Piloto piloto){
        super(nome,idade,nacionalidade);
        this.piloto=piloto;
    }

    public Piloto getPiloto(){
        return piloto;
    }

    public void setPiloto(Piloto piloto){
        this.piloto=piloto;
    }
}
