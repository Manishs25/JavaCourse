package multithreading;

//new thread(new runnable)
public class MultithreadingDemo2 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println(Thread.currentThread().getName());

        Thread T1 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Hii!!!");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        T1.start();
        T1.join();

        Thread T2 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Hello!!");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        T2.start();

//        System.out.println("exit");
    }

}

/**
 * A thread state. A thread can be in one of the following states:
 * NEW
 * A thread that has not yet started is in this state.
 * RUNNABLE
 * A thread executing in the Java virtual machine is in this state.
 * BLOCKED
 * A thread that is blocked waiting for a monitor lock is in this state.
 * WAITING
 * A thread that is waiting indefinitely for another thread to perform a particular action is in this state.
 * TIMED_WAITING
 * A thread that is waiting for another thread to perform an action for up to a specified waiting time is in this state.
 * TERMINATED
 * A thread that has exited is in this state.
 */

