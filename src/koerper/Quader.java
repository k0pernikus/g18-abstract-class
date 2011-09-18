package koerper;
public class Quader extends Form {
    private double seiteA;
    private double seiteB;
    private double hoehe;

    Quader(double seiteA, double seiteB, double hoehe) {
        setSeiteA(seiteA);
        getSeiteB(seiteB);
        setHoehe(hoehe);
    }

    @Override
    public String getFormBezeichnung() {
        return "Quader";
    }

    @Override
    public double getGrundflaeche() {
        return getA() * getSeiteB();
    }

    @Override
    public double getOberflaeche() {
        return 2 * (getGrundflaeche() + getA()*getHoehe() + getSeiteB()*getHoehe());
    }

    @Override
    public double getUmfangGrundflaeche() {
        return 2 * getA() + 2 * getSeiteB();
    }

    @Override
    public double getVolumen() {
        return getGrundflaeche() * ge;
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

    public double getHoehe() {
        return hoehe;
    }

    private void setHoehe(double getHoehe) {
        this.hoehe = getHoehe;
    }
}