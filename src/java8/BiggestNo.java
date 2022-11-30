package java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class BiggestNo {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Pune");
        list.add("Hadpsar");
        list.add("Pimpri Chinchwad");
        list.add("Karvenagar");
        list.add("Swargate");

        System.out.println("List of string : "+list);
        String biggest = list.stream().max(Comparator.comparingInt(String::length)).get();
        System.out.println("Longest String in the List is : "+biggest);
    }
}
