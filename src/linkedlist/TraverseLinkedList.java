package linkedlist;

public class TraverseLinkedList {

    public static void main(String[] args) {

        LinkedList linkedListWithElements=new LinkedList();

        linkedListWithElements.addAtIndex(0,1);
        linkedListWithElements.addAtIndex(1,2);
        linkedListWithElements.addAtIndex(2,3);
        linkedListWithElements.addAtIndex(3,4);

        traverse(linkedListWithElements.getHead());
        traverseRecursively(linkedListWithElements.getHead());






    }

    public static  void traverse(Node head)
    {
         Node current=head;

         while(current!=null)
         {
             System.out.println(current.getData());
             current=current.next;
         }


    }

    public static  void traverseRecursively(Node head)
    {
        if(head==null)
        {
            return;
        }

        System.out.println(head.getData());

        traverseRecursively(head.getNext());


    }
}
