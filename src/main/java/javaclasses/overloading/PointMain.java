package javaclasses.overloading;

public class PointMain {
    public static void main(String[] args) {
        Point2D point2 = new Point2D();
        point2.method(101.1);
        point2.method();
        point2.method(1);
        Point2D.method("Java");
    }
}
