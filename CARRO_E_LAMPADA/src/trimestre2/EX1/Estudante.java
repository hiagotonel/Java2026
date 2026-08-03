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
        for(Integer i=0;i<=5;i++){
            System.out.println("Insira a nota "+(i+1)+" do aluno "+ this.nome +":");
            Double nota = scanner.nextDouble();
            this.notas.add(nota);
        }
    }

    public Double calculaMedia(){
        Double media=(this.notas.get(0)+this.notas.get(1)+this.notas.get(2)+this.notas.get(3)+this.notas.get(4))/5.0;
        return media;
    }
}
