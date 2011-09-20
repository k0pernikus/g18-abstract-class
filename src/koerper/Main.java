package koerper;
public class Main {
    public static void main(String[] args) {
        Cuboid cub = new Cuboid(12, 7, 18);
        Dice d = new Dice(4);
        Circle c = new Circle(15, 7);
        EquilateralTriangle et = new EquilateralTriangle(5, 5);

        d.displayData();
        et.displayData();
        c.displayData();
        cub.displayData();
    }
}