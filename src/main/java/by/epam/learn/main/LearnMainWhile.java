package by.epam.learn.main;

public class LearnMainWhile {
    public static void main(String[] args) {
        int value = 42;
        while (value < 50) {
            value++;
            if (value > 44 && value < 48)
                continue; //можно break, тогда выход из цикла
            System.out.println(value);
        }

        value = 42;
        do {
            value++;
            if (value > 44 && value < 48)
                continue; //можно break, тогда выход из цикла
            System.out.println(value);
        } while (value < 50);
    }
}
