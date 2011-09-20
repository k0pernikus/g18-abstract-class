package koerper;

public class EquilateralTriangle extends Cylinder {

    private double sideLength;

    public EquilateralTriangle(double sideLength, double cylinderHeight) {
        setSideLength(sideLength);
        setCylinderHeight(cylinderHeight);
    }

    @Override
    public String getCylinderDescription() {
        return "Dreieckszylinder";
    }

    @Override
    public double getBaseArea() {
        return (getSideLength() * getTriangleHeight()) / 2;
    }

    @Override
    public double getCylinderLateralSurface(){
        return 3 * (getSideLength() * getCylinderHeight());
    }

    @Override
    public double getCircumferenceBasicArea() {
        return 3 * getSideLength();
    }

    public double getSideLength() {
        return sideLength;
    }

    private void setSideLength(double sideLength) {
        validate(sideLength);

        this.sideLength = sideLength;
    }

    public double getTriangleHeight() {
        return getSideLength() * getSideLength() * 0.75;
    }
}