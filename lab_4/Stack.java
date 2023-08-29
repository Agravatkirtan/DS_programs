package programs.lab_4;

import java.util.*;

public class Stack {
    static final int MAX_SIZE = 100;
    int[] array;
    int top;

    public Stack() {
        array = new int[MAX_SIZE];
        top = -1;
    }

    public void push(int item) {
        if (top == MAX_SIZE - 1) {
            throw new StackOverflowException("Stack is full. Cannot push item.");
        }

        top++;
        array[top] = item;
    }

    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.printStack();
    }

    public void printStack() {
        if (top == -1) {
            System.out.println("Stack is empty.");
            return;
        }

        System.out.println("Stack elements:");
        for (int i = 0; i <= top; i++) {
            System.out.println(array[i]);
        }
    }
}

class StackOverflowException extends RuntimeException {
    public StackOverflowException(String message) {
        super(message);
    }
}
