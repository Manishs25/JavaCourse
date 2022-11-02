package multithreading;


public class AnnonymousInnerClass {
    public static void main(String[] args) {
        MyInterface myInterface = () -> {
            System.out.println("In show");

        };
        myInterface.show();
    }


    interface MyInterface {
        void show();
    }
}
