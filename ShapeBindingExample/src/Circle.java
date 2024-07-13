public class Circle extends Shape {
    private double r;
    public Circle() {
        super();
        System.out.println("Circle created");
    }

    public Circle(double r) {
        super();
        this.r = r;
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("Circle drawn");
    }

    @Override
    public void erase() {
        super.erase();
        System.out.println("Circle erased");
    }

    @Override
    public double calculateArea() {
        System.out.println("Circle area");
        return Math.PI * (r * r);
    }

    @Override
    public double calculateCircumference() {
        System.out.println("Circle circumference");
        return 2 * Math.PI * r;
    }

}
