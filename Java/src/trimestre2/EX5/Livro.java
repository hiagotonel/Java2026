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
        if(!disponivel){
            System.out.println("ERRO: O livro não está disponivel para empréstimo!");
        }
        else {
            disponivel = false;
        }
    }

    public void devolver(){
        if(disponivel){
            System.out.println("ERRO: O livro já está na biblioteca!");
        }
        else {
            disponivel = true;
        }
    }
}
