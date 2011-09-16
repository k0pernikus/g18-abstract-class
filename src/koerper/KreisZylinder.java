package koerper;
public class KreisZylinder extends Form {
    private double d;
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

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }
}
