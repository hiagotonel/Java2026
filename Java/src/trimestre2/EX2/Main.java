package trimestre2.EX2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Estudante> estudantes = null;
        Scanner scanner = new Scanner(System.in);
        int opt = 0;
        do {
            String nome = scanner.nextLine();
            estudantes.add(new Estudante(nome));
            estudantes.getLast().insereNotas();
            System.out.println("Digite '0' para parar de inserir estudantes: ");
            opt = scanner.nextInt();
        } while (opt != 0);

        ArrayList<Estudante> aprovados = estudantes.getFirst().aprovados(estudantes);


        System.out.println(estudante.getNotas());
        System.out.println("Menor nota do(a) " + estudante.getNome() + ": " + estudante.menorNota());
        System.out.println("Média do(a) " + estudante.getNome() + ": " + estudante.calculaMedia());
    }
}
