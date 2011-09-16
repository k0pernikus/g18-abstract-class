package koerper;

abstract class Form {
    // properties
    protected String formBezeichung;
    protected int volumen;
    protected int oberflaeche;
    protected int grundflaeche;
    protected int umfangGrundflaeche;

    // abstract calc methods
    abstract protected String setzeFormBeschreibung();
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

    public void calculateAllProperties() {
        setFormBezeichung();
        setVolumen();
        setGrundflaeche();
        setUmfangGrundflaeche();
        setVolumen();
    }

    public String getFormBezeichnung() {
        return formBezeichung;
    }

    public void setFormBezeichung() {
        this.formBezeichung = setzeFormBeschreibung();
    }

    public int getGrundflaeche() {
        return grundflaeche;
    }

    public void setGrundflaeche() {
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

    public void setUmfangGrundflaeche() {
        this.umfangGrundflaeche = berechneGrundflaeche();
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen() {
        this.volumen = berechneVolumen();
    }
}