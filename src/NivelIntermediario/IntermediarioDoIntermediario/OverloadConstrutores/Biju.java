package NivelIntermediario.IntermediarioDoIntermediario.OverloadConstrutores;

public enum Biju {

    SHUKAKU("Shukaku", "Gaara", 1),
    MATATABI("Matatabi", "Yagura", 2),
    ISOBI("Isobi", "Yagura", 3),
    SON_GOKU("Son Goku", "Roshi", 4),
    KOKUO("Kokuo", "Han", 5),
    SAIKEN("Saiken", "Utakata", 6),
    CHOMEI("Chomei", "Fuu", 7),
    HACHIBI("Gyuki", "Killer Bee", 8),
    KURAMA("Kurama", "Naruto Uzumaki", 9);

    String nomeBiju;
    String jinchuriki;
    int numeroDeCaldas;

    Biju(String nomeBiju, String jinchuriki, int numeroDeCaldas) {
        this.nomeBiju = nomeBiju;
        this.jinchuriki = jinchuriki;
        this.numeroDeCaldas = numeroDeCaldas;
    }

    Biju() {
    }
}
