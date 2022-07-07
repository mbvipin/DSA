package dynamicprogramming;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TargetSum {

    public static void main(String[] args) {

        List<Integer> inputList=Arrays.asList(2,4);

        Map<Integer,Boolean> cache=new HashMap<>();

        System.out.println(doesTargetSumExist(7,inputList,cache));
        System.out.println(doesTargetSumExist(18,inputList,cache));

    }

    private static boolean doesTargetSumExist(int targetSum, List<Integer> inputList,Map<Integer,Boolean> cache) {

        if(cache.containsKey(targetSum))
        {
            return cache.get(targetSum);
        }

        if(targetSum==0) return true;

        if(targetSum <0) return false;

        for(Integer input: inputList)
        {
            int newTargetSum=targetSum-input;

            boolean result=doesTargetSumExist(newTargetSum,inputList,cache);

            cache.put(newTargetSum,result);

            if(result)
            {
                return true;
            }

        }

        cache.put(targetSum,false);

        return false;

    }
}
