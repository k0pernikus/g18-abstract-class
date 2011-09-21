package koerper;
public class Main {
    public static void main(String[] args) {
        Cuboid cub = new Cuboid(12, 7, 18);
        Cube d = new Cube(4);
        Circle c = new Circle(2, 2);
        EquilateralTriangle et = new EquilateralTriangle(5, 5);

        d.displayData();
        et.displayData();
        c.displayData();
        cub.displayData();
    }
}