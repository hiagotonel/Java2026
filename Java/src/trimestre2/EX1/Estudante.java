<<<<<<< HEAD

=======
package trimestre2.EX1;
>>>>>>> main
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
<<<<<<< HEAD
        for(Integer i=0;i<=5;i++){
            System.out.println("Insira a nota "+(i+1)+" do aluno "+ this.nome +":");
            Double nota = scanner.nextDouble();
            this.notas.add(nota);
=======
        if(this.notas.size()>4){
            System.out.println("As notas já foram preenchidas para esse aluno");
        }
        else{
            for(Integer i=0;i<=this.notas.size();i++){
                System.out.println("Insira a nota "+(i+1)+" do aluno "+ this.nome +":");
                Double nota = scanner.nextDouble();
                this.notas.add(nota);
            }
>>>>>>> main
        }
    }

    public Double calculaMedia(){
<<<<<<< HEAD
        Double media=(this.notas.get(0)+this.notas.get(1)+this.notas.get(2)+this.notas.get(3)+this.notas.get(4))/5.0;
        return media;
    }
=======
        Double soma = 0.0;
        for(Integer i=0;i<=this.notas.size();i++){
            soma+=this.notas.get(i);
        }
        Double media=soma/this.notas.size();
        return media;
    }

    public Double menorNota(){
        Double menor = this.notas.get(0);
        for(Integer i=1;i<=this.notas.size();i++){
            if (this.notas.get(i)<menor) {
                menor = this.notas.get(i);
            }
        }
        return menor;
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
>>>>>>> main
}
