package koerper;

abstract class Cylinder {
    //every zylinder needs height

    private double cylinderHeight;

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

    // abstract calc methods
    abstract protected String getFormDescription();
    abstract protected double getGrundflaeche();
    abstract protected double getUmfangGrundflaeche();
    abstract protected double getOberflaeche();

    // concrete voulme method since calculation is always the same
    protected double getVolume() {
        return getGrundflaeche() * getCylinderHeight();
    }

    // Output all Data:
    public void displayData() {
        System.out.println("Bezeichnung: " + getFormDescription());
        System.out.println("Grundflaeche: " + getGrundflaeche());
        System.out.println("Oberflaeche: " + getOberflaeche());
        System.out.println("UmfangGrundflaeche: " + getUmfangGrundflaeche());
        System.out.println("Volumen: " + getVolume());
        System.out.println("=====================");
        System.out.println();
    }
}