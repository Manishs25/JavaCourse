package java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Collectors {
    public static void main(String[] args) {

        List<Integer> ne  = Arrays.asList(1221,34457,78989809,34432234,79);
        ne.stream().collect(java.util.stream.Collectors.toList()).forEach(System.out::println);


    }
}
