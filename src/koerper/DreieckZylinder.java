package koerper;
public class DreieckZylinder extends Form {
    //Dreieckseiten
    private double a;
    private double b;
    private double c;
    //Zylinderhoehe
    private double h;

    public DreieckZylinder() {
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
        this.c = c;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }
}
