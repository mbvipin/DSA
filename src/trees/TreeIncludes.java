package trees;

import java.util.LinkedList;
import java.util.Queue;

public class TreeIncludes {

    public static void main(String[] args) {

        BinaryTree tree=new BinaryTree();

        tree.add(10);
        tree.add(8);
        tree.add(3);
        tree.add(18);
        tree.add(15);
        tree.add(21);
        tree.add(22);

        System.out.println(treeIncludesBreadthFirst(tree.root,21));
        System.out.println(treeIncludesBreadthFirst(tree.root,100));
    }

    private static boolean treeIncludesBreadthFirst(Node tree, int target) {

        if(tree==null)
        {
            return false;
        }

        Queue input=new LinkedList<>();

        input.add(tree);

        while(!input.isEmpty())
        {
            Node currentNode=(Node)input.remove();

            if(currentNode.data== target)
            {
                return true;
            }

            if(currentNode.left !=null)
            input.add(currentNode.left);

            if(currentNode.right !=null)
                input.add(currentNode.right);

        }

        return false;

    }


    private static boolean treeIncludes(Node tree, int target) {

        if(tree== null)
        {
            return false;
        }

        if(tree.data == target)
        {
            return true;
        }

        return treeIncludes(tree.left,target) || treeIncludes(tree.right,target);


    }
}
