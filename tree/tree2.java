//only insert and search a node
class BST {
    Node root;

    class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.right = null;
            this.left = null;
        }
    }

    void insert(int val) {
        Node current = root;
        Node prev = current;
        Node n = new Node(val);
        if (root == null) {
            root = n;
            return;
        }

        while (current != null) {
            if (n.data < current.data) {
                prev = current;
                current = current.left;
            } else {
                prev = current;
                current = current.right;
            }
        }
        if (n.data < prev.data) {
            prev.left = n;
        } else {
            prev.right = n;
        }
    }

    void search(int key) {
        if (root == null) {
            System.out.println("not found");
            return;
        }
        Node current = root;
        while (current != null) {
            if (key < current.data) {

                current = current.left;
            } else {
                current = current.right;
            }
        }
    }
}

class tree2 {
    public static void main(String[] args) {
        BST t = new BST();
        t.insert(2);
    }
}