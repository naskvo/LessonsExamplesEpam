package by.epam.learn.main;

public class ArrayAction {

    public void changeArray(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            array[i] += value;
        }
    }
    public static void main(String[] args) {
        ArrayAction action = new ArrayAction();
        int [] a = {3, 4, 42};
        action.changeArray(a, 7);
        for (int element: a) {
            element+=1; //с помощью foreach базовые типы изменить невозможно, а изменяемые можно
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
