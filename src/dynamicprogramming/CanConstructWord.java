package dynamicprogramming;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CanConstructWord {

    public static void main(String[] args) {

        Map<String,Boolean> cache1=new HashMap<>();
        Map<String,Boolean> cache2=new HashMap<>();
        Map<String,Boolean> cache3=new HashMap<>();
        Map<String,Boolean> cache4=new HashMap<>();

        List<String> wordBank1= Arrays.asList("abc","abc","cd","def","abcd");
        List<String> wordBank2= Arrays.asList("bo","rd","ate","t","ska","boar");
        List<String> wordBank3= Arrays.asList("a","p","ent","enter","ot","o","t");
        List<String> wordBank4= Arrays.asList("e","ee","eee","eeee","eeeee","eeeeee");

        System.out.println( canConstruct("abcdef",wordBank1,cache1));
        System.out.println( canConstruct("skateboard",wordBank2,cache2));
        System.out.println( canConstruct("enterapotentpot",wordBank3,cache3));
        System.out.println( canConstruct("eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeef",wordBank4,cache4));

    }

    private static boolean canConstruct(String target, List<String> wordBank,Map<String,Boolean> cache) {

        if(cache.containsKey(target))
        {
            return cache.get(target);
        }
      if(target.isEmpty())
      {
          return true;
      }

      for(String word: wordBank)
      {
          if(target.startsWith(word))
          {
              if(canConstruct(target.substring(word.length()),wordBank,cache))
              {
                  cache.put(target,true);
                  return true;
              }
          }

      }


      cache.put(target,false);

        return false;
    }
}
