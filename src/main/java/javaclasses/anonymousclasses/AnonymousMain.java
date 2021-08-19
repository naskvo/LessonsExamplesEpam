package javaclasses.anonymousclasses;

public class AnonymousMain {
    public static void main(String[] args) {
        Service service = new Service() {
            @Override
            public void service1() {
                System.out.println("anon 1");
            }

            @Override
            public void service2() {
                System.out.println("anon 2");
            }
        };
        service.service1(); // будет вызваться последний, переопределенный, метод. Получается типа наследование
    }
}
