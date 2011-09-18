package koerper;

abstract class Form {
    // abstract calc methods
    abstract protected String getFormBezeichnung();
    abstract protected double getVolumen();
    abstract protected double getGrundflaeche();
    abstract protected double getOberflaeche();
    abstract protected double getUmfangGrundflaeche();

    // Output all Data:
    public void displayData() {
        System.out.println("Bezeichnung: " + this.getFormBezeichnung());
        System.out.println("Grundflaeche:" + this.getGrundflaeche());
        System.out.println("Oberflaeche:" + this.getOberflaeche());
        System.out.println("UmfangGrundflaeche:" + this.getUmfangGrundflaeche());
        System.out.println("Volumen:" + this.getVolumen());
        System.out.println("=====================");
    }
}