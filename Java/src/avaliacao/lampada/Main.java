//Package pedido no envio da atividade
package avaliacao.lampada;
//Scanner para ler oque o usuário digitar(Quer inserir watts?)
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        //Criando nova instância de Lâmpada com valores padrão
        Lampada lampada = new Lampada();
        //Abrinco Scanner
        Scanner sc= new Scanner(System.in);
        //Lendo oque o usuário quer
        System.out.println("Deseja inserir os watts da lampada?(true/false): ");
        boolean opc = sc.nextBoolean();
        //Verificando resposta
        if(opc){
            //Colocando watts personalizados
            lampada.setWatts();
        }
        //Fechando Scanner
        sc.close();
        //Invertendo o status da Lâmpada
        lampada.interruptor();
        //Exibindo status da Lâmpada
        lampada.lampadaInfo();
    }
}