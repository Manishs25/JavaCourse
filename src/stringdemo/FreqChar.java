package stringdemo;

import java.util.HashMap;

public class FreqChar {
    public static void main(String[] args) {
        String str = "Pune";

        HashMap<Character, Integer> Map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            Character ch = str.charAt(i);
            if (Map.containsKey(ch)) {
                int count = Map.get(ch);
                Map.put(ch, count + 1);
            } else {
                Map.put(ch, 1);
            }
        }
        System.out.println(Map);
    }
}
