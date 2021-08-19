package javaclasses.methods;

public class LearnMainVariableParam {
    public static void main(String[] args) {
        VariableParam param = new VariableParam();
        param.method(4,12,145);
        param.method();
        int [] arr = {1,23, 45};
        param.method(arr);
        param.method(1,42);
    }
}
