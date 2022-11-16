package collectionframework;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();

        map.put("Pune", 1);
        map.put("Satara", 2);
        map.put("Nashik", 3);

        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.values());
        System.out.println(map.keySet());
        System.out.println(map.isEmpty());
        System.out.println(map.entrySet());
        System.out.println(map.hashCode());
        System.out.println(map.containsKey("Pune"));
        System.out.println(map.putIfAbsent("Mumbai",4));


        System.out.println();

        //iterating keys and values
        map.forEach((k, v) -> {
            System.out.println(k + " " + v);
        });

        System.out.println();

        //using for loop iterating keys and values
        for (Map.Entry<String, Integer> m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}
