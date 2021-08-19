package by.epam.learn.main;

public class LearnMainByZero {
    public static void main(String[] args) {
        // int a = 1 / 0; // ошибка
        double b = 0;
        double c = 1 / b;
        c = 1 / 0.;
        System.out.println(c);
        double x = Math.sqrt(-1);
        System.out.println(x);
    }
}
