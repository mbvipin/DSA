import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {

        int [] inputArr=new int [] {2,5,4,9,8,7};



        System.out.println("Before Sorting "+ Arrays.toString(inputArr));

        doBubbleSort(inputArr);

        System.out.println("After Sorting "+Arrays.toString(inputArr));

    }

    public static void doBubbleSort(int [] arr)
    {
        for(int i= 0; i< arr.length; i++)
        {

            for (int j=arr.length-1; j > i; j--)
            {
                if(arr[j-1] > arr[j])
                {
                    swap(arr,j-1,j);
                }

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
