import java.util.Random;


public class Carta{
    private String naipe;
    private int valor;
    private int tipo;
    private int pontos;

    public Carta(){
        sorteaNaipe();
        sorteaValor();
        calculaPontos();
    }

    public String getNaipe(){
        return naipe;
    }
    public void setNaipe(String naipe){
        this.naipe = naipe;
    }
    public int getValor(){
        return valor;
    }
    public void setValor(int valor){
        this.valor = valor;
    }
    public int getTipo(){
        return tipo;
    }
    public void setTipo(int tipo){
        this.tipo = tipo;
    }
    public int getPontos(){
        return pontos;
    }
    public void setPontos(int pontos){
        this.pontos = pontos;
    }

    public void sorteaNaipe(){
        String[] naipes = new String[3];
        
        naipes[0] = "Paus";
        naipes[1] = "Ouros";
        naipes[2] = "Copas";
        naipes[3] = "Espadas";

        Random naipe;
        naipe = new Random();
        int naipeCarta = naipe.nextInt(naipes.length);
        String naipeSorteado = naipes[naipeCarta];

        this.naipe = naipeSorteado;
    }
    public void sorteaValor(){
        Random sorteaValor;
        sorteaValor = new Random();
        int valorSorteado = sorteaValor.nextInt(14);

        this.valor = valorSorteado;
    }
    public void calculaPontos(){
        if (this.getTipo() == 1){
            if (this.getNaipe() == "Paus"){
                int pontosDaCarta = this.getValor() * 2;
                System.out.println("Essa carta vale: "+pontosDaCarta+" pontos.");
                this.setPontos(pontosDaCarta);
            }
            if (this.getNaipe() == "Ouros"){
                int pontosDaCarta = this.getValor() * 3;
                System.out.println("Essa carta vale: "+pontosDaCarta+" pontos.");
                this.setPontos(pontosDaCarta);
            }
            if (this.getNaipe() == "Copas"){
                int pontosDaCarta = this.getValor() * 4;
                System.out.println("Essa carta vale: "+pontosDaCarta+" pontos.");
                this.setPontos(pontosDaCarta);
            }
            if (this.getNaipe() == "Espadas"){
                int pontosDaCarta = this.getValor() * 5;
                System.out.println("Essa carta vale: "+pontosDaCarta+" pontos.");
                this.setPontos(pontosDaCarta);
            }
        }
        if (this.getTipo() == 2){
            int pontosDaCarta = this.getValor() * 1;
            System.out.println("Essa carta vale: "+pontosDaCarta+" pontos.");
            this.setPontos(pontosDaCarta);
        }
        if (this.getTipo() == 3){
            int[] valoresPrimos = {2,3,5,7,11,13};
            for (int valor = 0; valor < valoresPrimos.length; valor++){
                if (valoresPrimos[valor] == this.getValor()){
                    boolean encontrado = true;
                    if (encontrado == true){
                       int pontosDaCarta = this.getValor() * 3;
                       System.out.println("Essa carta vale: "+pontosDaCarta+" pontos.");
                       this.setPontos(pontosDaCarta);
                    }
                }else{
                    if (this.getNaipe() == "Paus"){
                        int pontosDaCarta = this.getValor() * 2;
                        System.out.println("Essa carta vale: "+pontosDaCarta+" pontos.");
                        this.setPontos(pontosDaCarta);
                    }
                    if (this.getNaipe() == "Ouros"){
                        int pontosDaCarta = this.getValor() * 3;
                        System.out.println("Essa carta vale: "+pontosDaCarta+" pontos.");
                        this.setPontos(pontosDaCarta);
                    }
                    if (this.getNaipe() == "Copas"){
                        int pontosDaCarta = this.getValor() * 4;
                        System.out.println("Essa carta vale: "+pontosDaCarta+" pontos.");
                        this.setPontos(pontosDaCarta);
                    }
                    if (this.getNaipe() == "Espadas"){
                        int pontosDaCarta = this.getValor() * 5;
                        System.out.println("Essa carta vale: "+pontosDaCarta+" pontos.");
                        this.setPontos(pontosDaCarta);
                    }
                }
            }
        }
    }
    public void printaCarta(){
        if (this.getValor() == 1){
            System.out.println("Às de "+this.getNaipe());
        }
        if (this.getValor() == 11){
            System.out.println("Valete de "+this.getNaipe());
        }
        if (this.getValor() == 12){
            System.out.println("Rainha de "+this.getNaipe());
        }
        if (this.getValor() == 13){
            System.out.println("Rei de "+this.getNaipe());
        }else{
            System.out.println(this.getValor()+" de "+this.getNaipe());
        }
    }
}
