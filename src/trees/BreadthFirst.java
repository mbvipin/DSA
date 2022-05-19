package trees;

import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirst {

    public static void main(String[] args) {

        BinaryTree tree=new BinaryTree();

        tree.add(10);
        tree.add(8);
        tree.add(3);
        tree.add(18);
        tree.add(15);
        tree.add(21);
        tree.add(22);

        breadthFirstTraversal(tree.root);
    }

    private static void breadthFirstTraversal(Node root) {

        Queue breadthFirst=new LinkedList();

        breadthFirst.add(root);

        while(!breadthFirst.isEmpty())
        {
            Node elementToPrint=(Node)breadthFirst.remove();

            System.out.println(elementToPrint.data);

            if(elementToPrint.left!=null) {
                breadthFirst.add(elementToPrint.left);
            }

            if(elementToPrint.right!=null) {
                breadthFirst.add(elementToPrint.right);
            }

        }


    }
}
