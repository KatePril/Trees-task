package app;

public class TreeCreator {

    private MyTree tree;

    public TreeCreator(int rootValue) {
        this.tree = new MyTree(rootValue);
    }

    public void fillTree(int... values) {
        for (int value : values) {
            System.out.println(tree.addElement(value));
        }
    }

    public MyTree getTree() {
        return tree;
    }

    public void setTree(MyTree tree) {
        this.tree = tree;
    }
}
