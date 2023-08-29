public class Infix_To_Postfix {
    static String infix = "a+b*c/d-e+f/g/(h+i)";
    static char a[] = new char[infix.length()];
    static int top = -1;

    public static void main(String[] args) {
        System.out.println("Infix : " + infix);
        System.out.println("postfix : " + convert(infix));
    }

    public static int precedence(char ch) {
        switch (ch) {
            case '+':
                return 1;

            case '-':
                return 1;

            case '*':
                return 2;

            case '/':
                return 2;

            case '^':
                return 3;

        }
        return -1;
    }

    public static String convert(String expression) {
        String postfix = "";
        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);
            if (Character.isLetter(ch)) {
                postfix += ch;
            } else if (ch == '(') {
                push(ch);
            } else if (ch == ')') {
                char x = pop();
                while (x != '(') {
                    postfix += x;
                    x = pop();
                }
            } else if (precedence(ch) > 0) {
                if (top == -1 || a[top] == '(') {
                    push(ch);
                } else {
                    while (top != -1 && precedence(ch) <= precedence(a[top])) {
                        postfix += pop();

                    }
                    push(ch);
                }
            }
        }
        while (top != -1) {
            postfix += pop();
        }
        return postfix;
    }

    public static void push(char ch) {
        top++;
        a[top] = ch;
    }

    public static char pop() {
        return a[top--];
    }
}