package linkedlist;

import java.util.ArrayList;
import java.util.List;

public class ReturnValuesAsList {

    public static void main(String[] args) {

        LinkedList linkedListWithElements=new LinkedList();

        linkedListWithElements.addAtIndex(0,1);
        linkedListWithElements.addAtIndex(1,2);
        linkedListWithElements.addAtIndex(2,3);
        linkedListWithElements.addAtIndex(3,4);

        returnAsList(linkedListWithElements).stream().forEach(e-> System.out.println(e));

        List<Integer> result=new ArrayList<>();

        returnAsListRecursive(linkedListWithElements.getHead(),result);

        result.stream().forEach(e-> System.out.println(e));


    }

    private static List<Integer> returnAsList(LinkedList linkedListWithElements) {

        List<Integer> result=new ArrayList<>(linkedListWithElements.size());

        Node current=linkedListWithElements.getHead();

        while(current!=null)
        {
            result.add(current.getData());

            current=current.next;
        }



        return result;


    }

    private static void returnAsListRecursive(Node head,List<Integer> result) {

        if(head==null)
        {
            return;
        }

        result.add(head.getData());

        returnAsListRecursive(head.getNext(),result);


    }
}
