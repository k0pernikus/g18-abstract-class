package koerper;

public class GleichmaessigesDreieckZylinder extends Form {
    //Dreieckseiten
    private double seitenLaenge;
    private double dreiecksHoehe;
    //Zylinderhoehe
    private double hoehe;

    public GleichmaessigesDreieckZylinder(double seiteA, double hoehe) {
        setSeitenLaenge(seiteA);
        setDreiecksHoehe();

        setHoehe(hoehe);
    }

    @Override
    protected double getGrundflaeche() {
        return (5 * getSeitenLaenge() * getDreiecksHoehe()) / 2;
    }

    @Override
    protected double getOberflaeche() {
        double dreiecksSeiten = 2 * getGrundflaeche();
        double seitenflaechen = 2 * (getSeitenLaenge()*getHoehe());

        double oberflaeche = dreiecksSeiten + seitenflaechen;
        return oberflaeche;
    }


    @Override
    protected double getUmfangGrundflaeche() {
        return 3 * getSeitenLaenge();
    }

    @Override
    protected double getVolumen() {
        return getGrundflaeche() * getHoehe();
    }

    @Override
    protected String getFormBezeichnung() {
        return "Dreieckszylinder";
    }

    public double getSeitenLaenge() {
        return seitenLaenge;
    }

    private void setSeitenLaenge(double seitenLaenge) {
        this.seitenLaenge = seitenLaenge;
    }

    public double getHoehe() {
        return hoehe;
    }

    private void setHoehe(double hoehe) {
        this.hoehe = hoehe;
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
        this.dreiecksHoehe = getSeitenLaenge() * getSeitenLaenge() * 0.75;
    }
}