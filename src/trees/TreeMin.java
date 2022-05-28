package trees;

public class TreeMin {

    public static void main(String[] args) {

        BinaryTree tree=new BinaryTree();

        tree.add(10);
        tree.add(8);
        tree.add(3);
        tree.add(18);
        tree.add(15);
        tree.add(21);
        tree.add(22);

        System.out.println(findTreeMin(tree.root));


    }

    private static int findTreeMin(Node root) {

        if(root==null)
        {
            return (int)Double.POSITIVE_INFINITY;
        }

        int minLeft=findTreeMin(root.left);
        int minRight=findTreeMin(root.right);

        return Math.min(root.data,Math.min(minLeft,minRight));


    }
}
