package collectionframework;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeueDemo {
    public static void main(String[] args) {

        Deque<Integer> deque = new ArrayDeque<>();

        deque.add(10);
        deque.offer(20);
        deque.offerFirst(5);
        deque.addLast(30);

        System.out.println(deque);
        System.out.println(deque.peek());
        System.out.println(deque.contains(5));
        System.out.println(deque.pop());
        System.out.println(deque);
        System.out.println(deque.poll());
        System.out.println(deque);
        System.out.println(deque.pollLast());
        System.out.println(deque);
        System.out.println(deque.remove());
        System.out.println(deque);
        System.out.println(deque.offer(222));
        System.out.println(deque);
        System.out.println(deque.removeFirst());
    }
}
