package NivelBasico.Desafios;

import java.lang.classfile.instruction.SwitchCase;
import java.util.Scanner;

public class Desafio1 {
    public static void main(String[] args) {

        //Entrada de dados
        Scanner scanner = new Scanner(System.in);

        // fazer o array
        int NMAX = 2;
        String[] ninjas = new String[NMAX];

        //contadores
        int cadastros = 0;
        int opcao = 0;

        while (opcao != 3) {

            // MENU
            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao){
                case 1:
                    if (cadastros < NMAX) {
                        System.out.println("Digite o nome do ninja");
                        String nomeNinja = scanner.nextLine();
                        ninjas[cadastros] = nomeNinja;
                        cadastros++;
                        System.out.println("Ninja cadastrado com sucesso");
                    } else {
                        System.out.println("A lista de ninjas esta cheia, impossivel cadastrar um novo ninja");
                    }
                    break;

                case 2:
                    if (cadastros == 0) {
                        System.out.println("Nenhum ninja encontrado");
                    } else {
                        System.out.println("============ Lista de ninjas ============");
                        for (int i = 0; i < ninjas.length; i++) {
                            System.out.println(ninjas[i]);
                        }
                        break;
                    }

                case 3:
                    System.out.println("Estamos saindo o programa...Aguarde");
                    break;

                default:
                    System.out.println("Essa opcao nao é valida");
                    break;
            }
        }


        //Cadastrar os ninjas em um array e mostrar opcoes com switch case




    }
}
