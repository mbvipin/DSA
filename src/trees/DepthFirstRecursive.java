package trees;

public class DepthFirstRecursive {

    public static void main(String[] args) {

        BinaryTree tree=new BinaryTree();

        tree.add(10);
        tree.add(8);
        tree.add(3);
        tree.add(18);
        tree.add(15);
        tree.add(21);
        tree.add(22);

        depthFirstTraversal(tree.root);
    }

    private static void depthFirstTraversal(Node root) {

        if( root ==null)
        {
            return;
        }

        System.out.println(root.data);

        depthFirstTraversal(root.left);
        depthFirstTraversal(root.right);



    }
}
