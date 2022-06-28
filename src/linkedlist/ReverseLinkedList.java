package linkedlist;

public class ReverseLinkedList {

    public static void main(String[] args) {

        LinkedList linkedListWithElements=new LinkedList();



        linkedListWithElements.add(9);
        linkedListWithElements.add(8);
        linkedListWithElements.add(7);
        linkedListWithElements.add(6);

        System.out.println("Before Reversing");
        TraverseLinkedList.traverse(linkedListWithElements.getHead());

        System.out.println("After Reversing");

        Node newHead=reverseLinkedList(linkedListWithElements.getHead());
        TraverseLinkedList.traverse(newHead);

        System.out.println(" Reversing again...");

        Node newHeadUsingRecursion=reverseLinkedListRecursively(newHead,null);
        TraverseLinkedList.traverse(newHeadUsingRecursion);

    }

    private static Node reverseLinkedListRecursively(Node head,Node prev) {

        if(head==null)
        {
            return prev;
        }

        Node nextNow=head.next;
        head.setNext(prev);

       return reverseLinkedListRecursively(nextNow,head);


    }

    private static Node reverseLinkedList(Node head) {

        Node prev=null;
        Node current=head;
        Node headOfResult=head;


        while(current!=null)
        {
            Node nextNow=current.next;
            current.next=prev;
            headOfResult=current;

            prev=current;
            current=nextNow;
        }

        return headOfResult;

    }
}
