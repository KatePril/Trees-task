package app;

public class MyTree {

    private Node root;
    public MyTree(int value) {
        this.root = new Node(value);
    }

    public String addElement (int value) {
        if (!hasRoot()) {
            root = new Node(value);
            return "Element was added successfully";
        } else if (value < root.getValue()) {
            if (root.hasLeft()) {
                return goToNextNode(value, root.getLeft());
            } else {
                root.setLeft(value);
                return "Element was added successfully";
            }
        } else if (value > root.getValue()) {
            if (root.hasRight()) {
                return goToNextNode(value, root.getRight());
            } else {
                root.setRight(value);
                return "Element was added successfully";
            }
        }
        return "Failed to add element";
    }

    private String goToNextNode(int value, Node node) {
        if (value < node.getValue()) {
            if (node.hasLeft()) {
                return goToNextNode(value, node.getLeft());
            } else {
                node.setLeft(value);
                return "Element was added successfully";
            }
        } else if (value > node.getValue()) {
            if (node.hasRight()) {
                return goToNextNode(value, node.getRight());
            } else {
                node.setRight(value);
                return "Element was added successfully";
            }
        }
        return "Failed to add element";
    }

    public boolean hasRoot() {
        return root != null;
    }

    public Node getRoot() {
        return root;
    }
}
