package trimestre2.EX5;

public class Livro extends publicacao {
    private Boolean disponivel;

    public Livro(String titulo){
        this.titulo = titulo;
        this.disponivel = true;
    }

    public String isDisponivel(){
        if(disponivel){
            return "disponivel";
        }
        else{
            return "emprestado";
        }
    }

    public void emprestar(){
        disponivel = false;
    }

    public void devolver(){
        disponivel = true;
    }
}
