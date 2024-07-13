public class Square extends Shape {
    private double edge;
    public Square() {
        super();
        System.out.println("Square created");
    }

    public Square(double edge) {
        super();
        this.edge = edge;
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("Square drawn");
    }

    @Override
    public void erase() {
        super.erase();
        System.out.println("Square erased");
    }

    @Override
    public double calculateArea() {
        System.out.println("Square area");
        return edge * edge;
    }

    @Override
    public double calculateCircumference() {
        System.out.println("Circle circumference");
        return 4 * edge;
    }

}
