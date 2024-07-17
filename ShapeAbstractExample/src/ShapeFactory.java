public class ShapeFactory {
    public Shape createShape() {
        Shape s = null;

        int i = (int) (3 * Math.random());

        switch (i) {
            case 0:
                s = new Circle(5);
                break;
            case 1:
                s = new Rectangle(4,5);
                break;
            case 2:
                s = new Square(6);
                break;
        }

        return s;
    }
}
