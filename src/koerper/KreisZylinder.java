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
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    protected double berechneUmfangGrundflaeche() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    protected double berechneVolumen() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    protected String setzeFormBeschreibung() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public double getR() {
        return r;
    }

    public void setR(double d) {
        this.r = d;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }
}