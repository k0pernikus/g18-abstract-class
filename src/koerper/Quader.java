package koerper;

public class Quader extends Form {
    private int a;
    private int b;
    private int c;

    Quader(int a, int b, int c) {
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
    public int berechneGrundflaeche() {
        return getA() * getB();
    }

    @Override
    public int berechneOberflaeche() {
        return 2 * (getA()*getB() + getA()*getC() + getB()*getC());
    }

    @Override
    public int berechneUmfangGrundflaeche() {
        return 2 * getA() + 2 * getB();
    }

    @Override
    public int berechneVolumen() {
        return getA() * getB() * getC();
    }

    // Specific Setters Getters

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
}
