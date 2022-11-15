package collectionframework;

import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>();

        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);


//        int i = 0;
//        while (true){
//            queue.add(i);
//            i++;
//        }

//        System.out.println(queue.peek()); //it return null when queue is empty
//        System.out.println(queue.element()); //it return exception when queue is empty
//
//        System.out.println(queue.poll()); //it remove head or it returns null when queue is empty
        System.out.println(queue.remove()); //it return exception when queue is empty.
        System.out.println(queue);
    }
}
