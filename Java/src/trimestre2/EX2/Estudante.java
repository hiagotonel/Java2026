package trimestre2.EX2;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Estudante {
    private final String nome;
    private final List<Double> notas;
    Scanner scanner = new Scanner(System.in);
    
    public Estudante(String nome){
        this.nome = nome;
        this.notas = new ArrayList<>();
    }

    public void insereNotas() {
        if (this.notas.size() > 4) {
            System.out.println("As notas já foram preenchidas para esse aluno");
        } else {
            for (int i = 0; i <5; i++) {
                System.out.println("Insira a nota " + (i + 1) + " do aluno " + this.nome + ":");
                    Double nota = scanner.nextDouble();this.notas.add(nota);
            }
        }
    }

    public Double calculaMedia(){
        Double soma = 0.0;
        for(int i=0;i<this.notas.size();i++){
            soma+=this.notas.get(i);
        }
        Double media=soma/this.notas.size();
        return media;
    }

    public Double menorNota(){
        Double menor = this.notas.getFirst();
        for(int i=1;i<this.notas.size();i++){
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
        for(int i=0;i<this.notas.size();i++){
            str_notas+="\nNota "+(i+1)+": "+(this.notas.get(i));
        }
        return str_notas;
    }

    public ArrayList<Estudante> aprovados(ArrayList<Estudante> estudantes){
        ArrayList<Estudante> aprovados = null;
        for(int i=0;i<estudantes.size();i++){
            if(estudantes.get(i).calculaMedia()>=6){
                aprovados.add(estudantes.get(i));
            }
        }
        if(aprovados.isEmpty()){
            return null;
        }
        return aprovados;
    }
}
