package by.epam.learn.main;

public class LearnMainIfUn {
    public static void main(String[] args) {
        int value = 1;
        boolean flag = value <= 0;
        value = value <= 0 ? value++ : value--;
    }
}
