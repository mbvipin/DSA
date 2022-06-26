import linkedlist.LinkedList;
import linkedlist.Node;

public class FindNodeAtIndex {

    public static void main(String[] args) {

        LinkedList linkedListWithElements=new LinkedList();

        linkedListWithElements.addAtIndex(0,1);
        linkedListWithElements.addAtIndex(1,2);
        linkedListWithElements.addAtIndex(2,3);
        linkedListWithElements.addAtIndex(3,4);

        System.out.println(findNodeAtIndexInList(linkedListWithElements.getHead(),2));

        System.out.println(findNodeAtIndexInListRecursively(linkedListWithElements.getHead(),2));
    }

    private static int findNodeAtIndexInListRecursively(Node head, int index) {

        if( head==null)
        {
            return -1;
        }

        if(index==0)
        {
            return head.getData();
        }

        return findNodeAtIndexInListRecursively(head.getNext(),index-1);





    }

    private static int findNodeAtIndexInList(Node head, int index) {

        Node current=head;
        int count=index;

        while(current!=null)
        {
            if(count==0)
            {
                return current.getData();
            }

            current=current.getNext();
            count--;
        }

        return -1;

    }
}
