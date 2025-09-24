public class Main {

    public static void main(String[] args) {
        Prodotto prodotto = new Prodotto("Ferrari Lego", "A123");

        Colore rosso = new Colore(155, 0, 0);
        Colore blu = new Colore(0, 0, 255);
        Colore verde = new Colore(0, 255, 0);
        Dimensione3d dimensione = new Dimensione3d(2, 4, 6);

        Mattoncino halo = new Mattoncino("JK223", 20, rosso, dimensione);
        Mattoncino casco = new Mattoncino("JK224", 20, blu, dimensione);
        Mattoncino spoiler = new Mattoncino("JK225", 20, verde, dimensione);

        prodotto.addBricks(halo);
        prodotto.addBricks(casco);
        prodotto.addBricks(spoiler);

        System.out.println("Totale mattoncini: " + prodotto.countBricks());
        System.out.println("Peso totale: " + prodotto.getPeso() + "g");
        System.out.println("Mattoncini rossi: " + prodotto.bricksByColor(rosso).size());
        System.out.println("Mattoncini blu: " + prodotto.bricksByColor(blu).size());
        System.out.println("Mattoncini verdi: " + prodotto.bricksByColor(verde).size());
        System.out.println("Mattoncini con codice JK223: " + prodotto.countBricksByCode("JK223"));

        Mattoncino tutaRossa = new Mattoncino("JK226", 20, rosso, dimensione);
        prodotto.addBricks(tutaRossa);

        System.out.println("\nDopo aggiunta di un pezzo rosso:");
        System.out.println("Totale mattoncini: " + prodotto.countBricks());
        System.out.println("Peso totale: " + prodotto.getPeso() + "g");
        System.out.println("Mattoncini rossi: " + prodotto.bricksByColor(rosso).size());

        Mattoncino haloBlu = new Mattoncino("JK223", 10, blu, dimensione);
        prodotto.addBricks(haloBlu);

        System.out.println("\nDopo aggiunta di un pezzo con stesso codice (colore diverso):");
        System.out.println("Mattoncini con codice JK223: " + prodotto.countBricksByCode("JK223"));
        System.out.println("Mattoncini blu: " + prodotto.bricksByColor(blu).size());

        System.out.println("\nElenco mattoncini:");
        prodotto.printMattoncini();
    }
}