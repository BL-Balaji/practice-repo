package dsa;

public class Queue {
    int[] queue = new int[5];  // Array to store queue elements
    int front = 0;             // Points to the front of the queue
    int rear = -1;             // Points to the last element
    int size = 0;              // Tracks number of elements

    // Add element to the queue
    void enqueue(int val) {
        if (size == queue.length) {
            System.out.println("Queue is Full!");
        } else {
            rear = (rear + 1) % queue.length;  // Circular increment
            queue[rear] = val;                 // Add new element
            size++;
            System.out.println(val + " added to queue");
        }
    }

    // Remove element from the queue
    void dequeue() {
        if (size == 0) {
            System.out.println("Queue is Empty!");
        } else {
            System.out.println("Removed: " + queue[front]);
            front = (front + 1) % queue.length;  // Move front ahead
            size--;
        }
    }

    // Show the element at the front
    void peek() {
        if (size == 0) {
            System.out.println("Queue is Empty!");
        } else {
            System.out.println("Front Element: " + queue[front]);
        }
    }

    // Main method to test queue
    public static void main(String[] args) {
        Queue q = new Queue();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.peek();     // Show front element
        q.dequeue();  // Remove front
        q.peek();     // Show new front
    }
}

