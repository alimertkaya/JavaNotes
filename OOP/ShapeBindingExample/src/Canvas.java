public class Canvas {
    public static void drawShape(Shape s) {
        if (s != null)
            s.draw();
    }

    public static void eraseShape(Shape s) {
        if (s != null)
            s.erase();
    }
}
