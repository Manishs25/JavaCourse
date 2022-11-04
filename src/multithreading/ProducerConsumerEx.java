package multithreading;


//>>>Producer consumer problem using Single thread


public class ProducerConsumerEx {

    int num;

    boolean flag = false;

    public synchronized void getnum() {
        if (!flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Get : " + this.num);
        flag = false;
        notify();
    }

    public synchronized void setNum(int num) {
        if (flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        this.num = num;
        System.out.println("Set : " + this.num);
        flag = true;
        notify();
    }
}

class Main {

    public static void main(String[] args) {

        ProducerConsumerEx producerConsumerEx = new ProducerConsumerEx();

        Thread t1 = new Thread(() -> {
            int num = 0;
            while (true) {
                producerConsumerEx.setNum(num++);
                producerConsumerEx.getnum();
                try {
                    Thread.sleep(800);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        t1.start();
    }
}
