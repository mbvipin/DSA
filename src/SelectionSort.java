import java.util.Arrays;

public class SelectionSort {


    public static void main(String[] args) {

        int [] inputArr=new int [] {2,5,4,7,7,7};


        System.out.println("Before Sorting "+Arrays.toString(inputArr));

        doSelectionSort(inputArr);

        System.out.println("After Sorting "+Arrays.toString(inputArr));

        findDuplicates(inputArr);


    }

    public static void findDuplicates (int [] arr)
    {

        for (int i=0; i< arr.length-1; i++)
        {

            isDuplicate(arr,i,i+1);

        }

    }

    public static boolean isDuplicate(int [] arr, int a ,int b)
    {
        if( arr[a]== arr[b])
        {
            System.out.println("Duplicates found at indices "+a+" and"+ b);

            return true;
        }

        return false;
    }


    public int findMode(int [] arr)
    {

        return arr[arr.length-1]-arr[0];
    }

    public int findKthLargestElement(int [] arr,int k)
    {

        return arr[arr.length-k];

    }



    public static void doSelectionSort(int [] arr)
    {
        for(int i=0; i< arr.length ; i++)
        {
            int minElement= arr[i];
            int minIndex=i;

            for (int j=i+1; j< arr.length; j++)
            {
                if(arr[j]< minElement)
                {
                    minElement=arr[j];
                    minIndex=j;
                }


            }

            swap(arr,i,minIndex);

        }

    }

    public static void swap(int [] arr, int from, int to)
    {
        int temp= arr[from];
        arr[from]=arr[to];
        arr[to]=temp;

    }
}
