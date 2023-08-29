import java.util.Scanner;

public class CircularLL {
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    public CircularLL() {
        head = null;
    }

    public void insertAtFront(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            newNode.next = newNode;
        } else {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = head;
        }
        head = newNode;
    }

    public void deleteNode(int position) {
        if (head == null) {
            System.out.println("Circular linked list is empty. Cannot delete.");
            return;
        }

        if (position <= 0) {
            System.out.println("Invalid position. Position should be positive.");
            return;
        }

        if (position == 1) {
            if (head.next == head) {
                head = null;
            } else {
                Node temp = head;
                while (temp.next != head) {
                    temp = temp.next;
                }
                temp.next = head.next;
                head = head.next;
            }
            return;
        }

        Node prev = null;
        Node current = head;
        int count = 1;

        while (current != head && count < position) {
            prev = current;
            current = current.next;
            count++;
        }

        if (count == position) {
            prev.next = current.next;
        } else {
            System.out.println("Position out of range. Cannot delete.");
        }
    }

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            newNode.next = newNode;
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = head;
        }
    }

    public void display() {
        if (head == null) {
            System.out.println("Circular linked list is empty.");
            return;
        }

        Node temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }

    public static void main(String[] args) {
        CircularLL circularList = new CircularLL();
        Scanner scanner = new Scanner(System.in);

        int choice;
        while (true) {
            System.out.println("\n------ Circular Linked List Operations ------");
            System.out.println("1. Insert at Front");
            System.out.println("2. Delete Node at Specified Position");
            System.out.println("3. Insert at End");
            System.out.println("4. Display All Nodes");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the data to insert at the front: ");
                    int dataFront = scanner.nextInt();
                    circularList.insertAtFront(dataFront);
                    break;
                case 2:
                    System.out.print("Enter the position of the node to delete: ");
                    int position = scanner.nextInt();
                    circularList.deleteNode(position);
                    break;
                case 3:
                    System.out.print("Enter the data to insert at the end: ");
                    int dataEnd = scanner.nextInt();
                    circularList.insertAtEnd(dataEnd);
                    break;
                case 4:
                    circularList.display();
                    break;
                case 5:
                    System.out.println("Exiting the program. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
