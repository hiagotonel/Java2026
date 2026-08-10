package trimestre2.EX2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String nome = scanner.nextLine();
        Estudante estudante = new Estudante(nome);
        estudante.insereNotas();
        System.out.println(estudante.getNotas());
        System.out.println("Menor nota do(a) "+estudante.getNome()+": "+estudante.menorNota());
        System.out.println("Média do(a) "+estudante.getNome()+": "+estudante.calculaMedia());
        scanner.close();
    }
}
