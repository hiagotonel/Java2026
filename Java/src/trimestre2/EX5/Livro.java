package trimestre2.EX5;

public class Livro extends publicacao {
    private Boolean disponivel;

    public Livro(String titulo, Boolean disponivel){
        this.titulo = titulo;
        this.disponivel = disponivel;
    }

    public Boolean getDisponivel(){
        return disponivel;
    }

    public void setDisponivel(Boolean disponivel) {
        this.disponivel = disponivel;
    }
}
