package dynamicprogramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllConstructWord {

    public static void main(String[] args) {

        List<String> wordBank1= Arrays.asList("ab","abc","cd","def","abcd","ef","c");
        List<String> wordBank2= Arrays.asList("purp","p","ur","le","purpl");
        List<String> wordBank3= Arrays.asList("bo","rd","ate","t","ska","sk","boar");

        //System.out.println(allConstruct("abcdef",wordBank1));
        //System.out.println(allConstruct("purple",wordBank2));
        System.out.println(allConstruct("skateboard",wordBank3));


    }

    private static List<List<String>> allConstruct(String target, List<String> wordBank) {

        if( target.isEmpty())
        {
            return new ArrayList<>();
        }
        List<List<String>> result=null;

        for(String word: wordBank)
        {
            if(target.startsWith(word))
            {
                List<List<String>> allWaysUsingChild= allConstruct(target.substring(word.length()),wordBank);

                if(allWaysUsingChild!=null)
                {
                    if(allWaysUsingChild.isEmpty())
                    {
                        List<String> childPath=new ArrayList<>();
                        childPath.add(word);
                        allWaysUsingChild.add(childPath);
                    }

                    else
                    {
                        allWaysUsingChild.stream().forEach(e-> e.add(word));
                    }

                    if(result==null) {
                        result=new ArrayList<>();
                        result.addAll(allWaysUsingChild);
                    }

                    else
                    {
                        result.addAll(allWaysUsingChild);
                    }
                }





            }


        }

        return result;
    }
}
