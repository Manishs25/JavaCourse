package multithreading;

public class MultithreadingDemo2 {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());

        Thread T1 = new Thread(()->{
            for(int i=1;i<=5;i++){
                System.out.println("Hii!!!");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        Thread T2 = new Thread(()->{
            for(int i=1;i<=5;i++){
                System.out.println("Hello!!");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        T1.start();
        T2.start();
    }

}
