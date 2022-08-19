package dynamicprogramming.tabulation;

import java.util.Arrays;
import java.util.List;

public class CountConstruct {

    public static void main(String[] args) {

        List<String> wordBank1= Arrays.asList("purp","p","ur","le","purpl");
        List<String> wordBank2= Arrays.asList("ab","abc","cd","def","abcd");
        List<String> wordBank3= Arrays.asList("bo","rd","ate","t","ska","boar");
        List<String> wordBank4= Arrays.asList("a","p","ent","enter","ot","o","t");
        List<String> wordBank5= Arrays.asList("e","ee","eee","eeee","eeeee","eeeeee");


        System.out.println(countConstruct("purple",wordBank1));
        System.out.println(countConstruct("abcdef",wordBank2));
        System.out.println( countConstruct("skateboard",wordBank3));
        System.out.println( countConstruct("enterapotentpot",wordBank4));
        System.out.println( countConstruct("eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeef",wordBank5));

    }

    private static int countConstruct(String target, List<String> wordBank) {

        int [] result=new int [target.length()+1];

        Arrays.fill(result,0);
        result[0]=1;

        for(int i=0; i<=target.length(); i++)
        {
            for(String word: wordBank)
            {
                if(i+word.length() <=target.length() && target.substring(i,i+word.length()).equals(word))
                {
                    result[i+word.length()]+=result[i];
                }


            }

        }


        return result[target.length()];
    }
}
