package collectionframework;

import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<Integer> list = new Vector<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println(list);
        System.out.println(list.capacity());
        System.out.println(list.contains(40)); //for searching
        System.out.println(list.firstElement());
        System.out.println(list.get(2));
        System.out.println(list.lastElement());
        System.out.println(list.isEmpty());
        System.out.println(list.subList(1, 4));
        System.out.println();


        Iterator<Integer> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        System.out.println("\n");

        Iterator<Integer> itr1 = list.listIterator();
        while (itr1.hasNext()) {
            System.out.println(itr1.next());
        }
    }
}
