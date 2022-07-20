package dynamicprogramming;

import java.util.*;

public class HowSum {

    public static void main(String[] args) {

        List<Integer> inputList1= Arrays.asList(7,14);
        List<Integer> inputList2= Arrays.asList(5,2,3,4,7);
        List<Integer> inputList3= Arrays.asList(3,5,2);

        Map<Integer,List<Integer>> cache=new HashMap<>();

        System.out.println(howSum(300,inputList1,cache));
        System.out.println(howSum(7,inputList2,cache));
        System.out.println(howSum(8,inputList3,cache));




    }

    private static List<Integer> howSum(int target, List<Integer> inputList,Map<Integer,List<Integer>> cache) {

        if(target==0)
        {
            return new ArrayList<>();
        }

        if(target <0)
        {
            cache.put(target,null);
            return null;
        }

        for(int number: inputList)
        {
            int targetInPath=target-number;



            if(cache.containsKey(targetInPath))
            {
                return cache.get(targetInPath);
            }

           List<Integer> resultInPath=howSum(targetInPath,inputList,cache);

           if(resultInPath!=null )
           {
               resultInPath.add(number);
               cache.put(targetInPath,resultInPath);
               return resultInPath;
           }


        }

        cache.put(target,null);


       return null;

    }
}
