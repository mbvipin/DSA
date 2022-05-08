package sort;

import java.util.Arrays;

public class HeapSort {

    public static void main(String[] args) {


        int [] inputArr=new int [] {2,5,4,9,8,7};

        System.out.println("Before Sorting "+ Arrays.toString(inputArr));

        buildHeap(inputArr,0,inputArr.length-1);

        doHeapSort(inputArr,0, inputArr.length-1);

        System.out.println("After Sorting "+Arrays.toString(inputArr));
    }

    private static void doHeapSort(int[] inputArr, int start, int end) {

        if( start >=end)
        {
            return;
        }

        swap(inputArr,start,end--);

        siftDown(inputArr,0, end,(end-1)/2);

        doHeapSort(inputArr,start,end);


    }

    private static void buildHeap(int[] inputArr,int start,int end) {

        int lastParent=(end-1)/2;

        for(int i=lastParent; i>=0; i--)
        {
            siftDown(inputArr, i,end,lastParent);
        }


    }

    private static void siftDown(int[] inputArr, int i,int end,int lastParent) {

        if( i > lastParent)
        {
            return;
        }


        int leftChildIndex= 2* i+1;
        int rightChildIndex=2* i +2;

        if((leftChildIndex< end &&inputArr[i] < inputArr[leftChildIndex]) || (rightChildIndex< end && inputArr[i] < inputArr[rightChildIndex]))
        {
            if(rightChildIndex >=inputArr.length || inputArr[leftChildIndex] > inputArr[rightChildIndex] )
            {
                swap(inputArr,leftChildIndex, i);
                siftDown(inputArr,leftChildIndex,end,lastParent);
            }

            else
            {
                swap(inputArr,rightChildIndex, i);
                siftDown(inputArr,rightChildIndex,end,lastParent);
            }
        }
    }



    public static void swap(int [] arr, int from, int to)
    {
        int temp= arr[from];
        arr[from]=arr[to];
        arr[to]=temp;

    }
}

