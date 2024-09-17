public class Square extends Shape {
    private double edge;
    public Square() {
        System.out.println("Square created");
    }
    public Square(double edge) {
        this.edge = edge;
    }

    @Override
    public void draw() {
        System.out.println("Square drawn");
    }

    @Override
    public void erase() {
        System.out.println("Square erased");
    }

    @Override
    public double calculateArea() {
        System.out.println("Square area");
        return edge * edge;
    }

    @Override
    public double calculateCircumference() {
        System.out.println("Square circumference");
        return 4 * edge;
    }
}
