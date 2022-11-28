package java8;

interface MyInterface5 {
    MethodRefConstructor getConst();
}

public class MethodRefConstructor {
    MethodRefConstructor() {
        System.out.println("In constructor!!");
    }

    public static void main(String[] args) {
        MyInterface5 myInterface5 = MethodRefConstructor::new;
        myInterface5.getConst();
    }
}