package collections.aboutcollections;

import java.util.*;

enum Counter{
    UNO, DOS, TRES, CUATRO, CINCO, SEIS, SIETE
};
public class SetMain {
    public static void main(String[] args) {
/*        Set<String> set = new HashSet<>();
        set.add("one");
        set.add("two");
        boolean value = set.add("ten");
        System.out.println(set + " " + value);
        value = set.add("ten");
        System.out.println(set + " " + value);
        set.add(new String("ten"));
        System.out.println(set);*/
        Set <String> set = new HashSet<String>() {
            {
                this.add("one");
                this.add("two");
                this.add("ten");
            }
        };

        Object ob = new HashSet();
        System.out.print((ob instanceof Set) + ", ");
        System.out.print(ob instanceof SortedSet);

        System.out.println(set);
        EnumSet<Counter> countSet1 = EnumSet.range(Counter.TRES, Counter.CINCO); // 1
        EnumSet<Counter> countSet2 = EnumSet.complementOf(countSet1 ); // 2
        System.out.println(countSet2 );

        Set<Object> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("1");
        linkedHashSet.add("2");
        linkedHashSet.add("3");
        linkedHashSet.add(linkedHashSet);
        System.out.println(linkedHashSet);            // 1
        //System.out.println(linkedHashSet.hashCode());    // 2
    }
}
