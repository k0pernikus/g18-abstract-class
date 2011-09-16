package koerper;
public class DreieckZylinder extends Form {
    //Dreieckseiten
    private int a;
    private int b;
    private int c;
    //Zylinderhoehe
    private int h;

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
        return "Dreieckszylinder";
    }

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

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }


}
