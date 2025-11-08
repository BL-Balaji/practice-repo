package dsa;

public class Stack {
    int top = -1;
    int[] stack = new int[5];

    void push(int val) {
        if (top == stack.length - 1)
            System.out.println("Stack Overflow!");
        else
            stack[++top] = val;
    }

    void pop() {
        if (top == -1)
            System.out.println("Stack Underflow!");
        else
            System.out.println("Popped: " + stack[top--]);
    }

    void peek() {
        if (top == -1)
            System.out.println("Stack is Empty!");
        else
            System.out.println("Top: " + stack[top]);
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(10); s.push(20);
        s.peek(); // Top: 20
        s.pop(); // Popped: 20
    }
}
