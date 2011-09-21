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
        boolean isCube = getSideLengthA() == getSideLengthB() && getSideLengthB() ==  getCylinderHeight();

        if(isCube){
            
            return "Würfel";
        }

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

    public double getSideLengthA() {
        return sideLengthA;
    }

    public double getSideLengthB() {
        return sideLengthB;
    }

    public void setSideLengthA(double sideLengthA) {
        validate(sideLengthA);
        this.sideLengthA = sideLengthA;
    }

    public void setSideLengthB(double sideLengthB) {
        validate(sideLengthB);
        this.sideLengthB = sideLengthB;
    }

    public void setAllSideLengths(double sideLength) {
        setSideLengthA(sideLength);
        setSideLengthB(sideLength);
        setCylinderHeight(sideLength);
    }
}