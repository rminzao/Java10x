package NivelIntermediario.POOinitial.heranca;

import NivelIntermediario.POOinitial.heranca.clans.Haruno;
import NivelIntermediario.POOinitial.heranca.clans.Hyuga;
import NivelIntermediario.POOinitial.heranca.clans.Uchiha;
import NivelIntermediario.POOinitial.heranca.clans.Uzumaki;
import NivelIntermediario.POOinitial.heranca.filhos.Boruto;

public class Main {
    public static void main(String[] args) {
        //Objetos
        Uzumaki Naruto = new Uzumaki();
        Naruto.nome = "Naruto Uzumaki";
        Naruto.idade = 16;
        Naruto.aldeia = "Aldeia da folha";
        Naruto.ModoSabioAtivado();

        //obejto2
        Uchiha Sasuke = new Uchiha();
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.idade = 17;
        Sasuke.aldeia = "Aldeia da folha";
        Sasuke.SharinganAtivado();

        //obejto3
        Haruno Sakura = new Haruno();
        Sakura.nome = "Sakura Haruno";
        Sakura.idade = 17;
        Sakura.aldeia = "Aldeia da folha";
        Sakura.ativarCura();

        //obejto4
        Hyuga Hinata = new Hyuga();
        Hinata.nome = "Hinata Hyuga";
        Hinata.idade = 15;
        Hinata.aldeia = "Aldeia da folha";
        Hinata.ZoiDoCapiroto();

        //obejto5
        Boruto Boruto = new Boruto();
        Boruto.nome = "Boruto Hyuga Uzumaki";
        Boruto.idade = 12;
        Boruto.aldeia = "Aldeia da folha";

        Boruto.ModoSabioAtivado();
        Boruto.AtivarJougan();
        Boruto.AtivarJougan();

    }
}