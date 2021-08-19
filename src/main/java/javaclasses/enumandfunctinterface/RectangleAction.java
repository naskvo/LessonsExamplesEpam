package javaclasses.enumandfunctinterface;

public class RectangleAction {
    public Double action(RectangleParam param, Double a, Double b) {
        return param.get().apply(a,b);
    }
}
