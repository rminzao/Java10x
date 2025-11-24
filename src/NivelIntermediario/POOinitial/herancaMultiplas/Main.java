package NivelIntermediario.POOinitial.herancaMultiplas;

import NivelIntermediario.POOinitial.polimorfismo.abstracao.clans.Hatake;
import NivelIntermediario.POOinitial.polimorfismo.abstracao.clans.Uchiha;

public class Main {
    public static void main(String[] args) {

        // obj uchiha
        Uchiha sasuke = new Uchiha("Sasuke Uchiha", "aldeia da folha", 17);
        sasuke.sharinganAtivado();

        // obj Hatake
        Hatake kakashi = new Hatake("Kakashi Hatake", "Aldeia da folha", 48);
        kakashi.sharinganAtivado();
        kakashi.ninjaDeElite();
    }
}
