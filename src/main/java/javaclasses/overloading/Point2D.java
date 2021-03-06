package javaclasses.overloading;

public class Point2D extends Point1D {
    private int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public double length() {
        return Math.hypot(y, getX());
    }

    public void method () {
        System.out.println("without");}

    public void method (int i) {
        System.out.println("int" + i);}

    public static void method (String str) {
        System.out.println("String" + str);}
}
