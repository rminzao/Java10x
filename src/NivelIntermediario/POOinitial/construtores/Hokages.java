package NivelIntermediario.POOinitial.construtores;

public abstract class Hokages {

    protected String nome;
    protected int idade;
    boolean vivoOuNao;
    String aldeia;
    int missoes;
    double saldoBancario;
    double altura;

    public abstract void sabedoriaHokage();

    public Hokages() {
        // construtor vazio padrão
    }

    // criar um construtor com argumentos
    public Hokages(String nome) {
        this.nome = nome;
    }

    public Hokages (int idade) {
        this.idade = idade;
    }

    // contrutor All args
    public Hokages(String nome, int idade, boolean vivoOuNao) {
        this.nome = nome;
        this.idade = idade;
        this.vivoOuNao = vivoOuNao;
    }

    // criar automaticamente os construtores com intelliJ cmd+N
    public Hokages(String nome, int idade, boolean vivoOuNao, String aldeia, int missoes, double saldoBancario, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.vivoOuNao = vivoOuNao;
        this.aldeia = aldeia;
        this.missoes = missoes;
        this.saldoBancario = saldoBancario;
        this.altura = altura;
    }
}
