package koerper;

// My laziness knows no bounds!
import static java.lang.System.out;

abstract class Cylinder {
    // property each cylinder has in common,
    // hence setter/getter is defined here as well
    private double cylinderHeight;

    // abstract calc methods
    // each form needs them but calculation differs
    abstract public String getCylinderDescription();
    abstract public double getBaseArea();
    abstract public double getCircumferenceBasicArea();
    abstract public double getCylinderLateralSurface();


    /*
     *  these methods are not dependent on the form
     *  so they are included here
     *  note that the method they call are the concrete ones
     *  of their own class
     */
    
    public double getCylinderVolume() {
        return getBaseArea() * getCylinderHeight();
    }

    public double getCylinderSurfaceArea() {
        return 2 * getBaseArea() + getCylinderLateralSurface();
    }
    
    /*
     * Outout all Data on Console
     */
    public void displayData() {
        out.println("Bezeichnung: " + getCylinderDescription());
        out.println("Grundflaeche: " + getBaseArea());
        out.println("Oberflaeche: " + getCylinderSurfaceArea());
        out.println("UmfangGrundflaeche: " + getCircumferenceBasicArea());
        out.println("Volumen: " + getCylinderVolume());
        out.println("=====================");
        out.println();
    }

    /*
     * Getter, setter and input validation
     */

    public double getCylinderHeight() {
        return cylinderHeight;
    }

    public void setCylinderHeight(double cylinderHeight) {
        validate(cylinderHeight);
        this.cylinderHeight = cylinderHeight;
    }

    protected void validate(double numberToValidate) throws IllegalArgumentException {
        if (numberToValidate <= 0) {
            throw new IllegalArgumentException("The number must be greater than 0.");
        }
    }
}