package by.epam.learn.main;

import java.util.Arrays;

public class LearnMainArrayCopy {
    public static void main(String[] args) {
        int[] array = {21, 22, 23, 24};
        int[] hold = {49, 48, 47, 46, 45, 44, 43, 42};
        System.arraycopy(array, 1, hold, 2, array.length - 1);
        System.out.println(Arrays.toString(hold));
    }
}
