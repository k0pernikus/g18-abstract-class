package koerper;

public class Main {
    public static void main(String[] args) {
        Quader q = new Quader(3, 5, 6);
        Wuerfel w = new Wuerfel(4);
        KreisZylinder k = new KreisZylinder(5, 50);
        GleichmaessigesDreieckZylinder d = new GleichmaessigesDreieckZylinder(5, 5);

        q.displayData();
        w.displayData();
        k.displayData();
        d.displayData();

    }
}
