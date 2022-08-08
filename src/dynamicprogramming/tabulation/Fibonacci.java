package dynamicprogramming.tabulation;

import java.math.BigInteger;
import java.util.Arrays;

public class Fibonacci {

    public static void main(String[] args) {

        //System.out.println(findFib(1));
        System.out.println(findFib(2));
      System.out.println(findFib(3));
        System.out.println(findFib(4));
        System.out.println(findFib(5));
        System.out.println(findFib(6));
        System.out.println(findFib(7));
        System.out.println(findFib(8));
        System.out.println(findFib(50));
    }

    private static long findFib(int n) {

        long [] fib=new long [n+2];
        Arrays.fill(fib,0);
        fib[1]=1;

        for( int i=0; i<=n-1; i++)
        {

            fib[i+1]+=fib[i];
            fib[i+2]+=fib[i];


        }

      return fib[n];
    }
}
