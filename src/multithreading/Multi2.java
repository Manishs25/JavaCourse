package multithreading;

public class Multi2 implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        System.out.println("In run method!!");
    }

    public static void main(String[] args) {
        Multi2 obj = new Multi2();
        Thread t1 = new Thread(obj);
        t1.start();
    }
}
