package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LambdaExpression {
    public static void main(String[] args) {

        MyInterface m = () -> {
            System.out.println("In lambda!!");
        };
        m.show();

        MyInterface1 m1 = (i,j) -> {
            System.out.println(i+j);
        };
        m1.add(6,9);


        List<Integer> list = Arrays.asList(1,2,3,4);
        list.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });
    }

    @FunctionalInterface
    interface MyInterface {
        void show();
    }
    @FunctionalInterface
    interface MyInterface1 {
        void add(int i, int j);
    }


}

