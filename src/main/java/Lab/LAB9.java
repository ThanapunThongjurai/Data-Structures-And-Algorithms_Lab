package Lab;

import rmuti.ds.Node;
import rmuti.ds.TreeDraw;

public class LAB9 {
    public static void main(String[] args) {
        Node c = new Node("c", null, null);
        Node b = new Node("b", null, null);
        Node a = new Node("a", b, c);
        new TreeDraw(a).binaryTreeDraw();
    }
}
