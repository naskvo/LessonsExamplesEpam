package collections.aboutcollections;

import java.util.ArrayList;
import java.util.List;

public class ListMain {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(5);
        list.add(7);
        list.add(42);
        list.add(null);
        list.add(42);
        list.add(77);
        list.add(5,87);
        System.out.println(list);
        //int value = list.get(3);
        Integer value = list.get(3);
        System.out.println(value);
        int index = list.indexOf(7);
        System.out.println(index);
        list.remove(new Integer(42));
        System.out.println(list);
        System.out.println(list.subList(1,3)); //не включая третий
        ArrayList<String> a = new ArrayList<>();
        List<String> b = new ArrayList<String>();
        a.add("0");
        List<String> c = new ArrayList<>(10);
        a.add("0");
        System.out.println(a);

        List<String> list1 = new ArrayList<>();
        list1.add(null);
        list1.add(new String("string"));
        list1.add(null);
        list1.remove(null);
        System.out.print(list1);
    }
}
