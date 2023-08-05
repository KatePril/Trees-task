package app;

public class Main {
    public static void main(String[] args) {
        MyTree tree = new MyTree(15);

        System.out.println(tree.addElement(3));
        System.out.println(tree.addElement(7));
        System.out.println(tree.addElement(2));

        System.out.println(tree.addElement(4));
        System.out.println(tree.addElement(6));
        System.out.println(tree.addElement(8));

        System.out.println(tree.addElement(20));
        System.out.println(tree.addElement(17));
        System.out.println(tree.addElement(25));

        System.out.println(tree.addElement(19));
        System.out.println(tree.addElement(23));
        System.out.println(tree.addElement(16));

        System.out.println();
        TreeDisplay treeDisplay = new TreeDisplay(tree);

        System.out.print("Inorder display: ");
        treeDisplay.displayInorder();
        System.out.println();

        System.out.print("Preorder display: ");
        treeDisplay.displayPreorder();
        System.out.println();

        System.out.print("Postorder: ");
        treeDisplay.displayPostorder();
    }
}
