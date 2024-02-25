public class Point {
    double x;
    double y;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double distance(Point point) {
        double dx = this.x - point.x;
        double dy = this.y - point.y;

        return Math.sqrt((dx * dx) + (dy * dy));
    }

    public double distanceToOrigin() {

        return Math.sqrt((x * x) + (y * y));
    }

    @Override
    public Point clone() {
        Point point = new Point();
        point.x = this.x;
        point.y = this.y;

        return point;
    }

    public double move(Double coordinate) {
        double result = coordinate + 1.0;
        return result;
    }
}
