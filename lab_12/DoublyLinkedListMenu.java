import java.util.Scanner;

public class DoublyLinkedListMenu {
    private static class Node {
        int data;
        Node prev;
        Node next;

        public Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    Node head;
    Node tail;

    public DoublyLinkedListMenu() {
        head = null;
        tail = null;
    }

    public void insertAtBeginning(int data) {
        Node temp = new Node(data);
        if (head == null) {
            head = temp;
            tail = temp;
        } else {
            temp.next = head;
            head.prev = temp;
            head = temp;
        }
    }

    public void insertAtEnd(int data) {
        Node temp = new Node(data);
        if (tail == null) {
            head = temp;
            tail = temp;
        } else {
            tail.next = temp;
            temp.prev = tail;
            tail = temp;
        }
    }

    public void delete(int pos) {
        if (head == null) {
            return;
        }

        if (pos == 1) {
            if (head == null) {
                return;
            }
            if (head == tail) {
                head = null;
                tail = null;
                return;
            }
            Node temp = head;
            head = head.next;
            head.prev = null;
            temp.next = null;
            return;
        }

        Node current = head;
        int count = 1;

        while (current != null && count != pos) {
            current = current.next;
            count++;
        }

        if (current == null) {
            System.out.println("Position wrong");
            return;
        }

        if (current == tail) {
            if (tail == null) {
                return;
            }

            if (head == tail) {
                head = null;
                tail = null;
                return;
            }

            Node temp = tail;
            tail = tail.prev;
            tail.next = null;
            temp.prev = null;
            return;
        }

        current.prev.next = current.next;
        current.next.prev = current.prev;
        current.prev = null;
        current.next = null;
    }

    public void display() {
        if (head == null) {
            System.out.println("Doubly linked list is empty.");
            return;
        }

        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DoublyLinkedListMenu doublyList = new DoublyLinkedListMenu();
        Scanner scanner = new Scanner(System.in);

        int choice = 0;

        while (choice != 5) {
            System.out.println("\n------ Doubly Linked List Operations ------");
            System.out.println("1. Insert at Front");
            System.out.println("2. Delete Node at Current Position");
            System.out.println("3. Insert at End");
            System.out.println("4. Display All Nodes");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the data to insert at the front: ");
                    int dataFront = scanner.nextInt();
                    doublyList.insertAtBeginning(dataFront);
                    break;
                case 2:
                    int Position = scanner.nextInt();
                    doublyList.delete(Position);
                    break;
                case 3:
                    System.out.print("Enter the data to insert at the end: ");
                    int dataEnd = scanner.nextInt();
                    doublyList.insertAtEnd(dataEnd);
                    break;
                case 4:
                    doublyList.display();
                    break;
                case 5:
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
