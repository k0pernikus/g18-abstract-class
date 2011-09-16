package koerper;

abstract class Form {
    // properties

    private String formBezeichung;
    private int volumen;
    private int oberflaeche;
    private int grundflaeche;
    private int umfangGrundflaeche;

    // abstract calc methods
    abstract protected String setFormBeschreibung();
    abstract protected int berechneVolumen();
    abstract protected int berechneGrundflaeche();
    abstract protected int berechneOberflaeche();
    abstract protected int berechneUmfangGrundflaeche();

    // Output all Data:
    public void displayData() {
        System.out.println("Bezeichnung: " + this.getFormBezeichnung());
        System.out.println("Grundflaeche:" + this.getGrundflaeche());
        System.out.println("Oberflaeche:" + this.getOberflaeche());
        System.out.println("UmfangGrundflaeche:" + this.getUmfangGrundflaeche());
        System.out.println("Volumen:" + this.getVolumen());
    }

    protected void calculateAllProperties() {
        setFormBeschreibung();
        berechneVolumen();
        berechneGrundflaeche();
        berechneUmfangGrundflaeche();
        berechneVolumen();
    }

    public void setFormBezeichung(String formBezeichung) {
        formBezeichung = setFormBeschreibung();
    }

    public String getFormBezeichnung() {
        return formBezeichung;
    }

    public int getGrundflaeche() {
        return grundflaeche;
    }

    public void setGrundflaeche(int grundflaeche) {
        grundflaeche = berechneGrundflaeche();
    }

    public int getOberflaeche() {
        return oberflaeche;
    }

    public void setOberflaeche(int oberflaeche) {
        oberflaeche = berechneOberflaeche();
    }

    public int getUmfangGrundflaeche() {
        return umfangGrundflaeche;
    }

    public void setUmfangGrundflaeche(int umfangGrundflaeche) {
        umfangGrundflaeche = umfangGrundflaeche;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen() {
        volumen = berechneVolumen();
    }
}