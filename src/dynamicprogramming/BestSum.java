package dynamicprogramming;

import java.util.*;

public class BestSum {

    public static void main(String[] args) {

        Map<Integer,List<Integer>> cache=new HashMap<>();

        List<Integer> inputList1= Arrays.asList(3,5,2);

        List<Integer> inputList2= Arrays.asList(2,3,5);

        List<Integer> inputList3= Arrays.asList(7,14);

        //System.out.println(bestSum(8,inputList1,cache));
        //System.out.println(bestSum(8,inputList2,cache));
        System.out.println(bestSum(300,inputList3,cache));

    }

    private static List<Integer> bestSum(int target, List<Integer> inputList, Map<Integer,List<Integer>> cache) {

        if(target==0)
        {
            return new ArrayList<>();
        }

        if(target <0)
        {
            return null;
        }

        if(cache.containsKey(target))
        {
            return cache.get(target);
        }

        List<Integer> bestSum=null;

        for(int number: inputList)
        {

            int targetInPath=target-number;

            List<Integer> resultInPath= bestSum(targetInPath,inputList,cache);

            if(resultInPath!=null && (bestSum==null || bestSum.size() > resultInPath.size()+1))
                {
                    resultInPath.add(number);
                    bestSum=resultInPath;
                }

            }

        cache.put(target,bestSum);
        return bestSum;

    }
}
