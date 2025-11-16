package NivelIntermediario.POOinitial.abstracao.clans;

import NivelIntermediario.POOinitial.abstracao.Ninja;
import NivelIntermediario.POOinitial.abstracao.NinjaInterface;

public class Uzumaki extends Ninja {

    /*public void tacarShuriken(){
        System.out.println("Eu taquei uma Shuriken");
    }*/

    // sobreescrever o metodo da classe ninja
    @Override
    public void nomeDoNinja() {
        System.out.println("Meu nome é: " + nome);
    }
}
