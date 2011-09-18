package koerper;

public class Main {
    public static void main(String[] args) {
        Form q = new Quader(12, 7, 18);
        Form w = new Wuerfel(4);
        Form k = new KreisZylinder(5, 50);
        Form d = new GleichmaessigesDreieckZylinder(5, 5);

        q.displayData();
        w.displayData();
        d.displayData();
        k.displayData();
    }
}
