package trimestre2.EX5;

public class Main {
    public static void main(String[] args) {

        Livro livro = new Livro("O Senhor dos Anéis");

        Periodico periodico = new Periodico("Revista Ciência Hoje", 15);

        System.out.println("===== LIVRO =====");
        System.out.println("Título: " + livro.getTitulo());
        System.out.println("situação: " + livro.isDisponivel());

        System.out.println();

        System.out.println("===== PERIÓDICO =====");
        System.out.println("Título: " + periodico.getTitulo());
        System.out.println("Volume: " + periodico.getVolume());

        System.out.println("\n===== EMPRÉSTIMO =====");
        livro.emprestar();

        System.out.println("Livro: " + livro.getTitulo());
        System.out.println("Disponível após empréstimo: " + livro.isDisponivel());

        System.out.println("\nTentando emprestar o livro novamente:");
        livro.emprestar();

        System.out.println("\n===== DEVOLUÇÃO =====");
        livro.devolver();

        System.out.println("Livro: " + livro.getTitulo());
        System.out.println("Disponível após devolução: " + livro.isDisponivel());

        System.out.println("\nTentando devolver o livro novamente:");
        livro.devolver();

        System.out.println("\n===== PERIÓDICO =====");
        System.out.println("Título: " + periodico.getTitulo());
        System.out.println("Volume: " + periodico.getVolume());

        System.out.println("Periódicos não podem ser emprestados.");
    }
}
