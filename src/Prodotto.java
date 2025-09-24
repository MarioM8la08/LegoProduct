import java.util.ArrayList;

public class Prodotto {
    private String nome;
    private String codiceID;
    private ArrayList<Mattoncino> mattoncini = new ArrayList<>();

    public Prodotto(String nome, String codiceID) {
        this.nome = nome;
        this.codiceID = codiceID;
    }

    public void addBricks(Mattoncino mattoncino) {
        mattoncini.add(mattoncino);
    }

    public int countBricks() {
        return mattoncini.size();
    }

    public float getPeso() {
        float pesoTotale = 0;
        for (Mattoncino mattoncino : mattoncini) {
            pesoTotale += mattoncino.getPeso();
        }
        return pesoTotale;
    }

    public ArrayList<Mattoncino> bricksByColor(Colore colore) {
        ArrayList<Mattoncino> bricksByColor = new ArrayList<>();
        for (Mattoncino mattoncino : mattoncini) {
            if (mattoncino.getColore().equals(colore)) {
                bricksByColor.add(mattoncino);
            }
        }
        return bricksByColor;
    }

    public int countBricksByCode(String codiceID) {
        int count = 0;
        for (Mattoncino mattoncino : mattoncini) {
            if (mattoncino.getCodiceID(codiceID).equals(codiceID)) {
                count++;
            }
        }
        return count;
    }

    public void printMattoncini() {
        System.out.print("[");
        for (Mattoncino mattoncino : mattoncini) {
            System.out.println(mattoncino + " ");
        }
        System.out.print("]");
    }
}
