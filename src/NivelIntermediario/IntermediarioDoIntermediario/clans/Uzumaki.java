package NivelIntermediario.IntermediarioDoIntermediario.clans;

import NivelIntermediario.IntermediarioDoIntermediario.Ninja;
import NivelIntermediario.IntermediarioDoIntermediario.OverloadConstrutores.Biju;
import NivelIntermediario.IntermediarioDoIntermediario.OverloadConstrutores.NivelNinja;

public class Uzumaki extends Ninja {

    public Biju biju;

    public Uzumaki(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    public Uzumaki(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, NivelNinja rank) {
        super(nome, aldeia, idade, numeroDeMissoesConcluidas, rank);
    }

    // sobrecarregando com atirbuto da propia classe com this
    public Uzumaki(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, NivelNinja rank, Biju biju) {
        super(nome, aldeia, idade, numeroDeMissoesConcluidas, rank);
        this.biju = biju;
    }

    public Uzumaki() {
    }

    public Uzumaki(String narutoUzumaki, int i, int i1, NivelNinja nivelNinja) {
    }

//    public void ModoSabioAtivado() {
//        System.out.println("Meu " + nome + ". Eu ativei o modo Sabio");
//    }

    @Override
    public void estrategiaDeBatalha() {

    }
}
