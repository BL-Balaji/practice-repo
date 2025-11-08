package dsa;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        // Create a Stack of integers
        Stack<Integer> stack = new Stack<>();

        // push() – Add elements
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Stack after push: " + stack);

        // peek() – See the top element (but don’t remove it)
        System.out.println("Top element (peek): " + stack.peek());

        // pop() – Remove the top element
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Stack after pop: " + stack);

        // isEmpty() – Check if stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}

