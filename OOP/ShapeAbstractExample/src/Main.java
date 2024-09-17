public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape s = shapeFactory.createShape();
        Canvas.drawShape(s);
        Canvas.eraseShape(s);
        System.out.println();

        System.out.println(s.calculateArea());
        System.out.println(s.calculateCircumference());
    }
}