package sort;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {

        int [] inputArr=new int [] {7,6,5,4,3,2,1};


        System.out.println("Before Sorting "+ Arrays.toString(inputArr));

        doInsertionSort(inputArr);

        System.out.println("After Sorting "+Arrays.toString(inputArr));


    }

    private static void doInsertionSort(int [] arr)
    {
        for(int i=0; i< arr.length-1; i++)
        {
            int newElement=arr[i+1];
            int newElementIndex=i+1;
            int j=i;

                while(j >=0 && arr[j] > newElement )
                {
                    swap(arr,j,newElementIndex);
                    newElementIndex=j;
                    j--;


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
