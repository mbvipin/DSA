import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {

        int [] inputArr=new int [] {2,5,4,9,8,7};



        System.out.println("Before Sorting "+ Arrays.toString(inputArr));

        doMergeSort(inputArr);

        System.out.println("After Sorting "+Arrays.toString(inputArr));

    }

    private static void doMergeSort(int [] arr)
    {

        doMergeSort(arr,0,arr.length-1);

    }







    private static void doMergeSort( int [] arr, int start, int end)
    {
        if(start== end)
        {
            return ;
        }

        int mid= (end+start)/2;

        doMergeSort(arr,start,mid);

        doMergeSort(arr,mid+1,end);

         combine(arr,start,mid,end);


    }

    private static void combine(int[] arr, int start,int mid,int end) {

        int i=start;
        int j=mid+1;
        int k=start;

        int [] auxArray=new int [arr.length];

        while (i <=mid && j<=end)
        {

            if(arr[i] <= arr[j])
            {
                auxArray[k++]=arr[i++];

            }

            else
            {
                auxArray[k++]=arr[j++];

            }

        }

        while(i<=mid)
        {
            auxArray[k++]=arr[i++];
        }

        while(j<=end)
        {
            auxArray[k++]=arr[j++];
        }

        for (int m=start; m<=end ;m++)
        {
            arr[m]=auxArray[m];
        }



    }
}
