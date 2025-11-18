package NivelIntermediario.POOinitial.polimorfismo.abstracao.clans;

import NivelIntermediario.POOinitial.polimorfismo.abstracao.Ninja;

public class Uchiha extends Ninja {

    public Uchiha() {
        super();
    }

    public Uchiha(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    // sobreescrever o metodo da classe ninja
    @Override
    public void nomeDoNinja() {
        System.out.println("Meu nome é: " + nome);
    }
}
