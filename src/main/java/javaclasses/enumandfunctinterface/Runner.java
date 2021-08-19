package javaclasses.enumandfunctinterface;

public class Runner {
    public static void main(String[] args) {
        RectangleParam rectangleParam = RectangleParam.PERIMETER;
        //System.out.println(rectangleParam.service(2,3));
        RectangleAction rectangleAction = new RectangleAction();
        double result = rectangleAction.action(RectangleParam.PERIMETER, 1.0, 7.0);
        System.out.println(result);
    }
}
