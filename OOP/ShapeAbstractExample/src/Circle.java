public class Circle extends Shape {
    private double r;
    public Circle(){
        System.out.println("Circle created");
    }
    public Circle(double r) {
        this.r = r;
    }
    @Override
    public void draw() {
        System.out.println("Circle drawn");
    }

    @Override
    public void erase() {
        System.out.println("Circle erased");
    }

    @Override
    public double calculateArea() {
        System.out.println("Circle area");
        return Math.PI * (r * r);
    }

    @Override
    public double calculateCircumference() {
        System.out.println("Circle Circumference");
        return 2 * Math.PI * r;
    }
}
