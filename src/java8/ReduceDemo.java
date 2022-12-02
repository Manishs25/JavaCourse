package java8;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceDemo {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,6);

//it takes two parameters and produce single output

        Optional<Integer> integer = list.stream().reduce((a,b)->a+b);
        System.out.println(integer.get());
        //max
        Optional<Integer> integer1= list.stream().reduce((a,b)->(a>b)?a:b);
        System.out.println(integer1.get());
        //min
        Optional<Integer> integer2= list.stream().reduce((a,b)->(a<b)?a:b);
        System.out.println(integer2.get());
        //smallest string
        List<String> list1 = Arrays.asList("Rahul","Mahesh","Abhishek","John");
        Optional<String> str = list1.stream().reduce((a,b)->(a.length()<b.length())?a:b);
        System.out.println(str.get());
    }
}
