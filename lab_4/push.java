package programs.lab_4;

import java.util.Scanner;

class stack {
    int maxsize;
    int[] ArrayStack;
    int top;

    public stack(int size) {
        maxsize = size;
        ArrayStack = new int[size];
        top = -1;
    }

    public void push(int item) {
        if (top == maxsize - 1) {
            System.out.println("stack overflow");
        } else {
            ArrayStack[top++] = item;
            System.out.println("pushes element" + item);
        }
    }

    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Stack contents:");
            for (int i = top; i >= 0; i--) {
                System.out.println(ArrayStack[i]);
            }
        }
    }
}

public class push {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter element");
        int maxsize = sc.nextInt();
        stack s = new stack(maxsize);
        s.display();
        sc.close();
    }
}