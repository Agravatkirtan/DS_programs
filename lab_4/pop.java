package programs.lab_4;

import java.util.Scanner;

class Stack {
    int maxSize;
    int[] ArrayStack;
    int top;

    public Stack(int size) {
        maxSize = size;
        ArrayStack = new int[size];
        top = -1;
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(int element) {
        if (isFull()) {
            System.out.println("Stack overflow");
        } else {
            ArrayStack[++top] = element;
            System.out.println("Pushed element: " + element);
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack underflow");
            return -1;
        } else {
            int poppedElement = ArrayStack[top--];
            System.out.println("Popped element: " + poppedElement);
            return poppedElement;
        }
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Stack contents:");
            for (int i = top; i >= 0; i--) {
                System.out.println(ArrayStack[i]);
            }
        }
    }
}

public class pop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the maximum size of the stack: ");
        int maxSize = sc.nextInt();
        Stack stack = new Stack(maxSize);
        System.out.println("Your stack is created.");

        int choice = -1;
        while (choice != 0) {
            System.out.println("\nStack Operations:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter the element to push: ");
                int element = sc.nextInt();
                stack.push(element);
                stack.display();
            } else if (choice == 2) {
                int poppedElement = stack.pop();
                if (poppedElement != -1) {
                    System.out.println("Popped element: " + poppedElement);
                }
                stack.display();
            } else if (choice == 3) {
                stack.display();
            } else if (choice == 0) {
                System.out.println("Exiting program...");
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }

        sc.close();
    }
}
