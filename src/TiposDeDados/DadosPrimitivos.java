package TiposDeDados;

public class DadosPrimitivos {
    public static void main(String[] args) {
        /*
        *Dados primitivos - int, doule, float, char, boolean, short.
        * Objetivo da aula: Criar um ninja -- naruto
        */

        int idade = 17; // Valor maximo: 2147483648
        double altura = 1.62;
        char inicial = 'N';
        boolean vivoOuMorto = true;
        Long saldoBancario = 99999L; // Valor maximo: 9.223.372.036.854.775,807

        System.out.println(idade); // Comando para mostrar para o usuario
        System.out.println(saldoBancario);
        System.out.println(inicial);
        System.out.println(inicial);
        System.out.println("saldo é Bancario = " + saldoBancario);
        System.out.println("O usuario esta = " + vivoOuMorto);
    }
}
