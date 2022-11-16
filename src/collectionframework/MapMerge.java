package collectionframework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapMerge {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();

        map.put(11, "Satara");
        map.put(14, "Pune");
        map.put(12, "Nashik");

        Map<Integer, String> map1 = new HashMap<>();

        map1.put(1, "max");
        map1.put(2, "ravi");
        map1.put(3, "john");

        Map<Integer, String> map2 = new HashMap<>();

        map2.put(10, "Manish");
        map2.put(20, "Tejas");
        map2.put(30, "Amit");


        List<Map<Integer, String>> list = new ArrayList<>();

        list.add(map);
        list.add(map1);
        list.add(map2);

        list.forEach(l -> {
            l.forEach((k, v) -> {
                System.out.print(k + " " + v);
            });
        });
    }
}
