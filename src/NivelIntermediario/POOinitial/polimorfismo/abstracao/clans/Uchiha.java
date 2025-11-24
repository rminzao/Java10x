package NivelIntermediario.POOinitial.polimorfismo.abstracao.clans;

import NivelIntermediario.POOinitial.herancaMultiplas.SharinganInterface;
import NivelIntermediario.POOinitial.polimorfismo.abstracao.Ninja;

public class Uchiha extends Ninja implements SharinganInterface {

    public Uchiha() {
        super();
    }

    public Uchiha(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    @Override
    public void sharinganAtivado() {
        System.out.println(nome + ": Ativou o Sharingan");
    }

    // sobreescrever o metodo da classe ninja
    @Override
    public void nomeDoNinja() {
        System.out.println("Meu nome é: " + nome + " tenho " + idade + " anos" + " e sou da " + aldeia);
    }

    @Override
    public void habilidadeEspecial(){
        System.out.println("Minha habilidade especial é o Sharingan");
    }
}
