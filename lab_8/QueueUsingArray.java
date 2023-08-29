import java.util.Scanner;

public class QueueUsingArray {
    int[] queueArray;
    int front;
    int rear;
    int maxSize;

    public QueueUsingArray(int maxSize) {
        this.maxSize = maxSize;
        queueArray = new int[maxSize];
        front = -1;
        rear = -1;
    }

    public boolean isEmpty() {
        return (front == -1 || front > rear);
    }

    public void enqueue(int item) {
        if (rear == maxSize - 1) {
            System.out.println("Queue is full. Cannot enqueue element.");
        } else {
            if (front == -1) {
                front = 0;
            }
            rear++;
            queueArray[rear] = item;
            System.out.println(item + " enqueued to the queue.");
        }
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue element.");
            return -1;
        } else {
            int dequeuedItem = queueArray[front];
            front++;
            return dequeuedItem;
        }
    }

    public void displayQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
        } else {
            System.out.println("Queue elements:");
            for (int i = front; i <= rear; i++) {
                System.out.print(queueArray[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the maximum size of the queue: ");
        int maxSize = sc.nextInt();
        QueueUsingArray queue = new QueueUsingArray(maxSize);

        int choice;
        do {
            System.out.println("\n------ Queue Operations ------");
            System.out.println("1. ENQUEUE");
            System.out.println("2. DEQUEUE");
            System.out.println("3. DISPLAY");
            System.out.println("4. EXIT");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the element to enqueue: ");
                    int item = sc.nextInt();
                    queue.enqueue(item);
                    break;
                case 2:
                    int dequeuedItem = queue.dequeue();
                    if (dequeuedItem != -1) {
                        System.out.println("Dequeued item: " + dequeuedItem);
                    }
                    break;
                case 3:
                    queue.displayQueue();
                    break;
                case 4:
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        sc.close();
    }
}
