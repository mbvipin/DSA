package linkedlist;

public class SumList {

    public static void main(String[] args) {

        LinkedList linkedListWithElements=new LinkedList();

        linkedListWithElements.addAtIndex(0,1);
        linkedListWithElements.addAtIndex(1,2);
        linkedListWithElements.addAtIndex(2,3);
        linkedListWithElements.addAtIndex(3,4);

        System.out.println(calculateSum(linkedListWithElements.getHead()));

        System.out.println(calculateSumRecursively(linkedListWithElements.getHead()));
    }

    private static int calculateSum(Node head) {

        Node current=head;

        int sum=0;

        while(current!=null)
        {
            sum+=current.getData();

        current=current.next;

        }

        return sum;
    }

    private static int calculateSumRecursively(Node head) {
        int sum=0;

        if(head==null)
        {
            return 0;
        }

        sum+=head.getData();

        sum+= calculateSumRecursively(head.next);

        return sum;
    }
}
