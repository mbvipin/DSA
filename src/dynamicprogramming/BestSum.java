package dynamicprogramming;

import java.util.*;
import java.util.stream.Collectors;

public class BestSum {

    public static void main(String[] args) {

        Map<Integer,List<Integer>> cache1=new HashMap<>();
        Map<Integer,List<Integer>> cache2=new HashMap<>();
        Map<Integer,List<Integer>> cache3=new HashMap<>();
        Map<Integer,List<Integer>> cache4=new HashMap<>();
        Map<Integer,List<Integer>> cache5=new HashMap<>();

        List<Integer> inputList1= Arrays.asList(3,5,2);

        List<Integer> inputList2= Arrays.asList(2,3,5);

        List<Integer> inputList3= Arrays.asList(7,14);

        List<Integer> inputList4= Arrays.asList(1,4,5);

        List<Integer> inputList5= Arrays.asList(5,3,4,7);

        System.out.println(bestSum(8,inputList1,cache1));
        System.out.println(bestSum(8,inputList2,cache2));
        System.out.println(bestSum(300,inputList3,cache3));
        System.out.println(bestSum(8,inputList4,cache4));
        System.out.println(bestSum(7,inputList5,cache5));

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
        List<Integer> resultInPath=null;

        for(int number: inputList)
        {

            int targetInPath=target-number;
            resultInPath= bestSum(targetInPath,inputList,cache);

            if(resultInPath!=null && (bestSum==null || bestSum.size() > resultInPath.size()+1))
                {
                    resultInPath.add(number);
                    bestSum=resultInPath;
                }

            }

        cache.putIfAbsent(target,bestSum);
        return bestSum!=null? new ArrayList<>(bestSum):null;

    }
}
