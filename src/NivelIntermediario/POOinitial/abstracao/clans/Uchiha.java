package NivelIntermediario.POOinitial.abstracao.clans;

import NivelIntermediario.POOinitial.abstracao.Ninja;

public class Uchiha extends Ninja {

    // sobreescrever o metodo da classe ninja
    @Override
    public void nomeDoNinja() {
        System.out.println("Meu nome é: " + nome);
    }
}
