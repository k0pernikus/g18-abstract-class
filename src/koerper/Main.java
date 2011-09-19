package koerper;

public class Main {
    public static void main(String[] args) {
        Cylinder q = new Quader(12, 7, 18);
        Cylinder w = new Wuerfel(4);
        Cylinder k = new KreisZylinder(5, 50);
        Cylinder d = new GleichmaessigesDreieckZylinder(5, 5);

        q.displayData();
        w.displayData();
        d.displayData();
        k.displayData();
    }
}
