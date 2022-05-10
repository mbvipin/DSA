package trees;

import java.util.Stack;

public class DepthFirstIterative {

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

        Stack depthFirst=new Stack<>();

        depthFirst.push(root);

        while(!depthFirst.isEmpty())
        {
            Node poppedElement= (Node)depthFirst.pop();

            System.out.println(poppedElement.data);

            if(poppedElement.right !=null)
            {
                depthFirst.push(poppedElement.right);
            }

            if(poppedElement.left!=null)
            {
                depthFirst.push(poppedElement.left);
            }
        }
    }

}
