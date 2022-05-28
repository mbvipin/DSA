package trees;

import sun.awt.image.ImageWatched;

import java.util.LinkedList;
import java.util.Queue;

public class TreeSum {

    public static void main(String[] args) {

        BinaryTree tree=new BinaryTree();

        tree.add(10);
        tree.add(8);
        tree.add(3);
        tree.add(18);
        tree.add(15);
        tree.add(21);
        tree.add(22);

        System.out.println(treesum(tree.root));

        System.out.println(treesumBreadthFirst(tree.root));

    }

    private static int treesumBreadthFirst(Node root) {

        if(root==null)
        {
            return 0;
        }

        int sum=0;

        Queue input=new LinkedList<>();

        input.add(root);

        while( !input.isEmpty())
        {
            Node currentNode= (Node) input.remove();

            sum+=currentNode.data;

            if(currentNode.left!=null)
            {
                input.add(currentNode.left);
            }

            if(currentNode.right!=null)
            {
               input.add(currentNode.right);
            }


        }


        return sum;
    }

    private static int treesum(Node root) {

        int sum=0;
        if( root==null)
        {
            return sum;
        }

        return root.data+treesum(root.left)+treesum(root.right);

    }
}
