package koerper;

abstract class Form {
    Form() {
        calculateAllProperties();
    }

    // properties
    protected String formBezeichung;
    protected double volumen;
    protected double oberflaeche;
    protected double grundflaeche;
    protected double umfangGrundflaeche;

    // abstract calc methods
    abstract protected String setzeFormBeschreibung();
    abstract protected double berechneVolumen();
    abstract protected double berechneGrundflaeche();
    abstract protected double berechneOberflaeche();
    abstract protected double berechneUmfangGrundflaeche();

    // Output all Data:
    public void displayData() {
        System.out.println("Bezeichnung: " + this.getFormBezeichnung());
        System.out.println("Grundflaeche:" + this.getGrundflaeche());
        System.out.println("Oberflaeche:" + this.getOberflaeche());
        System.out.println("UmfangGrundflaeche:" + this.getUmfangGrundflaeche());
        System.out.println("Volumen:" + this.getVolumen());
        System.out.println("=====================");
    }

    public void calculateAllProperties() {
        setFormBezeichung();
        setVolumen();
        setGrundflaeche();
        setOberflaeche();
        setUmfangGrundflaeche();
        setVolumen();
    }

    public String getFormBezeichnung() {
        return formBezeichung;
    }

    public void setFormBezeichung() {
        this.formBezeichung = setzeFormBeschreibung();
    }

    public double getGrundflaeche() {
        return grundflaeche;
    }

    public void setGrundflaeche() {
        this.grundflaeche = berechneGrundflaeche();
    }

    public double getOberflaeche() {
        return oberflaeche;
    }

    public void setOberflaeche() {
        this.oberflaeche = berechneOberflaeche();
    }

    public double getUmfangGrundflaeche() {
        return umfangGrundflaeche;
    }

    public void setUmfangGrundflaeche() {
        this.umfangGrundflaeche = berechneGrundflaeche();
    }

    public double getVolumen() {
        return volumen;
    }

    public void setVolumen() {
        this.volumen = berechneVolumen();
    }
}