package avaliacao.formula1;
public class Patrocinadores {

    private String nome;
    private Double valor;

    //Construtor de classe
    public Patrocinadores(String nome, Double valor){
        this.nome= nome;
        this.valor= valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    //Métodos
    public void Merchant(){
        System.out.println("COMPRE JÁ NA "+nome+"!!!!");
    }
}