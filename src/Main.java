import com.sun.xml.internal.xsom.impl.scd.Iterators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        int[] array = {5, 1, 27};

        Iterator<Integer> iterator = new ForwardArrayIterator(array);

        while (iterator.hasNext()) {
            int number = iterator.next();
            System.out.println(number);
        }


        Iterator<Integer> increasingIterator = new IncreasingArrayIterator(array);


        while (increasingIterator.hasNext()) {
            int number = increasingIterator.next();
            System.out.println(number);// print elements by increasing order expected
        }


        System.out.println(Arrays.toString(array));

    }
}