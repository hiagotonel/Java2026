package trimestre2.EX5;

public class Livro {
    private String titulo;
    private Boolean disponivel;

    public Livro(String titulo, Boolean disponivel){
        this.titulo = titulo;
        this.disponivel = disponivel;
    }

    public String getTitulo() {
        return titulo;
    }

    public Boolean getDisponivel(){
        return disponivel;
    }

    public void setDisponivel(Boolean disponivel) {
        this.disponivel = disponivel;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
