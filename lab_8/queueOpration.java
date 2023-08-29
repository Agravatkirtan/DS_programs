import java.util.Scanner;

public class queueOpration {
    int front;
    int rear;
    int size;
    int queueArray[];

    public queueOpration(int size) {
        front = -1;
        rear = -1;
        queueArray = new int[size];
    }

    public boolean isEmpty() {
        return (front == -1 || front > rear);
    }

    public void enqueue(int element) {
        if (rear == size - 1) {
            System.out.println("queue is overflow");
        } else {
            rear++;
            queueArray[rear] = element;
        }
    }

    public int dequeue(int element) {
        if (isEmpty()) {
            System.out.println("queue is underflow");
        } else {
            element = queueArray[front];
            front++;
        }
        return element;

    }

    public void displayQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
        } else {
            System.out.println("Queue elements:");
            for (int i = front; i <= rear; i++) {
                System.out.print(queueArray[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a size of queue");
        int maxsize = sc.nextInt();

        queueOpration qo = new queueOpration(maxsize);

        sc.close();
    }
}
