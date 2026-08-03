package avaliacao.formula1;
public class Equipe {

    private String nome;
    private Integer anoFundacao;
    private Patrocinadores[] patrocinadores;

    //Construtor de classe
    public Equipe(String nome, Integer anoFundacao, Patrocinadores patrocinador){
        this.nome= nome;
        this.anoFundacao= anoFundacao;
        this.patrocinadores= new Patrocinadores[20];
        this.patrocinadores[0]= patrocinador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getAnoFundacao() {
        return anoFundacao;
    }

    public void setAnoFundacao(Integer anoFundacao) {
        this.anoFundacao = anoFundacao;
    }

    public Patrocinadores[] getPatrocinadores(){
        return patrocinadores;
    }

    public void setPatrocinadores(Patrocinadores patrocinadores, Integer posicao) {
        this.patrocinadores[posicao] = patrocinadores;
    }

    public int getQuantidadePatrocinadores() {
        Integer cont = 0;
        for (Integer i = 0; i < patrocinadores.length; i++) {
            if (patrocinadores[i] != null) {
                cont++;
            }
        }
        return cont;
    }

    //Métodos
    public void Torcer(){
        System.out.println("TU CONSEGUE "+nome+"!!!!");
    }
}