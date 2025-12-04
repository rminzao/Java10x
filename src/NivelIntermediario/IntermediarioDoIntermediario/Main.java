package NivelIntermediario.IntermediarioDoIntermediario;

import NivelIntermediario.IntermediarioDoIntermediario.OverloadConstrutores.Biju;
import NivelIntermediario.IntermediarioDoIntermediario.OverloadConstrutores.NivelNinja;
import NivelIntermediario.IntermediarioDoIntermediario.clans.Uzumaki;
import NivelIntermediario.POOinitial.polimorfismo.abstracao.clans.Uchiha;

public class Main {

    static void main(String[] args) {

        System.out.println("-------------- Naruto --------------");

        Uzumaki naruto = new Uzumaki("Naruto Uzumaki", "Aldeia da Folha", 15, 100, NivelNinja.CHUUNIN, Biju.KURAMA);
        System.out.println(naruto.biju);

        System.out.println("-------------- Sasuke --------------");

        Uchiha sasuke = new Uchiha("Sasuke Uchiha", "Aldeia da Folha", 17, 10, NivelNinja.GENIN);
        sasuke.habilidadeEspecial();

        System.out.println("-------------- Itachi --------------");

        Uchiha itachi = new Uchiha("Itachi Uchiha", "Aldeia da Folha", 27, 32, NivelNinja.JOUNNIN);
        sasuke.habilidadeEspecial();

        System.out.println("-------------- Madara --------------");

        Uchiha madara = new Uchiha("Madara Uchiha", "Aldeia da Folha", 45, 900, NivelNinja.KAGE);
        madara.habilidadeEspecial();
        //metodo comum
        madara.inteligenciaDeCombate();

        System.out.println("--------------");

    }
}
