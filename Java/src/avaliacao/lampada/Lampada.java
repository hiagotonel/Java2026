//Package pedido no envio da atividade
package avaliacao.lampada;
//Scanner para ler oque o usuário digitar(Watts)
import java.util.Scanner;

//Classe Lâmpada
public class Lampada{
    //Variáveis da Lâmpada, uma para dizer se está acesa
    //E outra para guardar quantos watts ela tem
    private boolean acesa;
    private int watts;

    //Construtor com valores padrão
    public Lampada(){
        acesa = false;
        watts = 60;
    }
    //Inverte o estado da lampada
    public void interruptor(){
        if(acesa){
            acesa = false;
        } 
        else{
            acesa = true;
        }
    }
    //Devolve os watts da Lâmpada
    public int getWatts(){
        return watts;
    }
    //Lê os watts que o usuário quer colocar na lâmpada
    public void setWatts(){
            //Abrindo Scanner
            Scanner sc= new Scanner(System.in);
            //Laço de repetição pro usuário digitar certo
            do{
                //Pedindo os watts
                System.out.println("Digite os Watts da lâmpada(1 a 1000): ");
                int wattsc = sc.nextInt();
                watts=wattsc;
                //Verificando pra exibir mensagem de erro
                if(watts<1 || watts>1000){
                    System.out.println("Valor invalido, tente novamente!!!");
                }
            }while(watts<1 || watts>1000);
            //Fechando Scanner ao final de tudo
            sc.close();
    }
    //Printa as informações da Lâmpada
    public void lampadaInfo(){
        if(acesa){
            System.out.println("A lâmpada está ligada");
        }
        else{
            System.out.println("A lâmpada está desligada");
        }
        System.out.println("Watts da lâmpada: "+watts+"w");
    }
}