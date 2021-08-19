package javaclasses.localinnerclasses;

public class Owner {
    private int value = 1;
    void action() {
        int a = 2;
        class InnerAction{
            int inner = value;
            int innerA = a;
        }
        new InnerAction();
    }

    static void staticAction() {
        int b = 3;
        class StaticInnerAction {
            //int inner = value; // не сработает, т.к. нет объекта
            int innerB = b;
        }
    }
}
