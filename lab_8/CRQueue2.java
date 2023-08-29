import java.util.*;

class Queue2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of queue");
        int n = sc.nextInt();
        Queue q2 = new Queue(n);
        q2.insert(5);
        q2.insert(6);
        q2.insert(7);
        q2.delet();
        q2.display();
    }
}

class Queue {
    int arr[];
    int size;
    int frunt = -1;
    int rear = -1;

    Queue(int n) {
        arr = new int[n];
        this.size = n;
    }

    public void insert(int value) {
        if (rear == size - 1) {
            rear = 0;
        } else {
            rear++;
        }
        if (rear == frunt) {
            System.out.println("Queue overflow");
        }
        arr[rear] = value;
        if (frunt == -1) {
            frunt = 0;
        }
    }

    public int delet() {
        int y = -1;
        if (frunt == -1) {
            System.out.println("Queue is underflow");
        } else {
            y = arr[frunt];
            if (frunt == rear) {
                frunt = -1;
                rear = frunt;
            } else if (frunt == size - 1) {
                frunt = 0;
            } else {
                frunt++;
            }
        }
        System.out.println(y + "is deleted");
        return y;

    }

    public void display() {
        if (frunt == -1) {
            System.out.println("Queue is underfow");
        }
        while (frunt != rear + 1) {
            if (frunt == size - 1) {
                System.out.println(arr[frunt]);
                frunt = 0;
            } else {
                System.out.println(arr[frunt]);
                frunt++;
            }
        }
    }
}