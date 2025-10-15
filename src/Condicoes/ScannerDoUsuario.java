package Condicoes;
import java.util.Scanner;

public class ScannerDoUsuario {

    /*
    * Scanner = É UM JEITO DE TRAZER O USUARIO PARA A APLICACAO
    * Objetivo = USUARIO VAI CRIAR UM NINJA E VAMOS VALIDAR OS DADOS
    * */
    public static void main(String[] args) {
        // Abrir o Scanner
        Scanner caixaDeTexto = new Scanner(System.in);

        // receber o nome do ninja
        System.out.println("Escreva aqui o nome do ninja");
        String nomeDoNinja = caixaDeTexto.nextLine();
        System.out.println("O nome do ninja é: " + nomeDoNinja);

        // receber a idade do ninja
        System.out.println("Escreva aqui a idade do seu ninja: ");
        int idadeDoNinja = caixaDeTexto.nextInt();
        System.out.println(nomeDoNinja + " Tem " + idadeDoNinja + " anos");

        // tratamento de dados
        if (idadeDoNinja >= 18) {
            System.out.println("Este ninja, já é maior de idade e pode ir para missoes fora da aldeia");
        } else {
            System.out.println("Este ninja é muito novo ainda, precisa treinar mais antes de sair da vila");
        }


        // Fechar sempre o Scanner
        caixaDeTexto.close();

    }
}
