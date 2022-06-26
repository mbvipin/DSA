package linkedlist;

public class FindInLinkedList {

    public static void main(String[] args) {

        LinkedList linkedListWithElements=new LinkedList();

        linkedListWithElements.addAtIndex(0,1);
        linkedListWithElements.addAtIndex(1,2);
        linkedListWithElements.addAtIndex(2,3);
        linkedListWithElements.addAtIndex(3,4);

        System.out.println(doesTargetExist(linkedListWithElements.getHead(),4));
        System.out.println(doesTargetExist(linkedListWithElements.getHead(),5));

        System.out.println(doesTargetExistRecursively(linkedListWithElements.getHead(),4));
        System.out.println(doesTargetExistRecursively(linkedListWithElements.getHead(),5));
    }

    private static boolean doesTargetExist(Node head, int target) {

        Node current=head;

        while(current!=null)
        {
            if(current.getData()==target)
            {
                return true;
            }

            current=current.next;
        }

        return false;

    }

    private static boolean doesTargetExistRecursively(Node head, int target) {

        if(head==null)
        {
            return false;
        }

        if(head.getData()== target)
        {
            return true;
        }
        return doesTargetExistRecursively(head.next,target);



    }
}
