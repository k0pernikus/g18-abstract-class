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
    public void displayData(){
        this.getFormBezeichnung();
        this.getGrundflaeche();
        this.getOberflaeche();
        this.getUmfangGrundflaeche();
        this.getVolumen();
    }

    protected void calculateAllProperties() {
        this.setFormBeschreibung();
        this.berechneVolumen();
        this.berechneGrundflaeche();
        this.berechneUmfangGrundflaeche();
        this.berechneVolumen();
    }

    public void setFormBezeichung(String formBezeichung) {
        this.formBezeichung = setFormBeschreibung();
    }

    public void getFormBezeichnung(){
        return this.formBezeichung;;
    }

    public int getGrundflaeche() {
        return grundflaeche;
    }

    public void setGrundflaeche(int grundflaeche) {
        this.grundflaeche = berechneGrundflaeche();
    }

    public int getOberflaeche() {
        return oberflaeche;
    }

    public void setOberflaeche(int oberflaeche) {
        this.oberflaeche = berechneOberflaeche();
    }

    public int getUmfangGrundflaeche() {
        return umfangGrundflaeche;
    }

    public void setUmfangGrundflaeche(int umfangGrundflaeche) {
        this.umfangGrundflaeche = umfangGrundflaeche;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen() {
        this.volumen = berechneVolumen();
    }
}