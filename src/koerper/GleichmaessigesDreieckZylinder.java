package koerper;
public class GleichmaessigesDreieckZylinder extends Form {
    //Dreieckseiten
    private double a;
    //Zylinderhoehe
    private double h;

    public GleichmaessigesDreieckZylinder(double seiteA, double hoehe) {
        setA(seiteA);
        setH(h);
    }

    @Override
    protected double berechneGrundflaeche() {
        return 0;
    }

    @Override
    protected double berechneOberflaeche() {
        return 0;
    }

    @Override
    protected double berechneUmfangGrundflaeche() {
        return 0;
    }

    @Override
    protected double berechneVolumen() {
        return 0;
    }

    @Override
    protected String setzeFormBeschreibung() {
        return "Dreieckszylinder";
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        double aSquare = getA()*getA();
        double bSquare = getB()*getB();
        double cSquare = aSquare + bSquare;

        this.c = Math.sqrt(cSquare);
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }
}
