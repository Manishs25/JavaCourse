package collectionframework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

//set doesn't maintain insertion order
//set doesn't store duplicate values.
public class SetDemo {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();

        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(10);
        System.out.println(set);
        System.out.println(set.contains(10));


        Integer[] arr = set.toArray(new Integer[10]);

        //to maintain the insertion order

        Set<Integer> set1 = new LinkedHashSet<>();

        set1.add(10);
        set1.add(20);
        set1.add(30);
        set1.add(40);
        set1.add(50);

        System.out.println(set1);

    }
}
