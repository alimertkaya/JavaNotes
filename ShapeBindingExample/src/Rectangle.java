public class Rectangle extends Shape {
    private double edge1;
    private double edge2;

    public Rectangle() {
        super();
        System.out.println("Rectangle created");
    }

    public Rectangle(double edge1, double edge2) {
        super();
        this.edge1 = edge1;
        this.edge2 = edge2;
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("Rectangle drawn");
    }

    @Override
    public void erase() {
        super.erase();
        System.out.println("Rectangle erased");
    }

    @Override
    public double calculateArea() {
        System.out.println("Rectangle area");
        return edge1 * edge2;
    }

    @Override
    public double calculateCircumference() {
        System.out.println("Circle circumference");
        return 2 * (edge1 + edge2);
    }
}
