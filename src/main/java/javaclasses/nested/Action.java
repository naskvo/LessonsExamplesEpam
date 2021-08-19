package javaclasses.nested;

public interface Action {
    static void newService() {}
    default void newService2() {}
    public static class StaticService {
        static void service() {}
        void service2(){}
    }
}
