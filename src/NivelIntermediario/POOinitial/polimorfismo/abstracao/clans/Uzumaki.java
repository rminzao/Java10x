package NivelIntermediario.POOinitial.polimorfismo.abstracao.clans;

import NivelIntermediario.POOinitial.polimorfismo.abstracao.Ninja;

public class Uzumaki extends Ninja {

    /*public void tacarShuriken(){
        System.out.println("Eu taquei uma Shuriken");
    }*/

    // sobreescrever o metodo da classe ninja
    @Override
    public void nomeDoNinja() {
        System.out.println("Meu nome é: " + nome);
    }

    @Override
    public void inteligenciaDeCombate() {

    }

    @Override
    public void inteligenciaDeCombate(int qi) {

    }
}
