package koerper;

abstract class Form {
    //every zylinder needs height
    private double cylinderHeight;

    public double getCylinderHeight() {
        return cylinderHeight;
    }

    public void setCylinderHeight(double cylinderHeight) {
        if (cylinderHeight <= 0) {
            throw new IllegalArgumentException("The number must be greater than 0.");
        }

        this.cylinderHeight = cylinderHeight;
    }

    // abstract calc methods
    abstract protected String getFormDescription();
    abstract protected double getGrundflaeche();
    abstract protected double getOberflaeche();
    abstract protected double getUmfangGrundflaeche();

    // always the same no matter what form
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