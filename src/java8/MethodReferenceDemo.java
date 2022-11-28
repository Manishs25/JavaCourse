package java8;

@FunctionalInterface
interface MyInterface3 {
    void show();
}

public class MethodReferenceDemo {
    public static void main(String[] args) {

        //method reference to instance method.

        MethodReferenceDemo obj = new MethodReferenceDemo();
        MyInterface3 myInterface3 = obj::display;//refer method

        myInterface3.show();
    }

    public void display() {
        System.out.println("In display");
    }
}
