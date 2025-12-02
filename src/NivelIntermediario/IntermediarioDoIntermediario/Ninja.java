package NivelIntermediario.IntermediarioDoIntermediario;

import NivelIntermediario.IntermediarioDoIntermediario.OverloadConstrutores.NivelNinja;
import NivelIntermediario.POOinitial.polimorfismo.abstracao.estrategiaDeBatalha;

public abstract class Ninja implements estrategiaDeBatalha {

        //TODO: Incluir 2 novos atributos numeroDeMissoesConcluidas, Rank
        // TODO: Rank: Gennin, Chunnin, Jounnin, kages

        protected String nome;
        protected String aldeia;
        protected int idade;
        protected int numeroDeMissoesConcluidas;
        NivelNinja rank;
        double altura;

        // Metodo existente, primeiro metodo
        public Ninja(String nome, String aldeia, int idade) {
            this.nome = nome;
            this.aldeia = aldeia;
            this.idade = idade;
        }

        // TODO: Sobrecarga do construtor chamado os novos atributos
        // Sobrecarga de metodos voce nao precisa redeclarar o construtor so os novos atributos
        public Ninja(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, NivelNinja rank) {
            this(nome, aldeia, idade);
            this.numeroDeMissoesConcluidas = numeroDeMissoesConcluidas;
            this.rank = rank;
        }

        public Ninja() {
        }

        // TODO NINJA VAI FAZER OBRIGATORIAMENTE
        final void tacarKunai(){
            System.out.println("Eu sou um metodo da classe mae");
        }

        public void habilidadeEspecial() {
            System.out.println("Meu nome é " + nome + " e esse é minha ESTRATEGIA de combate. Eu ja completei: " + numeroDeMissoesConcluidas + " missoes");
        }

        //Sobrecarga de metodo - inteligencia de combate
        public void inteligenciaDeCombate(){
            System.out.println("Meu nome é " + nome + " Essa minha INTELIGENCIA de combate");
        }

        public void inteligenciaDeCombate(int qi){
            
            if (qi > 150) {
                System.out.println("Seu QI é: " + qi + " e voce é um genio");
            } else if ( qi >= 130) {
                System.out.println("Seu QI é: " + qi + "e voce é um ninja promissor");
            } else {
                System.out.println("Seu QI é: " + qi + " e voce precisa treinar mais suas habilidades");
            }
        }

        // referencia de memoria sempre tem q ter um Override
        @Override
        public String toString(){
            return "Metodo toString";
        }
}
