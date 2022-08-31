package dynamicprogramming.tabulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllConstruct {

    public static void main(String[] args) {


        List<String> wordBank1= Arrays.asList("ab","abc","cd","def","abcd","ef","c");
        List<String> wordBank2= Arrays.asList("purp","p","ur","le","purpl");
        List<String> wordBank3= Arrays.asList("bo","rd","ate","t","ska","sk","boar");
        List<String> wordBank4= Arrays.asList("a","aa","aaa","aaaa","aaaaa");

        System.out.println(allConstruct("abcdef",wordBank1));
        System.out.println(allConstruct("purple",wordBank2));
        System.out.println(allConstruct("skateboard",wordBank3));
        System.out.println(allConstruct("aaaaaaaaaaz",wordBank4));

    }

    private static List<List<String>> allConstruct(String target, List<String> wordBank1) {

        List<List<List<String>>> result=new ArrayList<>(target.length()+1);

        for(int i=0; i<=target.length(); i++)
        {
            result.add(null);
        }

        List<List<String>> listForEmptyString=new ArrayList<>();

        listForEmptyString.add(new ArrayList<>());

        result.set(0,listForEmptyString);

        for(int i=0; i< result.size(); i++)
        {

            List<List<String>> listAtIndex= result.get(i);

            if(listAtIndex!=null)
            {
              for(String word: wordBank1)
              {
                  if(i+word.length() <= target.length() && target.substring(i,i+word.length()).equals(word))
                  {
                      List<List<String>> listAtTargetIndex=result.get(i+word.length());

                     List<List<String>> listAtCurrentIndex=result.get(i);

                     List<List<String>> newListAtTargetIndex=new ArrayList<>();

                     for( List list: listAtCurrentIndex)
                     {
                         newListAtTargetIndex.add(new ArrayList<>(list));
                     }


                      newListAtTargetIndex.stream().forEach(element-> element.add(word));

                     if(listAtTargetIndex==null)
                     {
                         listAtTargetIndex=newListAtTargetIndex;

                     }
                     else
                     {
                         listAtTargetIndex.addAll(newListAtTargetIndex);
                     }

                    result.set(i+word.length(),listAtTargetIndex);



                  }

              }


            }


        }

        return result.get(target.length());

    }
}
