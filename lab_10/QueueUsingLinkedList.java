public class QueueUsingLinkedList {
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    Node front;
    Node rear;

    public QueueUsingLinkedList() {
        front = null;
        rear = null;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1;
        }

        int dequeuedData = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        return dequeuedData;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot peek.");
            return -1;
        }

        return front.data;
    }

    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
        } else {
            System.out.println("Queue elements:");
            Node current = front;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        QueueUsingLinkedList queue = new QueueUsingLinkedList();

        queue.enqueue(3);
        queue.enqueue(7);
        queue.enqueue(12);

        queue.printQueue();

        int dequeuedItem = queue.dequeue();
        System.out.println("Dequeued item: " + dequeuedItem);

        int frontItem = queue.peek();
        System.out.println("Front item: " + frontItem);

        queue.printQueue();
    }
}
