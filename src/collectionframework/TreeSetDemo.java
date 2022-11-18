package collectionframework;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {

        TreeSet<Integer> treeSet = new TreeSet<>();

        treeSet.add(40);
        treeSet.add(60);
        treeSet.add(50);
        treeSet.add(30);

        System.out.println(treeSet);
        System.out.println(treeSet.add(70));
        System.out.println(treeSet.isEmpty());
        System.out.println(treeSet.descendingSet());
        System.out.println(treeSet.size());
        System.out.println(treeSet.contains(49));
        System.out.println(treeSet.ceiling(15));
        System.out.println(treeSet.floor(44));
        System.out.println(treeSet.first());
        System.out.println(treeSet.headSet(43, true));
        System.out.println(treeSet.headSet(78, false));
        System.out.println(treeSet.last());
        System.out.println(treeSet.lower(55));
        System.out.println(treeSet.tailSet(34));
        System.out.println(treeSet);
    }
}
