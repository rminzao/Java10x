package NivelIntermediario.POOinitial.abstracao;

import NivelIntermediario.POOinitial.abstracao.clans.Uchiha;
import NivelIntermediario.POOinitial.abstracao.clans.Uzumaki;

public class Main {

    public static void main(String[] args) {

        //obj ninja nao da pra ser criado


        //obj uzumaki
        Uzumaki Naruto = new Uzumaki();
        Naruto.nome = "Narutao";
        Naruto.habilidadeEspecial();
        Naruto.estrategiaDeBatalha();

        // obj uchiha
        Uchiha Sasuke = new Uchiha();
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.nomeDoNinja();
        Sasuke.habilidadeEspecial();
        /*Sasuke.tacarKunai();*/

    }
}
