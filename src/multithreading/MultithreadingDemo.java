package multithreading;
//thread schedular and thread lifecycle..

public class MultithreadingDemo extends Thread {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());

        MultithreadingDemo obj = new MultithreadingDemo();
        obj.start();
        System.out.println(obj.getName());

    }
}
