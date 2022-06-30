package dynamicprogramming;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class Fibonacci {

    public static void main(String[] args) {

     Map<Integer, BigInteger> cache=new HashMap<>();

     cache.put(1,BigInteger.valueOf(0));
     cache.put(2,BigInteger.valueOf(1));

        System.out.println(fib(10,cache));
        System.out.println(fib(50,cache));
        System.out.println(fib(100,cache));


    }

    private static BigInteger fib(int input, Map<Integer,BigInteger> cache) {

        BigInteger result=cache.get(input);

        if(result!=null)
        {
            return result;
        }

        result=fib(input-1,cache).add(fib(input-2,cache));

        cache.put(input,result);

        return result;


    }
}
