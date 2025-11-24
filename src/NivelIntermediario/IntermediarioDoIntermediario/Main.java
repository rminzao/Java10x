package NivelIntermediario.IntermediarioDoIntermediario;

import NivelIntermediario.IntermediarioDoIntermediario.OverloadConstrutores.NivelNinja;
import NivelIntermediario.POOinitial.polimorfismo.abstracao.clans.Uchiha;

public class Main {

    public static void main(String[] args) {

        Uchiha madara = new Uchiha("Madara Uchiha", "Aldeia da Folha", 45, 900, NivelNinja.KAGE);
        madara.habilidadeEspecial();
        //metodo comum
        madara.inteligenciaDeCombate();
        //metodo sobrescrito
        madara.inteligenciaDeCombate(89);
    }
}
