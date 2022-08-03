package dynamicprogramming;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountConstructWord {

    public static void main(String[] args) {

        Map<String,Integer> cache1=new HashMap<>();
        Map<String,Integer> cache2=new HashMap<>();
        Map<String,Integer> cache3=new HashMap<>();
        Map<String,Integer> cache4=new HashMap<>();


        List<String> wordBank1= Arrays.asList("abc","abc","cd","def","abcd");
        List<String> wordBank2= Arrays.asList("bo","rd","ate","t","ska","boar");
        List<String> wordBank3= Arrays.asList("a","p","ent","enter","ot","o","t");
        List<String> wordBank4= Arrays.asList("e","ee","eee","eeee","eeeee","eeeeee");

        System.out.println( countConstruct("abcdef",wordBank1,cache1));
        System.out.println( countConstruct("skateboard",wordBank2,cache2));
        System.out.println( countConstruct("enterapotentpot",wordBank3,cache3));
        System.out.println( countConstruct("eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeef",wordBank4,cache4));
    }

    private static int countConstruct(String target, List<String> wordBank,Map<String,Integer> cache) {

        if(cache.containsKey(target))
        {
            return cache.get(target);
        }

        if(target.isEmpty())
        {
            return 1;
        }

        int totalCount=0;

        for(String word: wordBank )
        {
            if(target.startsWith(word))
            {
                totalCount+=countConstruct(target.substring(word.length()),wordBank,cache);

            }

        }

        cache.put(target,totalCount);

        return totalCount;
    }
}
