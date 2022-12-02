package java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class MapDemo {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,6);
        Function<Integer,Integer> function = (f)-> f+10;

        Predicate<Integer> predicate =(p)->p%2==0;

        list.stream().filter(predicate).forEach(System.out::println);

        System.out.println();
        list.stream().map(function).forEach(System.out::println);

    }
}
