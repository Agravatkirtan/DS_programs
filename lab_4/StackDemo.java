package programs.lab_4;

import java.util.Stack;

public class StackDemo {
	public static void main(String args[]) {
		Stack<Integer> STACK = new Stack<>();
		STACK.push(10);
		STACK.push(15);
		STACK.push(30);
		STACK.push(20);
		STACK.push(5);
		STACK.push(null);

		System.out.println("Initial Stack: " + STACK);

		STACK.push(1254);
		STACK.push(467);
		STACK.pop();

		System.out.println("Final Stack: " + STACK);
	}
}
