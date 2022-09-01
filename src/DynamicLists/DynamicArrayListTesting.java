package DynamicLists;

import java.util.ArrayList;
import java.util.Iterator;

public class DynamicArrayListTesting {

    public static void main(String[] args) {

        DynamicArrayList<Integer> newList=new DynamicArrayList<>(10);

        ArrayList list=new ArrayList();

        newList.add(1);
        newList.add(2);
        newList.add(3);
        newList.add(4);
        newList.add(5);
        newList.add(6);
        newList.add(7);
        newList.add(8);
        newList.add(9);
        newList.add(10);
        System.out.println("Initial Capacity");
        System.out.println(newList.getCapacity());
        newList.add(11);
        System.out.println("Exceeding Initial Capacity and doubling");
        System.out.println(newList.getCapacity());
        System.out.println("Printing the list after expanding the initial list dynamically");
        System.out.println(newList);

        System.out.println("Adding element at index 0 and shifting all other elements");
        newList.addElementAtIndex(0,12);
        System.out.println(newList);

        System.out.println("Removing Last Element");
        newList.removeElementAtIndex(newList.getSize()-1);
        System.out.println(newList);

        System.out.println("Size Before removing the 11th Element "+newList.getSize());
        System.out.println("Capacity Before removing the 11th Element "+newList.getCapacity());

        System.out.println("Removing first Element and shifting all elements leftwards.");
        newList.removeElementAtIndex(0);
        System.out.println(newList);

        System.out.println("Size After removing the 11th Element "+newList.getSize());
        System.out.println("Capacity After removing the 11th Element "+newList.getCapacity());

        System.out.println("Using Iterator");

        Iterator<Integer> iterator = newList.iterator();

        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }


    }
}
