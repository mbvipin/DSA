package dynamicprogramming.tabulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BestSum {

    public static void main(String[] args) {

        List<Integer> inputList1= Arrays.asList(5,3,4,8);
        List<Integer> inputList2= Arrays.asList(2,3,5);
        List<Integer> inputList3= Arrays.asList(1,4,5);
        List<Integer> inputList4= Arrays.asList(1,2,5,25);

        System.out.println(bestSum(7,inputList1));
        System.out.println(bestSum(8,inputList2));
        System.out.println(bestSum(8,inputList3));
        System.out.println(bestSum(100,inputList4));


    }

    private static List<Integer> bestSum(int target, List<Integer> inputList1) {

        List<List<Integer>> result=new ArrayList<>(target+1);

        for( int i=0; i<=target; i++)
        {
            result.add(null);
        }

        result.set(0,new ArrayList<>());

        for (int i=0; i< result.size(); i++)
        {

            if(result.get(i)!=null)
            {
              for (Integer number: inputList1)
              {
                  if(number +i <=target)
                  {
                      List<Integer>  onTheWayList=result.get(i);

                      List<Integer> newList= new ArrayList<>(onTheWayList);
                      newList.add(number);

                      List<Integer> existingList= result.get(i+number);

                      if(existingList==null || existingList.size() > newList.size())
                      {
                          result.set(i+number,newList);
                      }

                  }

              }
            }


        }


        return result.get(target);
    }
}
