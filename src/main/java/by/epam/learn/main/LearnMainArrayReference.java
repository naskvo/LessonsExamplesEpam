package by.epam.learn.main;

public class LearnMainArrayReference {
    public static void main(String[] args) {
        int[] arr = {42, 1};
        Object object = arr;
        int x = ((int[])object)[0];

//        int [][] multi = {{42,4}, {5,6,8}};
//        object = multi;
//        object = multi[0];

        double[] dArray;// = {42.0, 7.1};
        // dArray = (double[])arr; //так не выйдет
        dArray = (double[]) object; // массив одного типа нельзя преобразовать к массиву другого типа, будет ошибка
    }
}
