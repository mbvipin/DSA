package dynamicprogramming;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class GridProblem {

    public static void main(String[] args) {

        Map<String, BigInteger> countCache=new HashMap<>();

        System.out.println(getCountOfPossibleWays(0,0,countCache));
        System.out.println(getCountOfPossibleWays(1,1,countCache));
        System.out.println(getCountOfPossibleWays(2,2,countCache));
        System.out.println(getCountOfPossibleWays(2,3,countCache));
        System.out.println(getCountOfPossibleWays(3,2,countCache));
        System.out.println(getCountOfPossibleWays(18,18,countCache));


    }

    private static BigInteger getCountOfPossibleWays(Integer row, Integer col, Map<String, BigInteger> countCache) {

        String key=generateKey(row, col);

        if(countCache.containsKey(key)){
            return countCache.get(key);
        }


        if( row==0 || col ==0) return BigInteger.valueOf(0);

        if(row==1 && col ==1) return BigInteger.valueOf(1);

        BigInteger countDown=getCountOfPossibleWays(row-1,col,countCache);

        BigInteger countRight=getCountOfPossibleWays(row,col-1,countCache);

        BigInteger totalCount=countDown.add(countRight);

        countCache.put(key,totalCount);

        return totalCount;

    }

    private static String generateKey(Integer row, Integer col) {
        StringBuilder cacheKey=new StringBuilder();

        cacheKey.append(row.toString());
        cacheKey.append(",");
        cacheKey.append(col.toString());

        return cacheKey.toString();



    }
}
