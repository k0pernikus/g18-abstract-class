package koerper;

public class Main {
    public static void main(String[] args) {
        Cylinder q = new Cuboid(12, 7, 18);
        Cylinder w = new Dice(4);
        Cylinder k = new Circle(15, 7);
        Cylinder d = new EquilateralTriangle(5, 5);

        q.displayData();
        w.displayData();
        d.displayData();
        k.displayData();

        //Cylinder dInvalid = new EquilateralTriangle(5, -3);

    }
}