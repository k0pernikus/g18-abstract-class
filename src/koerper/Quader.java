package koerper;
public class Quader extends Form {
    private double seiteA;
    private double seiteB;

    Quader(double seiteA, double seiteB, double hoehe) {
        setSeiteA(seiteA);
        getSeiteB(seiteB);
        setCylinderHeight(hoehe);
    }

    @Override
    public String getFormDescription() {
        return "Quader";
    }

    @Override
    public double getGrundflaeche() {
        return getA() * getSeiteB();
    }

    @Override
    public double getOberflaeche() {
        return 2 * (getGrundflaeche() + getA()*getCylinderHeight() + getSeiteB()*getCylinderHeight());
    }

    @Override
    public double getUmfangGrundflaeche() {
        return 2 * getA() + 2 * getSeiteB();
    }

    @Override
    public double getVolume() {
        return getGrundflaeche() * getCylinderHeight();
    }

    // Specific Setters Getters

    public double getA() {
        return seiteA;
    }

    private void setSeiteA(double a) {
        this.seiteA = a;
    }

    public double getSeiteB() {
        return seiteB;
    }

    private void getSeiteB(double seiteB) {
        this.seiteB = seiteB;
    }
}