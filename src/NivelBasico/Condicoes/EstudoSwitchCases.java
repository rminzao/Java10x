package NivelBasico.Condicoes;
import java.util.Scanner;

public class EstudoSwitchCases {

    public static void main(String[] args) {

        /*
        * SwitchCases:  Que serve para gerar casos especificos
        *Objetivo: pedir para o usuario escolher entre os ninjas
        * */

        // pedir para o usuarios
        Scanner scanner = new Scanner(System.in);

        //mostrar opcoes para o usuario
        System.out.println("Escolha um personagem: ");
        System.out.println("1- Naruto Uzumaki");
        System.out.println("2- Sasuke Uchiha");
        System.out.println("3- Sakura Haruno");

        //pedir para escolher
        int escolhaDoUsuario = scanner.nextInt();

        System.out.println("Voce digitou o numero: " + escolhaDoUsuario);

        // reacao ao escolher um personagem
        switch (escolhaDoUsuario) {
            case 1:
            System.out.println("O usuario escolheu o Naruto Uzumaki");
                break;
            case 2:
                System.out.println("O usuario escolheu o Sasuke Uchiha, o ninja mais revoltado");
                break;
            case 3:
                System.out.println("O usuario escolhe Sakura Haruno");
                break;
            default:
                System.out.println("Voce nao digitou uma respota valida, tente de novo");
        }


        //fechar scanner
        scanner.close();
    }
}
