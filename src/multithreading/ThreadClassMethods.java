package multithreading;

public class ThreadClassMethods {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("In run ");
            }
        });
        t1.setName("test");
        System.out.println(t1.getName());

        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("in t2");
            }
        });
        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("in t3");
            }
        });

//        t2.setPriority(1);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(10);

        t2.start();
        t3.start();

        t2.isDaemon();
        t3.isDaemon();

        System.out.println(t2.isDaemon());
        System.out.println(t3.isDaemon());

    }

}
