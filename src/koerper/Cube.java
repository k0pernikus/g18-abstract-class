package koerper;

public class Cube extends Cuboid {
    Cube(double sideLength){
        super(sideLength, sideLength, sideLength);
    }

    @Override
    public String getCylinderDescription() {
        return "Würfel";
    }
}