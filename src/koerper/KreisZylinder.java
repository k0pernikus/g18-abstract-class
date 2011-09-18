package koerper;
public class KreisZylinder extends Form {
    private double r;
    private double h;

    KreisZylinder(double r, double h){
        setR(r);
        setH(h);
    }

    @Override
    protected double getGrundflaeche() {
        return Math.PI*getR()*getR();
    }

    @Override
    protected double getOberflaeche() {
        return 0;
    }

    @Override
    protected double getUmfangGrundflaeche() {
        return 0;
    }

    @Override
    protected double getVolumen() {
        return 0;
    }

    @Override
    protected String getFormBezeichnung() {
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