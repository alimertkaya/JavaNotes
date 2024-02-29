public class Main {

    public static void main(String[] args) {

        Circle circle1 = new Circle(5);
        System.out.println("Circle1's area: " + circle1.calculateArea());
        System.out.println("Circle1's perimeter: " + circle1.calculatePerimeter());

        Circle circle2 = new Circle();
        System.out.println("Circle2's area: " + circle2.calculateArea());
        System.out.println("Circle2's perimeter: " + circle2.calculatePerimeter());
    }
}
