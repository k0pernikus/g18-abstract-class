package koerper;

abstract class Form {
    //every zylinder needs height
    private double hoehe;

    public double getHoehe() {
        return hoehe;
    }

    public void setHoehe(double hoehe) {
        if (hoehe <= 0) {
            throw new IllegalArgumentException("The number must be greater than 0.");
        }

        this.hoehe = hoehe;
    }

    // abstract calc methods
    abstract protected String getFormBezeichnung();
    abstract protected double getGrundflaeche();
    abstract protected double getOberflaeche();
    abstract protected double getUmfangGrundflaeche();

    // always the same no matter what form
    protected double getVolumen() {
        return getGrundflaeche() * getHoehe();
    }

    // Output all Data:
    public void displayData() {
        System.out.println("Bezeichnung: " + getFormBezeichnung());
        System.out.println("Grundflaeche: " + getGrundflaeche());
        System.out.println("Oberflaeche: " + getOberflaeche());
        System.out.println("UmfangGrundflaeche: " + getUmfangGrundflaeche());
        System.out.println("Volumen: " + getVolumen());
        System.out.println("=====================");
        System.out.println();
    }
}
