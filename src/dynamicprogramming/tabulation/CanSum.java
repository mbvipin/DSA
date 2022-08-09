package dynamicprogramming.tabulation;

import java.util.Arrays;
import java.util.List;

public class CanSum {

    public static void main(String[] args) {

        List<Integer> inputList1= Arrays.asList(5,3,4,7);
        List<Integer> inputList2= Arrays.asList(2,3);
        List<Integer> inputList3= Arrays.asList(2,4);

        System.out.println(canSum(7,inputList1));
       System.out.println(canSum(7,inputList2));
        System.out.println(canSum(7,inputList3));
    }

    private static boolean canSum(int target, List<Integer> inputList1) {

        boolean [] input=new boolean [target+1];

        Arrays.fill(input,false);
        input[0]=true;

        for(int i=0; i< input.length; i++)
        {
            for(Integer number: inputList1)
            {
                if(number+i < input.length && input[i]) {
                    input[number + i] = true;
                }
            }


        }

        return input[target];
    }
}
