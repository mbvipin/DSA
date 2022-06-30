package linkedlist;

public class ZipperLists {

    public static void main(String[] args) {

        LinkedList list1=new LinkedList();

        list1.add(9);
        list1.add(8);
        list1.add(7);
        list1.add(6);


        LinkedList list2=new LinkedList();

        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);

       //Node newHead= zipLists(list1.getHead(),list2.getHead());

       //TraverseLinkedList.traverse(newHead);

        Node newHeadUsingRecursion= zipListsRecursive(list1.getHead(),list2.getHead());

        TraverseLinkedList.traverse(newHeadUsingRecursion);



    }

    private static Node zipListsRecursive(Node head1, Node head2) {

        if(head1==null && head2==null)
        {
            return null;
        }

        if(head1==null)
        {
            return head2;
        }

        if(head2==null)
        {
            return head1;
        }

        Node next1= head1.next;
        Node next2=head2.next;

        head1.next=head2;
        head2.next=zipListsRecursive(next1,next2);

        return head1;

    }

    private static Node zipLists(Node head1, Node head2) {


        Node current1=head1.getNext();
        Node current2=head2;

        Node currentTail=head1;

        int count=0;

        while(current1!=null && current2!=null) {

            if (count % 2 == 0) {

                currentTail.setNext(current2);

                current2=current2.getNext();
                count++;

            } else {

                currentTail.setNext(current1);

                current1=current1.getNext();
                count++;

            }

            currentTail=currentTail.getNext();

        }

        if(current1!=null)
        {
            currentTail.setNext(current1);
        }

        if(current2!=null)
        {
            currentTail.setNext(current2);
        }


        return head1;


    }
}
