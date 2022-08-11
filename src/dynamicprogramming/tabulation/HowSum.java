package dynamicprogramming.tabulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HowSum {

    public static void main(String[] args) {

        List<Integer> inputList1= Arrays.asList(5,3,4,7);
        List<Integer> inputList2= Arrays.asList(2,3);
        List<Integer> inputList3= Arrays.asList(2,4);
        List<Integer> inputList4= Arrays.asList(2,3,5);
        List<Integer> inputList5= Arrays.asList(7,14);

        System.out.println(howSum(7,inputList1));
        System.out.println(howSum(7,inputList2));
        System.out.println(howSum(7,inputList3));
        System.out.println(howSum(8,inputList4));
        System.out.println(howSum(300,inputList5));


    }

    private static List<Integer> howSum(int target, List<Integer> inputList1) {

        List<List<Integer>> result=new ArrayList<>();

        for(int i=0; i< target+1 ; i++)
        {
            result.add(null);
        }

        result.set(0,new ArrayList<>());


        for (int i=0; i< result.size(); i++)
        {
            List<Integer> currentList=result.get(i);
            if(currentList!=null)
            {
                for(Integer num: inputList1)
                {
                    if(num+i <=target)
                    {
                        List<Integer> newListAtIndex=new ArrayList<>(currentList);
                        newListAtIndex.add(num);
                        result.set(num+i,newListAtIndex);
                    }
                }
            }

        }



        return result.get(target);
    }
}
