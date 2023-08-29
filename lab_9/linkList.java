public class linkList {
    node head;

    class node {
        String data;
        node next;

        node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(String data) {
        node newnode = new node(data);
        if (head == null) {
            head = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }

    public void addlast(String data) {
        node newnode = new node(data);
        if (head == null) {
            head = newnode;
            return;
        }
        node currentnode = head;
        while (currentnode.next != null) {
            currentnode = currentnode.next;
        }
        currentnode.next = newnode;
    }

    public void print() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        node currentnode = head;
        while (currentnode != null) {
            System.out.println(currentnode.data + "---");
            currentnode = currentnode.next;
        }
        System.out.println("null");

    }

    public void deletefirst() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        head = head.next;
    }

    public void deletelast() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        if (head.next == null) {
            head = null;
        }

        node secondLast = head;
        node lastnode = head.next;
        while (lastnode.next != null) {
            lastnode = lastnode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }

    public static void main(String[] args) {
        linkList list = new linkList();
        list.addFirst("is");
        list.addFirst("kirtan?");
        list.print();
    }
}
