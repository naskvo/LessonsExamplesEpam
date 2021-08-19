package by.epam.learn.main;

public class LearnMainIf {
    public static void main(String[] args) {

    }
    public static double perimeter(double lengthA, double lengthB, String name) {
        if (name == null) {
            throw new IllegalArgumentException("not correct name");
        }
        double result;
        if (lengthA > 0 && lengthB > 0) {
            result = 2 * (lengthA + lengthB);
        } else {
            result = -1;
        }
        return result;
    }
}
