package TiposDeDados;

public class DadosNaoPrimitivos {
    public static void main(String[] args) {

        /*
        * Dados nao primitivos: String, Array, Class, enum
        * objetivos: Criar um ninja, e atribuir metodos a ele.
        * */

        String nome = "Naruto Uzumaki";
        String nomeUpperCase = nome.toUpperCase(); // vai colocar tudo em CAPSLOCK
        System.out.println("Esse texto esta em CAPSLOCK: " + nome.toUpperCase());
        System.out.println(nome);


        String aldeia = "Aldeia da folha";
        String aldeiaToLowerCase = aldeia.toLowerCase(); // tudo em caixa baixa (obvio)
        String aldeiaToUpperCase = aldeia.toUpperCase();
        System.out.println(aldeia.toLowerCase());
        System.out.println("Esse texto esta em LowerCase = " + aldeiaToLowerCase);
        System.out.println("Esse texto esta em UpperCase = " + aldeiaToUpperCase);
    }
}
