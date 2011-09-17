package koerper;
public class KreisZylinder extends Form {
    private double r;
    private double h;

    KreisZylinder(double r, double h){
        setR(r);
        setH(h);
        calculateAllProperties();
    }

    @Override
    protected double berechneGrundflaeche() {
        return Math.PI*getR()*getR();
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
        return "Kreiszylinder";
    }

    public double getR() {
        return r;
    }

    private void setR(double d) {
        this.r = d;
    }

    public double getH() {
        return h;
    }

    private void setH(double h) {
        this.h = h;
    }
}