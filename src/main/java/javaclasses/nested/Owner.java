package javaclasses.nested;

import java.util.Comparator;

public class Owner {
    private int value = 1;
    //static int statValue = 2;
    public static class ValueComparator implements Comparator <Owner> {

        @Override
        public int compare(Owner o1, Owner o2) {
            return o1.value - o2.value;
        }
    }

/*    static class Nested {
        static int param = statValue;
        //param = value; // не работает, т.к. не статическое
    }*/
}
