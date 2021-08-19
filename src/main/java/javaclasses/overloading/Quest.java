package javaclasses.overloading;

public class Quest {
    Quest(int i) {
        System.out.print("Constructor");
    }

    public static void main(String[] args) {
        Quest quest = new Quest(); //1
    }

    public Quest() {
        //2
    }

    static {
        new Quest(1);
    }
}