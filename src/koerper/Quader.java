package koerper;
public class Quader extends Cylinder {
    private double sideLengthA;
    private double sideLengthB;

    Quader(double sideLengthA, double sideLengthB, double cylinderHeight) {
        setSideLengthA(sideLengthA);
        setSideLengthB(sideLengthB);
        setCylinderHeight(cylinderHeight);
    }

    @Override
    public String getFormDescription() {
        return "Quader";
    }

    @Override
    public double getGrundflaeche() {
        return getSideLengthA() * getSideLengthB();
    }

    @Override
    public double getOberflaeche() {
        return 2 * (getGrundflaeche() + getSideLengthA() * getCylinderHeight() + getSideLengthB() * getCylinderHeight());
    }

    @Override
    public double getUmfangGrundflaeche() {
        return 2 * getSideLengthA() + 2 * getSideLengthB();
    }

    @Override
    public double getVolume() {
        return getGrundflaeche() * getCylinderHeight();
    }

    // Specific Setters
    public double getSideLengthA() {
        return sideLengthA;
    }

    public double getSideLengthB() {
        return sideLengthB;
    }

    // Getters
    private void setSideLengthA(double sideLengthA) {
        validate(sideLengthA);
        this.sideLengthA = sideLengthA;
    }

    private void setSideLengthB(double sideLengthB) {
        validate(sideLengthB);
        this.sideLengthB = sideLengthB;
    }
}