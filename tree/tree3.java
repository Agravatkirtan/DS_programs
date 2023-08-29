//recursion in delete method

import java.util.Scanner;

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

    Node delete(Node root, int key) {
        if (root == null) {
            return root;
        }

        if (key < root.data) {
            root.left = delete(root.left, key);
        } else if (key > root.data) {
            root.right = delete(root.right, key);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            root.data = minValue(root.right);

            root.right = delete(root.right, root.data);
        }

        return root;
    }

    int minValue(Node root) {
        int minValue = root.data;
        while (root.left != null) {
            minValue = root.left.data;
            root = root.left;
        }
        return minValue;
    }

    void preorderTraversal(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preorderTraversal(root.left);
            preorderTraversal(root.right);
        }
    }

    void postorderTraversal(Node root) {
        if (root != null) {
            postorderTraversal(root.left);
            postorderTraversal(root.right);
            System.out.print(root.data + " ");
        }
    }

    void inorderTraversal(Node root) {
        if (root != null) {
            inorderTraversal(root.left);
            System.out.print(root.data + " ");
            inorderTraversal(root.right);
        }
    }

    void delete(int key) {
        root = delete(root, key);
    }

    void displayPreorder() {
        System.out.print("Preorder Traversal: ");
        preorderTraversal(root);
        System.out.println();
    }

    void displayPostorder() {
        System.out.print("Postorder Traversal: ");
        postorderTraversal(root);
        System.out.println();
    }

    void displayInorder() {
        System.out.print("Inorder Traversal: ");
        inorderTraversal(root);
        System.out.println();
    }
}

public class tree3s {
    public static void main(String[] args) {
        BST t = new BST();
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("\n Binary Search Tree Operations");
            System.out.println("1. Insert a Node");
            System.out.println("2. Delete a Node");
            System.out.println("3. Preorder Traversal");
            System.out.println("4. Postorder Traversal");
            System.out.println("5. Inorder Traversal");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the value to insert: ");
                    int insertValue = scanner.nextInt();
                    t.insert(insertValue);
                    break;
                case 2:
                    System.out.print("Enter the value to delete: ");
                    int deleteValue = scanner.nextInt();
                    t.delete(deleteValue);
                    break;
                case 3:
                    t.displayPreorder();
                    break;
                case 4:
                    t.displayPostorder();
                    break;
                case 5:
                    t.displayInorder();
                    break;
                case 6:
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 6);
    }
}
