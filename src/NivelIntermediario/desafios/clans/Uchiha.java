package NivelIntermediario.desafios.clans;

import NivelIntermediario.desafios.Ninja;

public class Uchiha extends Ninja {

    public String habilidadeEspecial;

    public void mostrarHabilidadeEspecial() {
        System.out.println("Habilidade especial: " + habilidadeEspecial);
    }

    @Override
    public void mostrarInformacoes() {
        super.mostrarInformacoes();
        System.out.println("Habilidade especial mais utilizada: " + habilidadeEspecial);
    }
}
