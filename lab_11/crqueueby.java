public class crqueueby {
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;

        }
    }

    Node head;

    public crqueueby() {
        head = null;
    }

    public boolean isEmpty() {
        return (head == null);
    }

    public void insert(int data) {
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

    public void insertLast(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            newnode.next = newnode;
            head = newnode;
        } else {
            Node temp = newnode;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newnode;
            newnode.next = head;

        }
    }

    public void delete(int position) {
        if (head == null) {
            System.out.println("link list is empty :");
            return;
        }

    }
}