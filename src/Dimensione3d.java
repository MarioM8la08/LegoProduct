public class Dimensione3d {
    private float x;
    private float y;
    private float z;

    public Dimensione3d(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public String toString() {
        return "Dim(" + x + "x" + y + "x" + z + " mm)";
    }
}
