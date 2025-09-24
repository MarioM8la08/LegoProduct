public class Mattoncino {
    private String codiceID;
    private float peso;
    private Colore colore;
    private Dimensione3d dimensione;

    public Mattoncino(String codiceID, float peso, Colore colore, Dimensione3d dimensione) {
        this.codiceID = codiceID;
        this.peso = peso;
        this.colore = colore;
        this.dimensione = dimensione;
    }

    public Colore getColore() {
        return this.colore;
    }

    public String getCodiceID(String codiceID) {
        return this.codiceID;
    }

    public float getPeso() {
        return this.peso;
    }

    @Override
    public String toString() {
        return "Mattoncino{id=" + codiceID + ", peso=" + peso + "g, " + colore + ", " + dimensione + "}";
    }
}
