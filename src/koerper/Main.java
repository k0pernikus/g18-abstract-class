package koerper;
public class Main {
    public static void main(String[] args) {
        Cuboid cuboid = new Cuboid(12, 7, 18);
        Cube cube = new Cube(4);
        Circle cylinder = new Circle(2, 2);
        EquilateralTriangle eqTriangleCylinder = new EquilateralTriangle(5, 5);

        cube.displayData();
        eqTriangleCylinder.displayData();
        cylinder.displayData();
        cuboid.displayData();
    }
}