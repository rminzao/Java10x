package NivelBasico.Condicoes;

public class Ternarios {
    public static void main(String[] args) {

        /*
        * Ternarios: maneiras de reduzir o codigo
        * variavel = (condicao) ? valorSeVerdadeiro : valorSeFalso;
        * Objetivo:
        * */

        short numeroDeMissoes = 9;
        String nivel = (numeroDeMissoes >= 10) ? "Esse ninja esta com mais de 10 missoes" : "Esse ninja" +
                "tem menos de 10 missoes";
        System.out.println(nivel);
    }
}
