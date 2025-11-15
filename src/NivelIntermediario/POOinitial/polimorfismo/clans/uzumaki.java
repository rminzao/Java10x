package NivelIntermediario.POOinitial.polimorfismo.clans;

import NivelIntermediario.POOinitial.polimorfismo.Ninja;

public class uzumaki extends Ninja {

    @Override
    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + nome + " e esse é meu ataque Uzumaki");
    }
}
