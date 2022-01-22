import java.util.Scanner;
import IFAL.Carta;

class Jogador{
    private String nome;
    private int pontuacao;

    public Jogador(){
        this.pontuacao = 0;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public int getPontuacao(){
        return pontuacao;
    }
    public void setPontuacao(int pontos){
        this.pontuacao = pontos;
    }
}

public class Main{
    public static void main(String args[]){
        System.out.println("--- BEM-VINDO AO JOGO! ---\nQuantos jogadores serão? ");

        Scanner jogadores;
        jogadores = new Scanner(System.in);
        int nJogadores = jogadores.nextInt();
        String[] todosJogadores = new String[5];

        jogadores.close();

        if (nJogadores == 1){
            System.out.println("O número de jogadores mínimo é 2!");
        }

        if (nJogadores == 2){
            System.out.println("Insira o nome do primeiro jogador: ");
            Scanner jogadorNome;
            jogadorNome = new Scanner(System.in);
            Jogador jogador1;
            jogador1 = new Jogador();
            jogador1.setNome(jogadorNome.nextLine());

            todosJogadores[0] = jogador1.getNome();

            System.out.println("Insira o nome do segundo jogador: ");
            Jogador jogador2;
            jogador2 = new Jogador();
            jogador2.setNome(jogadorNome.nextLine());

            todosJogadores[1] = jogador2.getNome();

            jogadorNome.close();
        }

        if (nJogadores == 3){
            System.out.println("Insira o nome do primeiro jogador: ");
            Scanner jogadorNome = new Scanner(System.in);
            Jogador jogador1;
            jogador1 = new Jogador();
            jogador1.setNome(jogadorNome.nextLine());

            todosJogadores[0] = jogador1.getNome();

            System.out.println("Insira o nome do segundo jogador: ");
            Jogador jogador2;
            jogador2 = new Jogador();
            jogador2.setNome(jogadorNome.nextLine());

            todosJogadores[1] = jogador2.getNome();

            System.out.println("Insira o nome do terceiro jogador: ");
            Jogador jogador3;
            jogador3 = new Jogador();
            jogador3.setNome(jogadorNome.nextLine());

            todosJogadores[2] = jogador3.getNome();

            jogadorNome.close();
        }

        if (nJogadores == 4){
            System.out.println("Insira o nome do primeiro jogador: ");
            Scanner jogadorNome;
            jogadorNome = new Scanner(System.in);
            Jogador jogador1;
            jogador1 = new Jogador();
            jogador1.setNome(jogadorNome.nextLine());

            todosJogadores[0] = jogador1.getNome();

            System.out.println("Insira o nome do segundo jogador: ");
            Jogador jogador2;
            jogador2 = new Jogador();
            jogador2.setNome(jogadorNome.nextLine());

            todosJogadores[1] = jogador2.getNome();

            System.out.println("Insira o nome do terceiro jogador: ");
            Jogador jogador3;
            jogador3 = new Jogador();
            jogador3.setNome(jogadorNome.nextLine());

            todosJogadores[2] = jogador3.getNome();

            System.out.println("Insira o nome do quarto jogador: ");
            Jogador jogador4;
            jogador4 = new Jogador();
            jogador4.setNome(jogadorNome.nextLine());

            todosJogadores[3] = jogador4.getNome();

            jogadorNome.close();
        }
        System.out.println("---- OS JOGADORES SÃO: "+todosJogadores+" ----");
        System.out.println("---- QUAL O TIPO DE CARTA SERÁ USADO NO JOGO?\nTRADICIONAL - INSIRA 1;\nNAIPE+ - INSIRA 2;\nVALOR+ - INSIRA 3");
        Scanner carta;
        carta = new Scanner(System.in);
        int tipoCarta = carta.nextInt();
        int[] pontosJogadores = new int[5];

        for (int rodadas = 0; rodadas >= 0;){
            System.out.println("--- BEM-VINDO À RODADA "+rodadas);
            if (nJogadores == 2){
                System.out.println("A CARTA DO PRIMEIRO JOGADOR É: ");
                Carta carta1;
                carta1 = new Carta();
                carta1.printaCarta();
                pontosJogadores[0] = carta1.getPontos();
                System.out.println("A CARTA DO SEGUNDO JOGADOR É: ");
                Carta carta2;
                carta2 = new Carta();
                carta2.printaCarta();
                pontosJogadores[0] = carta2.getPontos();


        }
        }
    }
} 
