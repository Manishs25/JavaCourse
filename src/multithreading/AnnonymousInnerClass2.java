package multithreading;

public class AnnonymousInnerClass2 {
    public static void main(String[] args) {
        MyInterface myInterface = new MyInterface() {
            @Override
            public void show() {
                System.out.println("In show");
            }

            @Override
            public int sum(int a, int b) {
                return 0;
            }
        };
        myInterface.show();
        myInterface.sum(9, 7);
    }

    interface MyInterface {
        void show();

        int sum(int a, int b);
    }
}
