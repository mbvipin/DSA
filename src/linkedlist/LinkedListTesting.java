package linkedlist;

import linkedlist.LinkedList;

public class LinkedListTesting {

    public static void main(String[] args) {

        LinkedList linkedListWithElements=new LinkedList();



        linkedListWithElements.add(9);
        linkedListWithElements.add(8);
        linkedListWithElements.add(7);
        linkedListWithElements.add(6);

        printResults(linkedListWithElements);
        //printResults(linkedListWithoutElements);

        linkedListWithElements.addAtIndex(2,83);
        printResults(linkedListWithElements);

        linkedListWithElements.deleteAtIndex(2);
        printResults(linkedListWithElements);






    }

    private static void printResults (LinkedList linkedList) {
        System.out.println(" is linkedlist.LinkedList Empty?  "+ linkedList.isEmpty());
        System.out.println(" Size is equal to  "+ linkedList.size());
        System.out.println(" linkedlist.LinkedList  elements in order "+ linkedList.toString());
    }
}
