package Condicoes;

public class LacosDeRepeticao {
    public static void main(String[] args) {

        /*
        * Lacos de repeticao: vai repetir quantas vezes desejar ou ate atingir o maximo do paramentro inserido
        * WHILE = FOR
        * */

        // While
        // while (condicao) {tudo aqui vai acontecer}

        int numeroDeClones = 0;
        int numeroMaximoClones = 40;

        while (numeroDeClones <= numeroMaximoClones) {
            numeroDeClones++;
            System.out.println("O naruto fez um clone das sombras " + numeroDeClones);
        }

        // FOR

        for (int i = 0; i <= 40; i++) {
            System.out.println("O naruto fez um clone das sombras" + i);
        }
    }
}
