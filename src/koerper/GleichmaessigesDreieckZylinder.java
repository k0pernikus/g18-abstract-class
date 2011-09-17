package koerper;

public class GleichmaessigesDreieckZylinder extends Form {
    //Dreieckseiten

    private double a;
    private double dreiecksHoehe;
    //Zylinderhoehe
    private double h;

    public GleichmaessigesDreieckZylinder(double seiteA, double hoehe) {
        setA(seiteA);
        setDreiecksHoehe();

        setH(h);
        calculateAllProperties();
    }

    @Override
    protected double berechneGrundflaeche() {
        return (5 * getA() * getDreiecksHoehe()) / 2;
    }

    @Override
    protected double berechneOberflaeche() {
        // Dreieckseiten
        2 * getGrundflaeche();
        
        // drei rechtecke seiten a * h

        seiten = 3 * (getA()*getH())

        return 0;
    }

    @Override
    protected double berechneUmfangGrundflaeche() {
        return 3 * getA();
    }

    @Override
    protected double berechneVolumen() {
        return berechneGrundflaeche() * getH();
    }

    @Override
    protected String setzeFormBeschreibung() {
        return "Dreieckszylinder";
    }

    public double getA() {
        return a;
    }

    private void setA(double a) {
        this.a = a;
    }

    public double getH() {
        return h;
    }

    private void setH(double h) {
        this.h = h;
    }

    /**
     * @return the dreiecksHoehe
     */
    private double getDreiecksHoehe() {
        return dreiecksHoehe;
    }

    /**
     * @param dreiecksHoehe the dreiecksHoehe to set
     */
    private void setDreiecksHoehe() {
        this.dreiecksHoehe = getA() * getA() * 0.75;
    }
}
