package NivelIntermediario.IntermediarioDoIntermediario.clans;

import NivelIntermediario.IntermediarioDoIntermediario.Ninja;
import NivelIntermediario.IntermediarioDoIntermediario.OverloadConstrutores.NivelNinja;
import NivelIntermediario.IntermediarioDoIntermediario.SharinganInterface;

public class Uchiha extends Ninja implements SharinganInterface {


    public Uchiha() {
    }

    public Uchiha(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    public Uchiha(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, NivelNinja rank) {
        super(nome, aldeia, idade, numeroDeMissoesConcluidas, rank);
    }

    /*
    * Metodo:
    * Implementa da interface Sharingan
    * */
    public void sharinganAtivado() {
        System.out.println("Meu nome é " + nome + ". O Sharingan Ativou, eu sou um Uchiha");
    }

    @Override
    public void estrategiaDeBatalha() {

    }

//    // sharingan desacoplado
//    @Override
//    public void sharinganAtivado() {
//
//    }
}
