package avaliacao.formula1;
public class Carro {
    //Atributos
    private Integer numero;
    private Integer posicao;
    private Equipe equipe;
    private Piloto piloto;
    private Engenheiro engenheiro;

    //Construtor de classe
    public Carro(Integer numero, Integer posicao, Equipe equipe, Piloto piloto, Engenheiro engenheiro){
        this.numero = numero;
        this.posicao = posicao;
        this.equipe = equipe;
        this.piloto = piloto;
        this.engenheiro = engenheiro;
    }

    public int getNumero(){
        return numero;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }

    public int getPosicao(){
        return posicao;
    }

    public void setPosicao(int posicao){
        this.posicao = posicao;
    }

    public Equipe getEquipe(){
        return equipe;
    }

    public void setEquipe(Equipe equipe){
        this.equipe = equipe;
    }

    public Piloto getPiloto(){
        return piloto;
    }

    public void setPiloto(Piloto piloto){
        this.piloto = piloto;
    }

    public Engenheiro getEngenheiro(){
        return engenheiro;
    }

    public void setEngenheiro(Engenheiro engenheiro){
        this.engenheiro = engenheiro;
    }

    //métodos
    public void ligarCarro(){
        System.out.println("VRUMMMM");
    }
}
