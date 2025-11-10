package NivelIntermediario;

public class Ninja {
    String nome;
    String aldeia;
    int idade;

    //criar metodo publico personalizado "void"= nao precisa retornar nada
    public void SharinganAtivado() {
        System.out.println("O sharingan ativou!");
    }

    // metodo "string"= obrigatoriamente uma string
    public String euSouUmNinja() {
        return "Oi, eu sou um ninja!";
    }

    //metodo "int"= tem q retornar um int
    public int serHokage(int idadeMinimaHokage) {
        return idadeMinimaHokage - idade;
    }
}