package NivelBasico;

public class Array {
    public static void main(String[] args) {

        /*
        * Arrays = sao tipos referencia
        * */

        String[] ninja = new String[5];
        ninja[0] = "Naruto Uzumaki";
        ninja[1] = "Sasuke Uchiha";
        ninja[2] = "Sakura Haruno";
        ninja[3] = "Hinata Hyuga";
        /*System.out.println(ninja[4]);*/

        // Redeclarar Array
        ninja = new String[7];
        ninja[0] = "Hashirama senju";
        ninja[1] = "Tobirama Senju";
        ninja[2] = "Hiruzen Sarutobi";
        ninja[3] = "Minatu Namikaze";
        ninja[4] = "Tsunade";
        ninja[5] = "Kakashi Hatake";
        ninja[6] = "Naruto Uzumaki";

        // For para fazer um loop no array
        for (int i = 0; i < 7; i++) {
            System.out.println(ninja[i]);
        }


        // Array idade inicializa como 0
        int[] idade = new int[2];
        System.out.println(idade);

        // Array boolean como false
        boolean[] vddORfalse = new boolean[1];
        System.out.println(vddORfalse[0]);

        // Doubles inicializam como 0.0
        double[] flutuante = new double[1];
        System.out.println(flutuante[0]);




        String nomeNinja = "Gara do deserto";
    }
}
