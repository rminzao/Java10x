package NivelIntermediario.desafios.desafio1;

import NivelIntermediario.desafios.desafio1.clans.Uchiha;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner caixaDeTexto = new Scanner(System.in);

        System.out.println("Digite o nome do ninja:");
        String nome = caixaDeTexto.nextLine();

        System.out.println("Digite a idade do ninja:");
        int idade = caixaDeTexto.nextInt();
        caixaDeTexto.nextLine();

        System.out.println("Digite o nome da missão:");
        String missao = caixaDeTexto.nextLine();

        System.out.println("Digite o nível de dificuldade da missão:");
        String dificuldade = caixaDeTexto.nextLine();

        System.out.println("Digite o status da missão:");
        String status = caixaDeTexto.nextLine();

        System.out.println("Digite a habilidade especial do Uchiha:");
        String habilidade = caixaDeTexto.nextLine();

        Uchiha ninja = new Uchiha();
        ninja.nome = nome;
        ninja.idade = idade;
        ninja.missao = missao;
        ninja.dificuldade = dificuldade;
        ninja.statusMissao = status;
        ninja.habilidadeEspecial = habilidade;

        ninja.mostrarInformacoes();

        caixaDeTexto.close();
    }
}
