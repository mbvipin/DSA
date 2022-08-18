package dynamicprogramming.tabulation;

import java.util.Arrays;
import java.util.List;

public class CanConstruct {

    public static void main(String[] args) {

        List<String> wordBank1= Arrays.asList("ab","abc","cd","def","abcd");
        List<String> wordBank2= Arrays.asList("bo","rd","ate","t","ska","boar");
        List<String> wordBank3= Arrays.asList("a","p","ent","enter","ot","o","t");
        List<String> wordBank4= Arrays.asList("e","ee","eee","eeee","eeeee","eeeeee");

        System.out.println(canConstruct("abcdef",wordBank1));
        System.out.println( canConstruct("skateboard",wordBank2));
        System.out.println( canConstruct("enterapotentpot",wordBank3));
        System.out.println( canConstruct("eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeef",wordBank4));


    }

    private static boolean canConstruct(String target, List<String> wordBank) {

        boolean [] result=new boolean [target.length()+1];

        Arrays.fill(result,false);

        result[0]=true;

        for(int i=0; i < target.length(); i++)
        {
            if( result[i]== true)
            {
                for(String word: wordBank)
                {

                    if(i+word.length() <=target.length() && target.substring(i,i+word.length()).equals(word))
                    {
                        result[i+word.length()]=true;
                    }
                }


            }


        }


        return result[target.length()];
    }
}
