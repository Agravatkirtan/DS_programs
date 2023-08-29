class Stack {
    int maxSize;
    int[] stackArray;
    int top;

    public Stack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    public void push(int value) {
        if (top == maxSize - 1) {
            System.out.println("Stack is full. Cannot push element.");
        } else {
            top++;
            stackArray[top] = value;
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop element.");
            return -1;
        } else {
            int value = stackArray[top];
            top--;
            return value;
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }
}

public class PostfixEvaluation {
    public static int evaluatePostfix(String expression) {
        int size = expression.length();
        Stack stack = new Stack(size);

        for (int i = 0; i < size; i++) {
            char ch = expression.charAt(i);

            if (Character.isDigit(ch)) {
                int operand = Character.getNumericValue(ch);
                stack.push(operand);
            } else {
                int operand2 = stack.pop();
                int operand1 = stack.pop();

                if (ch == '+') {
                    stack.push(operand1 + operand2);
                } else if (ch == '-') {
                    stack.push(operand1 - operand2);
                } else if (ch == '*') {
                    stack.push(operand1 * operand2);
                } else if (ch == '/') {
                    stack.push(operand1 / operand2);
                } else {
                    System.out.println("Invalid character in postfix expression.");
                    return -1; // Return a default value indicating an error
                }
            }
        }

        if (!stack.isEmpty()) {
            return stack.pop();
        } else {
            System.out.println("Invalid postfix expression.");
            return -1; // Return a default value indicating an error
        }
    }

    public static void main(String[] args) {
        String postfixExpression = "532*+";
        int result = evaluatePostfix(postfixExpression);
        System.out.println("Postfix expression: " + postfixExpression);
        System.out.println("Evaluation result: " + result);
    }
}
