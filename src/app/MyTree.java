package app;

public class MyTree {

    private Node root;

    public MyTree() {
    }

    public MyTree(Node root) {
        this.root = root;
    }

    public String addElement (int value) {
        if (root == null) {
            root = new Node(value);
            return "Element was added successfully";
        } else if (value < root.getValue()) {
            if (root.left == null) {
                root.left = new Node(value);
            } else {
                goToNextNode(value, root.left);
            }
        } else if (value > root.getValue()) {
            if (root.right == null) {
                root.right = new Node(value);
            } else {
                goToNextNode(value, root.right);
            }
        }
        return "Failed to add element";
    }

    public String goToNextNode(int value, Node node) {
        if (value < node.getValue()) {
            if (node.left == null) {
                node.left = new Node(value);
                return "Element was added successfully";
            } else {
                goToNextNode(value, node.left);
            }
        } else if (value > node.getValue()) {
            if (node.right == null) {
                node.right = new Node(value);
                return "Element was added successfully";
            } else {
                goToNextNode(value, node.right);
            }
        }
        return "Failed to add element";
    }

    private class Node {
        private int value;
        private Node left;
        private Node right;

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public Node getLeft() {
            return left;
        }

        public void setLeft(Node left) {
            this.left = left;
        }

        public Node getRight() {
            return right;
        }

        public void setRight(Node right) {
            this.right = right;
        }
    }
}
