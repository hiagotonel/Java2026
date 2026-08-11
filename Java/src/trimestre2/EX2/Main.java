package trimestre2.EX2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Estudante> estudantes = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opt = 0;
        do {
            System.out.println("Insira o nome do aluno: ");
            String nome = scanner.nextLine();
            estudantes.add(new Estudante(nome));
            estudantes.getLast().insereNotas();
            System.out.println("Digite '0' para parar de inserir estudantes: ");
            opt = scanner.nextInt();
        } while (opt != 0);

        ArrayList<Estudante> aprovados = estudantes.getFirst().aprovados(estudantes);

        if(aprovados.isEmpty()){
            System.out.println("Nenhum estudante encontrado");
        }
        else{
            System.out.println("DADOS DOS ESTUDANTES APROVADOS: \n");
            for(int i=0;i<aprovados.size();i++){
                System.out.println(aprovados.get(i).getNotas());
                System.out.println("Menor nota do(a) " + aprovados.get(i).getNome() + ": " + aprovados.get(i).menorNota());
                System.out.println("Média do(a) " + aprovados.get(i).getNome() + ": " + aprovados.get(i).calculaMedia());
            }
        }
    }
}
