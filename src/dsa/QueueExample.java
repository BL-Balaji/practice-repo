package dsa;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        // Create a Queue of integers
        Queue<Integer> queue = new LinkedList<>();

        // add() – Add elements to the queue (at the rear)
        queue.add(10);
        queue.add(20);
        queue.add(30);
        System.out.println("Queue after add: " + queue);

        // peek() – Look at the front element (but don’t remove it)
        System.out.println("Front element (peek): " + queue.peek());

        // remove() – Remove the front element
        System.out.println("Removed element: " + queue.remove());
        System.out.println("Queue after remove: " + queue);

        // isEmpty() – Check if queue is empty
        System.out.println("Is queue empty? " + queue.isEmpty());
    }
}

