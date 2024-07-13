public class Main {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();
        Shape s = factory.createShape();
        Canvas.drawShape(s);
        Canvas.eraseShape(s);
        System.out.println();
        if (s != null) {
            System.out.println(s.calculateArea());
            System.out.println(s.calculateCircumference());
        }
    }
}