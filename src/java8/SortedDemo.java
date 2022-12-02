package java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortedDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(167,332,954,44,556);

        list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
}
