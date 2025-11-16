package NivelIntermediario.POOinitial.abstracao;

import NivelIntermediario.POOinitial.abstracao.clans.Uchiha;
import NivelIntermediario.POOinitial.abstracao.clans.Uzumaki;

public class Main {

    public static void main(String[] args) {

        Uzumaki Naruto = new Uzumaki();
        Naruto.tacarShuriken();

        Uchiha Sasuke = new Uchiha();
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.nomeDoNinja();
        Sasuke.tacarKunai();

    }
}
