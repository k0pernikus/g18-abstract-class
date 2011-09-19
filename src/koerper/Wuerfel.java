package koerper;

public class Wuerfel extends Quader {
    Wuerfel(double seitenLaenge){
        super(seitenLaenge, seitenLaenge, seitenLaenge);
    }

    @Override
    public String getFormDescription() {
        return "Würfel";
    }
}