package trimestre2.EX4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Estudante> estudantes = new ArrayList<>();
        ArrayList<Double> pesos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        Double peso = 0.0;
        for(int i = 0;i<5;i++){
            System.out.println("Insira o peso da nota: ");
            peso = scanner.nextDouble();
            pesos.add(peso);
        }
        int opt = 0;
        do {
            System.out.println("Insira o nome do aluno: ");
            String nome = scanner.nextLine();
            estudantes.add(new Estudante(nome));
            estudantes.getLast().insereNotas();
            System.out.println("Digite '0' para parar de inserir estudantes: ");
            opt = scanner.nextInt();
            scanner.nextLine();
        } while (opt != 0);

        ArrayList<Estudante> aprovados = Estudante.aprovados(estudantes);

        if(aprovados==null){
            System.out.println("Nenhum estudante aprovado");
        }
        else{
            System.out.println("DADOS DOS ESTUDANTES APROVADOS: \n");
            for(int i=0;i<aprovados.size();i++){
                System.out.println("\n"+aprovados.get(i).getNotas());
                System.out.println("Menor nota do(a) " + aprovados.get(i).getNome() + ": " + aprovados.get(i).menorNota());
                System.out.println("Média do(a) " + aprovados.get(i).getNome() + ": " + aprovados.get(i).calculaMedia(pesos));
            }
        }
    }
}
