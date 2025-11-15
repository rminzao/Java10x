package NivelIntermediario.desafios;


public class Ninja {

    public String nome;
    public int idade;
    public String missao;
    public String dificuldade;
    public String statusMissao;

    public void mostrarInformacoes() {
        System.out.println("Sou " + nome + ", atualmente com " + idade + " anos. Minha missão '" + missao + "' foi " + statusMissao + ". Era uma missao de nivel: " + dificuldade + ".");
    }
}
