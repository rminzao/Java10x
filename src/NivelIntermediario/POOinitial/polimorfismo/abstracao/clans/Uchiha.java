package NivelIntermediario.POOinitial.polimorfismo.abstracao.clans;

import NivelIntermediario.IntermediarioDoIntermediario.OverloadConstrutores.NivelNinja;
import NivelIntermediario.IntermediarioDoIntermediario.SharinganInterface;
import NivelIntermediario.IntermediarioDoIntermediario.Ninja;

public class Uchiha extends Ninja implements SharinganInterface {

    public Uchiha() {
        super();
    }

    public Uchiha(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    public Uchiha(String nome, String aldeia, int idade, int nivelDeMissoesConcluidas, NivelNinja rank) {
        super(nome, aldeia, idade, nivelDeMissoesConcluidas, rank);
    }

    @Override
    public void sharinganAtivado() {
        System.out.println(nome + ": Ativou o Sharingan");
    }

    // sobreescrever o metodo da classe ninja
    public void nomeDoNinja() {
        System.out.println("Meu nome é: " + nome + " tenho " + idade + " anos" + " e sou da " + aldeia);
    }

    /*@Override
    public void habilidadeEspecial(){
        System.out.println("Minha habilidade especial é o Sharingan");
    }*/

    @Override
    public void estrategiaDeBatalha() {

    }

    @Override
    public void inteligenciaDeCombate(){
        System.out.println("Meu nome é " + nome + " Essa minha INTELIGENCIA de combate");
    }

    @Override
    public void inteligenciaDeCombate(int qi){

        if (qi > 150) {
            System.out.println("Seu QI é: " + qi + " e voce é um genio");
        } else if ( qi >= 130) {
            System.out.println("Seu QI é: " + qi + "e voce é um ninja promissor");
        } else {
            System.out.println("Seu QI é: " + qi + " e voce precisa treinar mais suas estrategias");
        }
    }
}
