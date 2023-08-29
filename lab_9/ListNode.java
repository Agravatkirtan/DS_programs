import java.util.Scanner;

public class ListNode {
    int data;
    ListNode next;

    public ListNode(int data) {
        this.data = data;
        this.next = null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the data for the node: ");
        int data = scanner.nextInt();
        scanner.close();

        ListNode node = new ListNode(data);

        System.out.println("Node created. Data in the node: " + node.getData());
    }
}
