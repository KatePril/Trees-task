package app;

public class Main {
    public static void main(String[] args) {
        TreeCreator treeCreator = new TreeCreator(15);
        treeCreator.fillTree(3, 7, 2, 4, 6, 8, 20, 17, 25, 19, 23);

        MyTree tree = treeCreator.getTree();

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
