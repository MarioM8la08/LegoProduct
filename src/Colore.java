import java.util.Objects;

public class Colore {
    private float r;
    private float g;
    private float b;

    public Colore(float r, float g, float b) {
        this.r = r;
        this.g = g;
        this.b = b;
    }

    private static int validaRgb(int v, String nome) {
        return Math.max(0, Math.min(255, v));
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Colore colore = (Colore) o;
        return Float.compare(r, colore.r) == 0 && Float.compare(g, colore.g) == 0 && Float.compare(b, colore.b) == 0;
    }

    @Override
    public String toString() {
        return "Colore(" + r + "," + g + "," + b + ")";
    }
}
