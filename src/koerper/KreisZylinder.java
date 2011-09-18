package koerper;
public class KreisZylinder extends Form {
    private double radius;
    private double hoehe;

    KreisZylinder(double r, double h){
        setRadius(r);
        setHoehe(h);
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
    protected double getVolumen() {
        return getGrundflaeche() * getHoehe();
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

    public double getHoehe() {
        return hoehe;
    }

    public void setHoehe(double hoehe) {
        if (hoehe <= 0 ) {
            throw new IllegalArgumentException("The number must be greater than 0.");
        }
        
        this.hoehe = hoehe;
    }
}