class Jogador {
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
