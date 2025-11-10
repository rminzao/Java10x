package NivelBasico.Condicoes;

public class ifEElse {
    public static void main(String[] args) {

        /*
        * IF e Else - NivelBasico.Condicoes
        * Objetivo: Passar o ninja de nivel de acordo com o numero de missoes
        * */

        String nome = "Naruto Uzumaki";
        String ranking;
        int idade = 16;
        boolean hokage = false;
        short nMissoes = 20;

        /*
        * if (condicao) {resultado}
        * else if (concao) {resultado}
        * else {resultado caso nada seja true}
        * */

        // se(condicao) {faca isso}
        if (nMissoes == 10 && idade > 15) {
            System.out.println("Rank: Chunnin");
        } else if (nMissoes >= 20) {
            System.out.println("Rank: Jounin");
        }
        else {
            System.out.println("Rank: Gennin");
        }
    }
}
