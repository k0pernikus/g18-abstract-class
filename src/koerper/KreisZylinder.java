package koerper;
public class KreisZylinder extends Form {
    private double r;
    private double h;

    @Override
    protected int berechneGrundflaeche() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    protected int berechneOberflaeche() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    protected int berechneUmfangGrundflaeche() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    protected int berechneVolumen() {
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