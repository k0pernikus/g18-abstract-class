package koerper;

abstract class Cylinder {
    // property each cylinder has in common,
    // hence setter/getter is defined here as well
    private double cylinderHeight;

    // abstract calc methods
    abstract public String getCylinderDescription();
    abstract public double getBaseArea();
    abstract public double getCircumferenceBasicArea();
    abstract public double getCylinderLateralSurface();

    // these methods are not dependent on the form
    public double getCylinderVolume() {
        return getBaseArea() * getCylinderHeight();
    }

    public double getCylinderSurfaceArea() {
        return 2 * getBaseArea() + getCylinderLateralSurface();
    }


    // Output all Data:
    public void displayData() {
        System.out.println("Bezeichnung: " + getCylinderDescription());
        System.out.println("Grundflaeche: " + getBaseArea());
        System.out.println("Oberflaeche: " + getCylinderSurfaceArea());
        System.out.println("UmfangGrundflaeche: " + getCircumferenceBasicArea());
        System.out.println("Volumen: " + getCylinderVolume());
        System.out.println("=====================");
        System.out.println();
    }

    public double getCylinderHeight() {
        return cylinderHeight;
    }

    public void setCylinderHeight(double cylinderHeight) {
        validate(cylinderHeight);
        this.cylinderHeight = cylinderHeight;
    }

    // checks if number is negative or null
    protected void validate(double numberToValidate) throws IllegalArgumentException {
        if (numberToValidate <= 0) {
            throw new IllegalArgumentException("The number must be greater than 0.");
        }
    }
}