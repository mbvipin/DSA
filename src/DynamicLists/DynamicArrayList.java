package DynamicLists;

import java.util.Arrays;
import java.util.Iterator;

public class DynamicArrayList<T>  implements  Iterable<T>{

    private T [] arr;

    private int size;

    private int capacity;

    public DynamicArrayList (int capacity)
    {
        this.arr= (T [])new Object[capacity];
        this.capacity=capacity;

    }

    public int getSize()
    {
        return this.size;
    }


    public int getCapacity()
    {
        return this.capacity;
    }

    public boolean isEmpty()
    {
        return getSize()==0;
    }

    public void add (T element)
    {
        if( size+1 > capacity)
        {
            T[] newArr= (T [])new Object[2* this.capacity];

            for( int i=0; i< this.size; i++)
            {
                newArr[i]=arr[i];
            }
            arr=newArr;
            this.capacity= 2* this.capacity;
        }
         if(size+1 <= capacity)
        {
            arr[size++]=element;
        }

    }

    @Override
    public String toString() {
        return "DynamicArrayList{" +
                "arr=" + Arrays.toString(arr) +
                '}';
    }

    public T getElementAtIndex (int index)
    {
        if(index >=this.size)
        {
            System.out.println("Invalid Index");
        }
        return arr[index];

    }

    public void addElementAtIndex (int index, T element)
    {
        if(index >=this.size)
        {
            System.out.println("Invalid Index");
            add(element);
            return;
        }

        T temp=arr[index];
        arr[index]=element;
        addElementAtIndex(index+1,temp);

    }

    public void removeElementAtIndex (int index)
    {
         if(index==this.getSize()-1)
         {
             arr[index]=null;
         }

         else
         {
             int i=index;
             arr[index]=null;


             while( i <=this.getSize()-1) {

                 arr[i] = arr[i+1];
                 i++;
             }

         }

        size--;

         // Copy elements to a new array with half the capacity
         if(size <=this.capacity/2)
         {
             this.capacity=this.capacity/2;
             T[] newArr= (T[]) new Object[this.capacity];

             for (int i=0; i< this.getSize(); i++)
             {
                 newArr[i]=this.arr[i];
             }

             this.arr=newArr;
         }

    }



    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {

            int index=0;

            @Override
            public boolean hasNext() {
                return index+1<= getSize();
            }

            @Override
            public T next() {
                return arr[index++];
            }
        };
    }
}
