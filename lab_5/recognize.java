import java.util.Scanner;

class Rec {
    int top = -1;
    int maxSize = 100;
    char[] stack = new char[maxSize];

    public boolean isFull() {
        return top == maxSize - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(char element) {
        if (isFull()) {
            System.out.println("Stack overflow");
        } else {
            stack[++top] = element;
            System.out.println("Pushed element: " + element);
        }
    }

    public void recognize(String input) {
        for (int i = 0; i < input.length(); i++) {
            char next = input.charAt(i);
            if (next == ' ') {
                System.out.println("Invalid string");
                return;
            } else {
                push(next);
            }
        }

        String reverse = "";
        while (!isEmpty()) {
            reverse += stack[top--];
        }

        if (input.equals(reverse)) {
            System.out.println("String is a valid");
        } else {
            System.out.println("String is not valid");
        }
    }
}

public class recognize {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rec rc = new Rec();

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        rc.recognize(input);
    }
}
