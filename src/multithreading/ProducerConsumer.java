package multithreading;

public class ProducerConsumer {

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

class Producer implements Runnable {

    ProducerConsumer producerConsumer;


    public Producer(ProducerConsumer producerConsumer) {
        this.producerConsumer = producerConsumer;
        Thread t1 = new Thread(this);
        t1.start();
    }

    @Override
    public void run() {
        int i = 0;
        while (true) {
            producerConsumer.setNum(i++);
            try {
                Thread.sleep(600);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class Consumer implements Runnable {

    ProducerConsumer producerConsumer;

    public Consumer(ProducerConsumer producerConsumer) {
        this.producerConsumer = producerConsumer;
        Thread t1 = new Thread(this);
        t1.start();
    }

    @Override
    public void run() {
        while (true) {
            producerConsumer.getnum();
            try {
                Thread.sleep(600);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class main {
    public static void main(String[] args) {
        ProducerConsumer producerConsumer = new ProducerConsumer();
        Producer producer = new Producer(producerConsumer);
        Consumer consumer = new Consumer(producerConsumer);
    }
}
