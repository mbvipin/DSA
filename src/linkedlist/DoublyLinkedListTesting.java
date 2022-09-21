package linkedlist;

import java.util.Iterator;

public class DoublyLinkedListTesting {

    public static void main(String[] args) {

        DoublyLinkedList newList=new DoublyLinkedList();

        newList.add(13);
        newList.add(7);
        newList.add(23);
        newList.add(5);


        System.out.println(newList.toString());

        newList.addAtIndex(2,11);
        newList.printIndexAndData();


        newList.remove(11);
        System.out.println(newList.toString());

        newList.addLast(10);
        System.out.println(newList.toString());

        newList.addFirst(100);
        System.out.println(newList.toString());





        System.out.println( newList.removeFirst());
        System.out.println(newList.removeLast());

        DoublyLinkedList newListWithOneElement=new DoublyLinkedList();
        newListWithOneElement.add(1);
        System.out.println(newListWithOneElement.removeFirst());

        newListWithOneElement.add(5);
        System.out.println(newListWithOneElement.removeLast());

        System.out.println("Before Removing at Index"+newList.toString());
        System.out.println(newList.removeAtIndex(0));
        System.out.println("After Removing at Index"+newList.toString());

        // Adding Back
        newList.addFirst(13);



        System.out.println("Before Removing element at Index 1");
        newList.printIndexAndData();
        System.out.println(newList.removeAtIndex(1));
        System.out.println("After Removing at Index 1");
        newList.printIndexAndData();

        newList.addAtIndex(1,7);

        System.out.println("Before Removing element at Index 3");
        newList.printIndexAndData();
        System.out.println(newList.removeAtIndex(3));
        System.out.println("After Removing at Index 3");
        newList.printIndexAndData();

        newList.addLast(5);

        System.out.println("After Removing at Index 0");
        newList.printIndexAndData();
        System.out.println(newList.removeAtIndex(0));
        System.out.println("After Removing at Index 0");
        newList.printIndexAndData();

        newList.addFirst(13);

        System.out.println(newList.indexOf(13));
        System.out.println(newList.indexOf(50));

        System.out.println(newList.contains(7));
        System.out.println(newList. contains(150));

        Iterator iterator = newList.iterator();

        while(iterator.hasNext())
        {
            int data= (int) iterator.next();
            System.out.println(data);

        }


    }
}
