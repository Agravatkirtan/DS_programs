public class InfixToPostfix {
    
       private static int getPrecedence(char operator) {
        if (operator == '+' || operator == '-')
            return 1;
        else if (operator == '*' || operator == '/')
            return 2;
        else if (operator == '^')
            return 3;
        else
            return -1;
    }

    private static boolean isOperator(char ch) {
        return ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '^';
    }
    
     private static boolean isLetterOrDigit(char ch) {
        return Character.isLetter(ch) || Character.isDigit(ch);
    }
    
        public static String convertToPostfix(String infix) {
        StringBuilder postfix = new StringBuilder();
        StringBuilder stack = new StringBuilder();
        
        for (int i = 0; i < infix.length(); i++) {
            char ch = infix.charAt(i);
            
           
            if (isLetterOrDigit(ch)) {
                postfix.append(ch);
            }
                    else if (ch == '(') {
                stack.append(ch);
            }
           else if (ch == ')') {
                while (stack.length() > 0 && stack.charAt(stack.length() - 1) != '(') {
                    postfix.append(stack.charAt(stack.length() - 1));
                    stack.setLength(stack.length() - 1);
                }
                if (stack.length() > 0 && stack.charAt(stack.length() - 1) != '(') {
                 
                    return "Invalid Expression";
                }
                stack.setLength(stack.length() - 1);            }
                        else if (isOperator(ch)) {
                while (stack.length() > 0 && getPrecedence(ch) <= getPrecedence(stack.charAt(stack.length() - 1))) {
                    postfix.append(stack.charAt(stack.length() - 1));
                    stack.setLength(stack.length() - 1);
                }
                stack.append(ch);
            }
        }
        
                while (stack.length() > 0) {
            if (stack.charAt(stack.length() - 1) == '(') {
                return "Invalid Expression";
            }
            postfix.append(stack.charAt(stack.length() - 1));
            stack.setLength(stack.length() - 1);
        }
        
        return postfix.toString();
    }
    
    public static void main(String[] args) {
        String infix = "a+b*(c^d-e)^(f+g*h)-i";
        String postfix = convertToPostfix(infix);
        System.out.println("Infix expression: " + infix);
        System.out.println("Postfix expression: " + postfix);
    }
}
