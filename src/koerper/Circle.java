package koerper;
public class Circle extends Cylinder {
    private double radius;

    Circle(double radius, double hoehe){
        setRadius(radius);
        setCylinderHeight(hoehe);
    }

    @Override
    public double getBaseArea() {
        return Math.PI *getRadius() * getRadius();
    }

   @Override
    public double getCylinderLateralSurface() {
        return getCircumferenceBasicArea() * getCylinderHeight();
    }

    @Override
    public  double getCircumferenceBasicArea() {
        return Math.PI * 2 * getRadius();
    }

    @Override
    public String getCylinderDescription() {
        return "Kreiszylinder";
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        validate(radius);

        this.radius = radius;
    }
}