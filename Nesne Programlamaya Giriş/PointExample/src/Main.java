public class Main {

    public static void main(String[] args) {

        Point point1  = new Point();
        point1.x = 3;
        point1.y = 4;
        double distanceToOrigin = point1.distanceToOrigin();
        System.out.println("Distance to origin: " + distanceToOrigin);

        Point point2 = new Point();
        point2.x = point1.move(point1.x);
        point2.y = point1.move(point1.y);
        double distance = point1.distance(point2);
        System.out.println("Distance: " + distance);

        Point point3 = point1.clone();
        System.out.println("Point3 coordinates: " + point3.x + " " + point3.y);
    }
}