package programs.lab_4;

import java.util.EmptyStackException;

public class StackPop {
    private static final int MAX_SIZE = 100;
    private int[] array;
    private int top;

    public void Stack() {
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

    public int pop() {
        if (top == -1) {
            throw new EmptyStackException();
        }

        int poppedItem = array[top];
        top--;

        return poppedItem;
    }

    public static void main(String[] args) {
        StackPop stack = new StackPop();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        int poppedItem = stack.pop();
        System.out.println("Popped item: " + poppedItem);

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
