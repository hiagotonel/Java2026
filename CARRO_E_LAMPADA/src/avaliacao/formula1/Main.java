package avaliacao.formula1;
public class Main {
    public static void main(String[] args){
        Patrocinadores patrocinador1 = new Patrocinadores("Petróbras", 25000.0);
        Equipe equipe = new Equipe("Ferrari", 1939, patrocinador1);
        Piloto piloto = new Piloto("Airton Senna", 28, "Brasileiro", 41);
        Engenheiro engenheiro = new Engenheiro("David Brown", 36, "Brasileiro", piloto);
        Carro carro = new Carro(12, 1, equipe, piloto, engenheiro);

        System.out.println("\n----------DADOS-CARRO-CONSTRUTORES---------\n");

        System.out.println("----------DADOS-PILOTO----------");
        System.out.println("Nome: "+carro.getPiloto().getNome());
        System.out.println("Idade: "+carro.getPiloto().getIdade());
        System.out.println("Nacionalidade: "+carro.getPiloto().getNacionalidade());
        System.out.println("Número de vitórias: "+carro.getPiloto().getNumVitorias());

        System.out.println("----------DADOS-CARRO----------");
        System.out.println("Número: "+carro.getNumero());
        System.out.println("Posição: "+carro.getPosicao()+"º");

        System.out.println("----------DADOS-EQUIPE----------");
        System.out.println("Nome: "+carro.getEquipe().getNome());
        System.out.println("Ano de fundação: "+carro.getEquipe().getAnoFundacao());

        System.out.println("----------DADOS-ENGENHEIRO----------");
        System.out.println("Nome: "+carro.getEngenheiro().getNome());
        System.out.println("Idade: "+carro.getEngenheiro().getIdade());
        System.out.println("Nacionalidade: "+carro.getEngenheiro().getNacionalidade());

        System.out.println("----------DADOS-PATROCINADORES----------");
        for(Integer i=0;i<carro.getEquipe().getQuantidadePatrocinadores();i++){
            System.out.println("\nPatrocinador "+(i+1));
            System.out.println("Nome: "+carro.getEquipe().getPatrocinadores()[i].getNome());
            System.out.println("Valor: "+carro.getEquipe().getPatrocinadores()[i].getValor());
        }

        Patrocinadores patrocinador2 = new Patrocinadores("Mobil 1", 500000.0);
        Patrocinadores patrocinador3 = new Patrocinadores("Red Bull", 1000000.0);

        carro.getEquipe().setPatrocinadores(patrocinador2,0);
        carro.getEquipe().setPatrocinadores(patrocinador3,1);

        carro.getPiloto().setNome("Max Verstappen");
        carro.getPiloto().setIdade(27);
        carro.getPiloto().setNacionalidade("Holandês");
        carro.getPiloto().setNumVitorias(60);

        carro.getEngenheiro().setNome("Gianpiero Lambiase");
        carro.getEngenheiro().setIdade(44);
        carro.getEngenheiro().setNacionalidade("Italiano");

        carro.getEquipe().setNome("Red Bull Racing");
        carro.getEquipe().setAnoFundacao(2004);

        carro.setNumero(1);
        carro.setPosicao(1);

        System.out.println("\n----------DADOS-CARRO-SETTERS---------\n");

        System.out.println("----------DADOS-PILOTO----------");
        System.out.println("Nome: "+carro.getPiloto().getNome());
        System.out.println("Idade: "+carro.getPiloto().getIdade());
        System.out.println("Nacionalidade: "+carro.getPiloto().getNacionalidade());
        System.out.println("Número de vitórias: "+carro.getPiloto().getNumVitorias());

        System.out.println("----------DADOS-CARRO----------");
        System.out.println("Número: "+carro.getNumero());
        System.out.println("Posição: "+carro.getPosicao()+"º");

        System.out.println("----------DADOS-EQUIPE----------");
        System.out.println("Nome: "+carro.getEquipe().getNome());
        System.out.println("Ano de fundação: "+carro.getEquipe().getAnoFundacao());

        System.out.println("----------DADOS-ENGENHEIRO----------");
        System.out.println("Nome: "+carro.getEngenheiro().getNome());
        System.out.println("Idade: "+carro.getEngenheiro().getIdade());
        System.out.println("Nacionalidade: "+carro.getEngenheiro().getNacionalidade());

        System.out.println("----------DADOS-PATROCINADORES----------");
        for(Integer i=0;i<carro.getEquipe().getQuantidadePatrocinadores();i++){
            System.out.println("\nPatrocinador "+(i+1));
            System.out.println("Nome: "+carro.getEquipe().getPatrocinadores()[i].getNome());
            System.out.println("Valor: "+carro.getEquipe().getPatrocinadores()[i].getValor());
        }
    }
}