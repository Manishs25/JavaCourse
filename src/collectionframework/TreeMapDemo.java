package collectionframework;

import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();

        treeMap.put(1, 10);
        treeMap.put(2, 30);
        treeMap.put(3, 40);
        treeMap.put(4, 20);

        System.out.println(treeMap.descendingMap());
        System.out.println(treeMap.keySet());
        System.out.println(treeMap.entrySet());
        System.out.println(treeMap.descendingKeySet());
        System.out.println(treeMap.firstEntry());
        System.out.println(treeMap.lastEntry());
        System.out.println(treeMap.navigableKeySet());
        System.out.println(treeMap.pollFirstEntry());
        System.out.println(treeMap.headMap(20));
        System.out.println(treeMap.tailMap(2, true));
        System.out.println(treeMap.subMap(3, true, 4, false));
        System.out.println(treeMap);
    }
}
