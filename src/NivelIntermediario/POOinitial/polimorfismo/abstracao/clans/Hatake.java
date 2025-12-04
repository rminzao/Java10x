package NivelIntermediario.POOinitial.polimorfismo.abstracao.clans;

import NivelIntermediario.POOinitial.herancaMultiplas.AnbuInteface;
import NivelIntermediario.IntermediarioDoIntermediario.SharinganInterface;
import NivelIntermediario.POOinitial.polimorfismo.abstracao.Ninja;

public class Hatake extends Ninja implements SharinganInterface, AnbuInteface {

    public Hatake(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    @Override
    public void nomeDoNinja() {
        System.out.println("Eu sou " + nome + " do clã Hatake.");
    }

    @Override
    public void sharinganAtivado() {
        System.out.println(nome + ": Ativou o Sharingan");
    }

    public void ninjaDeElite() {
        System.out.println("Sou um ninja de Elite Anbu");
    }

    @Override
    public void inteligenciaDeCombate() {

    }

    @Override
    public void inteligenciaDeCombate(int qi) {

    }
}
