package app;

public class TreeDisplay {
    private MyTree tree;

    public TreeDisplay(MyTree tree) {
        this.tree = tree;
    }

    private void getNextNode(Node node) {
        System.out.print(node.getValue() + " ");
        if (node.hasLeft()) {
            getNextNode(node.getLeft());
        }
        if (node.hasRight()) {
            getNextNode(node.getRight());
        }
    }

    public void displayInorder() {
        if (tree.hasRoot()) {
            if (tree.getRoot().hasLeft()) {
                getNextNode(tree.getRoot().getLeft());
            }
            System.out.print(tree.getRoot().getValue() + " ");
            if (tree.getRoot().hasRight()) {
                getNextNode(tree.getRoot().getRight());
            }
        }
    }

    public void displayPreorder() {
        if (tree.hasRoot()) {
            System.out.print(tree.getRoot().getValue() + " ");
            if (tree.getRoot().hasLeft()) {
                getNextNode(tree.getRoot().getLeft());
            }
            if (tree.getRoot().hasRight()) {
                getNextNode(tree.getRoot().getRight());
            }
        }
    }

    public void displayPostorder() {
        if (tree.hasRoot()) {
            if (tree.getRoot().hasLeft()) {
                getNextNode(tree.getRoot().getLeft());
            }
            if (tree.getRoot().hasRight()) {
                getNextNode(tree.getRoot().getRight());
            }
            System.out.print(tree.getRoot().getValue() + " ");
        }
    }
}
