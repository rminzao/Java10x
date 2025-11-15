package NivelIntermediario.POOinitial.polimorfismo;

import NivelIntermediario.POOinitial.polimorfismo.clans.uchiha;
import NivelIntermediario.POOinitial.polimorfismo.clans.uzumaki;

public class Main {
    public static void main(String[] args) {

        uzumaki naruto = new uzumaki();
        naruto.nome = "Naruto Uzumaki";
        naruto.habilidadeEspecial();

        uchiha sasuke = new uchiha();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.habilidadeEspecial();

    }
}
