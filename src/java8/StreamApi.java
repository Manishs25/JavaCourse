package java8;


import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * Stream api =  it is sequence of object and it have many methods we combine that method and produce desire result
 *
 * types : sequential and parallel stream(multithreading)
 *
 * operation : intermediate and terminal
 *
 * terminal : forEach(),reduce(),collect()
 * intermediate : map(Function),filter(Predicate),sorted()
 */
public class StreamApi {
    public static void main(String[] args) {
        Function<Integer, Integer> fun = (Integer integer) -> integer * integer;

//        System.out.println(fun.apply(7));

        Function<String, Integer> str = s -> s.length();
//        System.out.println(str.apply("Manish Salunkhe"));


        // IntStream...
//        System.out.println("Max : " + IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9).max().getAsInt());
//        System.out.println("Range : " + Arrays.toString(IntStream.range(1, 100).toArray()));
//        System.out.println("Sum : " + IntStream.range(1, 10).sum());

        List<Integer> list = Arrays.asList(1, 2, 3, 69, 6, 7, 8);

        int max = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }
        System.out.println("Maximum : " + max);

        //Predicate...
//        Predicate<Integer> max = new Predicate<Integer>() {
//            @Override
//            public boolean test(Integer integer) {
//                return integer > 5;
//            }
//        };
//
//        list.stream().filter(max).forEach(System.out::println);
    }
}
