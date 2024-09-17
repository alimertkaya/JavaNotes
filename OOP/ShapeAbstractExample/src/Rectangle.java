public class Rectangle extends Shape {
    private double edge1;
    private double edge2;
    public Rectangle() {
        System.out.println("Rectangle created");
    }
    public Rectangle(double edge1, double edge2) {
        this.edge1 = edge1;
        this.edge2 = edge2;
    }

    @Override
    public void draw() {
        System.out.println("Rectangle drawn");
    }

    @Override
    public void erase() {
        System.out.println("Rectangle erased");
    }

    @Override
    public double calculateArea() {
        System.out.println("Rectangle area");
        return edge1 * edge2;
    }

    @Override
    public double calculateCircumference() {
        System.out.println("Rectangle circumference");
        return 2 * (edge1 + edge2);
    }
}
