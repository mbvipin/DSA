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

       Node newHead= zipLists(list1.getHead(),list2.getHead());

       TraverseLinkedList.traverse(newHead);



    }

    private static Node zipLists(Node head1, Node head2) {


        Node current1=head1.getNext();
        Node current2=head2;

        Node currentResult=head1;

        int count=0;

        while(current1!=null && current2!=null) {

            if (count % 2 == 0) {

                currentResult.setNext(current2);
                currentResult=current2;
                current2=current2.getNext();
                count++;

            } else {

                currentResult.setNext(current1);
                currentResult=current1;
                current1=current1.getNext();
                count++;

            }

        }

        if(current1!=null)
        {
            currentResult.setNext(current1);
        }

        if(current2!=null)
        {
            currentResult.setNext(current2);
        }


        return head1;


    }
}
