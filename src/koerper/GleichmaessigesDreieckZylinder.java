package koerper;

public class GleichmaessigesDreieckZylinder extends Cylinder {

    private double sideLength;

    public GleichmaessigesDreieckZylinder(double sideLength, double cylinderHeight) {
        setSideLength(sideLength);
        setCylinderHeight(cylinderHeight);
    }

    @Override
    protected String getFormDescription() {
        return "Dreieckszylinder";
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

    public double getSideLength() {
        return sideLength;
    }

    private void setSideLength(double sideLength) {
        validate(sideLength);
        
        this.sideLength = sideLength;
    }

    private double getDreiecksHoehe() {
        return getSideLength() * getSideLength() * 0.75;
    }
}