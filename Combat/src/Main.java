public class Main {
    public static void main(String[] args) {
//apresente o lutador informando: nome, nacionalidade, idade, altura, peso, vitorias, derrotas e empates
      Lutador l[] = new Lutador[7];

        l[0] = new Lutador("Oséias Barreto", "Brasil", 24, 1.76f, 61.0f, 7,5,2 );
        l[1] = new Lutador("Kaori Kashimoto", "Japão", 22, 167f, 60.0f, 5,6,4 );
        l[2] = new Lutador("Gonçalo Espinhola","Portugal",22, 172f,62.0f,1,9,5 );
        l[3] = new Lutador("André Lopéz", "Argentina",27, 165f, 69.0f, 3,7,4);
        l[4] = new Lutador("Ömer Asaf","Turquia", 54,1.77f,71.0f,10,0,0);
        l[5] = new Lutador("Maguila", "Brasil", 65, 1.50f, 66.0f, 4,10,2);
        l[6] = new Lutador("Soo-Jin","Coreia", 18,159f,62.0f,7,4,1);




        Luta CBT = new Luta();
        CBT.marcarLuta(l[0],l[6]);
        CBT.lutar();




    }
}
