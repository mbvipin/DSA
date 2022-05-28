package trees;

public class TreeMaxSumRootToLeaf {

    public static void main(String[] args) {

        BinaryTree tree=new BinaryTree();

        tree.add(10);
        tree.add(8);
        tree.add(3);
        tree.add(18);
        tree.add(15);
        tree.add(21);
        tree.add(22);

        System.out.println(findMaxSum(tree.root));
    }

    private static int findMaxSum(Node root) {

        if(root==null)
        {
            return (int)Double.NEGATIVE_INFINITY;
        }

        if(root.left == null  && root.right ==null)
        {
            return root.data;
        }

       int leftMax= findMaxSum(root.left);
        int rightMax=findMaxSum(root.right);

        return root.data+Math.max(leftMax,rightMax);


    }
}
