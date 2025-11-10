package NivelIntermediario;

import javax.swing.plaf.basic.BasicRadioButtonUI;

public class Main {
    public static void main(String[] args) {

        // criar o ninja naruto = objeto
        Ninja Naruto = new Ninja();
        Naruto.nome = "Naruto Uzumaki";
        Naruto.aldeia = "Aldeia da folha";
        Naruto.idade = 18;

        // Criar sasuke = objeto
          Ninja Sasuke = new Ninja();
          Sasuke.nome = "Sasuke Uchiha";
          Sasuke.idade = 18;
          Sasuke.aldeia = "Aldeia da folha";

          //aplicando metodo ao objeto
          Sasuke.SharinganAtivado();
          String metodo = Sasuke.euSouUmNinja();
            System.out.println(metodo);

          int quantoTempoFalta = Sasuke.serHokage(70);
            System.out.println("voce tem: " + Sasuke.idade + " entao falta no minimo: " + quantoTempoFalta + " para ser hokage");

          //cria sakura = objeto
        Ninja Sakura = new Ninja();
        Sakura.nome = "Sakura Haruno";
        Sakura.idade = 18;
        Sakura.aldeia = "Aldeia da folha";
    }
}
