package javaclasses.anonymousbasedinterface;

import org.w3c.dom.ls.LSOutput;

public class AnonymousMain2 {
    public static void main(String[] args) {
        Action action = new Action() {
            @Override
            public void logic1() {
                System.out.println("interface");
            }

            public void some() {
            }
        };
        action.logic1();
        // action.some(); // не видит его
        Action action1 = () -> System.out.println("interface"); // все лямбда-выражения компилятором преобразуются в анонимные классы
        action1.logic1();
    }
}
