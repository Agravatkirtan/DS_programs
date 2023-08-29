//all methods using recursion by apna collge
class tree {
    public static class Node {
        int data;
        Node right;
        Node left;

        Node(int data) {
            this.data = data;
            this.right = null;
            this.left = null;
        }

    }

    public static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }
        if (root.data > val) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.println(root.data + " ");
        inorder(root.right);
    }

    public static boolean search(Node root, int key) {
        if (root == null) {
            return false;
        }
        if (root.data > key) {
            return search(root.left, key);
        } else if (root.data == key) {
            return true;
        } else {
            return search(root.right, key);
        }
    }
    public static Node delete(Node root,int val){
        if(root == null){
        System.out.println("not found");
        }
        if(root.data> val){
        root.left = delete(root.left,val);
        }
        else if(root.data < val){
    root.right =delete(root.right,val);}
    else{
    if(root.left == null && root.right== null){
    return null;
    }
    if(root.left == null){
    return root.right;
    }
    else if(root.right ==null){
    return root.left;
    }
    Node IS = inordersuccessor(root.right);
    root.data = IS.data;
    root.right = delete(root.right,IS.data);
    }
    return root;	
    }
    
    public static Node inordersuccessor(Node root){
        while(root.left  != null){
            root = root.left;
        }
        return root;
    }

    public static void main(String[] args) {
        Node root = null;
        int values[] = { 5, 2, 1, 3, 4, 7 };

        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }
        inorder(root);
        System.out.println();

        if (search(root, 6)) {
            System.out.println("found");
        } else {
            System.out.println("not found");
        }
    }
}