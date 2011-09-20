package koerper;

public class Dice extends Cuboid {
    Dice(double seitenLaenge){
        super(seitenLaenge, seitenLaenge, seitenLaenge);
    }

    @Override
    public String getCylinderDescription() {
        return "Würfel";
    }
}