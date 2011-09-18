package koerper;
public class KreisZylinder extends Form {
    private double radius;

    KreisZylinder(double radius, double hoehe){
        setRadius(radius);
        setHoehe(hoehe);
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
        return getUmfangGrundflaeche() * getHoehe();
    }

    @Override
    protected double getUmfangGrundflaeche() {
        return Math.PI * 2 * getRadius();
    }

    @Override
    protected String getFormBezeichnung() {
        return "Kreiszylinder";
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius <= 0 ) {
            throw new IllegalArgumentException("The number must be greater than 0.");
        }
        
        this.radius = radius;
    }
}