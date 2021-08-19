package by.epam.learn.main;

import java.sql.SQLOutput;

public class LearnMainFor {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.print(i + " ");
        }

        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break; // лучше не использовать в for
            }
            System.out.print(i + " ");
        }

        for (int i = 0, j = 0; i < 10 && j > -10; i++, j--) {
            System.out.println(i + " " + j);
        }
    }
}
