package trees;

public class BinaryTree {

    Node root;

    public void add (int data)
    {
        this.root=add(this.root,data);
    }


    public Node add(Node root,int data)
    {

        if(root==null)
        {
            Node node=new Node();
             node.data=data;
            return node;


        }

        else if (data <=root.data)
        {
            root.left= add(root.left,data);
            return root;

        }

        else
        {
            root.right= add(root.right,data);
            return root;

        }


    }





}
