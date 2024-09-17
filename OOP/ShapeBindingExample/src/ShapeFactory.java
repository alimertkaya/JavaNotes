public class ShapeFactory {
    public Shape createShape() {
        Shape s = null;

        int i = (int) (5 * Math.random());

        switch (i) {
            case 0:
                s = new Shape();
                break;
            case 1:
                s = new Circle(5);
                break;
            case 2:
                s = new Rectangle(4, 5);
                break;
            case 3:
                s = new Square(6);
                break;
        }
        return s;
    }
}
