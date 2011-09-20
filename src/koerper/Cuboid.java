package koerper;
public class Cuboid extends Cylinder {
    private double sideLengthA;
    private double sideLengthB;

    Cuboid(double sideLengthA, double sideLengthB, double cylinderHeight) {
        setSideLengthA(sideLengthA);
        setSideLengthB(sideLengthB);
        setCylinderHeight(cylinderHeight);
    }

    @Override
    public String getCylinderDescription() {
        return "Quader";
    }

    @Override
    public double getBaseArea() {
        return getSideLengthA() * getSideLengthB();
    }

    @Override
    public double getCylinderLateralSurface() {
        double rectangles1 = 2 * getSideLengthA() * getCylinderHeight();
        double rectangles2 = 2 * getSideLengthB() * getCylinderHeight();

        return rectangles1 + rectangles2;
    }

    @Override
    public double getCircumferenceBasicArea() {
        return 2 * getSideLengthA() + 2 * getSideLengthB();
    }

    @Override
    public double getCylinderVolume() {
        return getBaseArea() * getCylinderHeight();
    }

    public double getSideLengthA() {
        return sideLengthA;
    }

    public double getSideLengthB() {
        return sideLengthB;
    }

    private void setSideLengthA(double sideLengthA) {
        validate(sideLengthA);
        this.sideLengthA = sideLengthA;
    }

    private void setSideLengthB(double sideLengthB) {
        validate(sideLengthB);
        this.sideLengthB = sideLengthB;
    }
}