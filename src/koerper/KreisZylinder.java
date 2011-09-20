package koerper;
public class KreisZylinder extends Cylinder {
    private double radius;

    KreisZylinder(double radius, double hoehe){
        setRadius(radius);
        setCylinderHeight(hoehe);
    }

    @Override
    protected double getGrundflaeche() {
        return Math.PI *getRadius() * getRadius();
    }

    @Override
    protected double getOberflaeche() {
        return 2 * getGrundflaeche() + getMantelflaeche();
    }

    private double getMantelflaeche() {
        return getUmfangGrundflaeche() * getCylinderHeight();
    }

    @Override
    protected double getUmfangGrundflaeche() {
        return Math.PI * 2 * getRadius();
    }

    @Override
    protected String getFormDescription() {
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