package linkedlist;

public class DoublyLinkedListTesting {

    public static void main(String[] args) {

        DoublyLinkedList newList=new DoublyLinkedList();

        newList.add(13);
        newList.add(7);
        newList.add(23);
        newList.add(5);

        System.out.println(newList.toString());

        newList.addAtIndex(2,11);
        System.out.println(newList.toString());

        newList.remove(11);
        System.out.println(newList.toString());

    }
}
