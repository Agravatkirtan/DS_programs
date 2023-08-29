public class StackUsingLinkedList {
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node top;

    public StackUsingLinkedList() {
        top = null;
    }

    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
            return -1;
        }

        int poppedData = top.data;
        top = top.next;
        return poppedData;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot peek.");
            return -1;
        }

        return top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void printStack() {
        System.out.println("Stack elements:");
        Node current = top;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public static void main(String[] args) {
        StackUsingLinkedList stack = new StackUsingLinkedList();

        stack.push(3);
        stack.push(7);
        stack.push(12);

        stack.printStack();

        int poppedItem = stack.pop();
        System.out.println("Popped item: " + poppedItem);

        int topItem = stack.peek();
        System.out.println("Top item: " + topItem);

        stack.printStack();
    }
}
