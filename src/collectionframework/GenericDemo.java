package collectionframework;

import java.util.ArrayList;
import java.util.List;

public class GenericDemo<T> {

    private T t;

    public static void main(String[] args) {


        GenericDemo<String> genericDemo = new GenericDemo<>();
        genericDemo.setT("Manish");
        System.out.println(genericDemo.getT());

        GenericDemo<Integer> gdInt = new GenericDemo<>();
        gdInt.setT(99);
        System.out.println(gdInt.getT());

        GenericDemo<Integer> obj = new GenericDemo<>();
        obj.setT(69);
        System.out.println(obj.getT());

        List list = new ArrayList<>();
        list.add("Hiii");
        list.add(2);
        list.add('M');

//        String s = (String) list.get(0);
        System.out.println(list);
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
