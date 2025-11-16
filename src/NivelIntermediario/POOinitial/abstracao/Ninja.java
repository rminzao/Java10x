package NivelIntermediario.POOinitial.abstracao;

public abstract class Ninja {

    protected String nome;
    String aldeia;
    int idade;

    // metodos abstratos
    public abstract void nomeDoNinja();

    public void tacarKunai() {
        System.out.println("Taquei uma kunai");
    }
}

