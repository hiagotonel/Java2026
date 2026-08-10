package trimestre2.EX1;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Estudante {
    private String nome;
    private List<Double> notas;
    Scanner scanner = new Scanner(System.in);
    
    public Estudante(String nome){
        this.nome = nome;
        this.notas = new ArrayList<>();
    }

    public void insereNotas(){
        for(Integer i=0;i<=this.notas.size();i++){
            System.out.println("Insira a nota "+(i+1)+" do aluno "+ this.nome +":");
            Double nota = scanner.nextDouble();
            this.notas.add(nota);
        }
    }

    public Double calculaMedia(){
        Double soma = 0.0;
        for(Integer i=0;i<=this.notas.size();i++){
            soma+=this.notas.get(i);
        }
        Double media=soma/this.notas.size();
        return media;
    }

    public String getNome(){
        return this.nome;
    }

    public String getNotas(){
        String str_notas="Notas do(a) "+(this.nome)+": ";
        for(Integer i=0;i<=this.notas.size();i++){
            str_notas+="\nNota "+(i+1)+": "+(this.notas.get(i));
        }
        return str_notas;
    }
}
