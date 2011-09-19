package koerper;

public class GleichmaessigesDreieckZylinder extends Form {
    private double sideLength;

    public GleichmaessigesDreieckZylinder(double sideLength, double cylinderHeight) {
        setSeitenLaenge(sideLength);
        setCylinderHeight(cylinderHeight);
    }

    @Override
    protected double getGrundflaeche() {
        return (getSideLength() * getDreiecksHoehe()) / 2;
    }

    @Override
    protected double getOberflaeche() {
        double dreiecksSeiten = 2 * getGrundflaeche();
        double seitenflaechen = 2 * (getSideLength() * getCylinderHeight());

        double oberflaeche = dreiecksSeiten + seitenflaechen;
        return oberflaeche;
    }

    @Override
    protected double getUmfangGrundflaeche() {
        return 3 * getSideLength();
    }

    @Override
    protected double getVolume() {
        return getGrundflaeche() * getCylinderHeight();
    }

    @Override
    protected String getFormDescription() {
        return "Dreieckszylinder";
    }

    public double getSideLength() {
        return sideLength;
    }

    private void setSeitenLaenge(double seitenLaenge) {
        this.sideLength = seitenLaenge;
    }

    private double getDreiecksHoehe() {
        return getSideLength() * getSideLength() * 0.75;
    }
}
