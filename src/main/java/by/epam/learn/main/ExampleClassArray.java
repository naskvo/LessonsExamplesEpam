package by.epam.learn.main;

public class ExampleClassArray {
    static int[] arr;
    static {
        int val = arr[0];
    }
    public ExampleClassArray(int[] arrMain) {
        this.arr = arrMain;
    }
    public static void main(String[] args) {
        int[] arrMain = {2, 5, 7, 8, 3, 0};
        new ExampleClassArray(arrMain);
    }
}
