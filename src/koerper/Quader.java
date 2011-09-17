package koerper;

public class Quader extends Form {
    private double a;
    private double b;
    private double c;

    Quader(double a, double b, double c) {
        setA(a);
        setB(b);
        setC(c);

        calculateAllProperties();
    }

    @Override
    public String setzeFormBeschreibung() {
        return "Quader";
    }

    @Override
    public double berechneGrundflaeche() {
        return getA() * getB();
    }

    @Override
    public double berechneOberflaeche() {
        return 2 * (getA()*getB() + getA()*getC() + getB()*getC());
    }

    @Override
    public double berechneUmfangGrundflaeche() {
        return 2 * getA() + 2 * getB();
    }

    @Override
    public double berechneVolumen() {
        return getA() * getB() * getC();
    }

    // Specific Setters Getters

    public double getA() {
        return a;
    }

    private void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    private void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    private void setC(double c) {
        this.c = c;
    }
}
