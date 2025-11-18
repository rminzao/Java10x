package NivelIntermediario.POOinitial.polimorfismo.abstracao;

public abstract class Ninja implements estrategiaDeBatalha {

    protected String nome;
    protected String aldeia;
    protected int idade;

    public Ninja() {
    }

    public Ninja(String nome, String aldeia, int idade) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }

    // metodos abstratos
    public abstract void nomeDoNinja();

    /*public void tacarKunai() {
        System.out.println("Taquei uma kunai");
    }*/

    // metodo geral, todos os ninjas vao ter
    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + nome + " e esse é meu ataque especial");
    }

    /*// metodo abstrato - obrigatorio em todas as classes
    public abstract void estrategiaDeBatalha();*/

    // sobreescrevendo o metodo da interface
    @Override
    public void estrategiaDeBatalha(){
        System.out.println("Esta é minha estrategia de combate");
    }
}

