package trees;

public class BinaryTreeTesting {

    public static void main(String[] args) {

        BinaryTree tree=new BinaryTree();

        tree.add(10);
        tree.add(8);
        tree.add(3);
        tree.add(18);
        tree.add(15);
        tree.add(21);
        tree.add(22);

        System.out.println(tree.root.data);
        System.out.println(tree.root.left.data);
        System.out.println(tree.root.left.left.data);
        System.out.println(tree.root.right.data);
        System.out.println(tree.root.right.right.data);
        System.out.println(tree.root.right.right.right.data);
        System.out.println(tree.root.right.left.data);


    }
}
