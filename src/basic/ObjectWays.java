package basic;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ObjectWays {
    int i=10;
    public static void main(String[] args) throws InstantiationException,
            IllegalAccessException, NoSuchMethodException, InvocationTargetException {

        ObjectWays obj = new ObjectWays();
//        System.out.println(obj.i);

        ObjectWays obj2 = ObjectWays.class.newInstance();
//        System.out.println(obj2.i);

        Constructor<ObjectWays> obj3 =  ObjectWays.class.getConstructor();
        ObjectWays objectWays = obj3.newInstance();
        System.out.println(objectWays.i);
    }
}
