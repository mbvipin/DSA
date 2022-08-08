package dynamicprogramming.tabulation;

import java.util.Arrays;

public class GridTraveller {

    public static void main(String[] args) {

        System.out.println(findNumberOfways(4,4));
    }

    private static int findNumberOfways(int m, int n) {



        int [] [] grid=new int [m][n];

        for (int [] arr: grid)
        {
            Arrays.fill(arr,0);
        }

        grid [1][1]=1;

        for (int i=0; i< m; i++)
        {
            for (int j=0; j<n; j++)
            {
                if( i+1 <m) {
                    grid[i+1][j] = grid[i+1][j]+grid[i][j];
                }

                if(j+1 <n)
                {
                    grid[i][j+1]=grid[i][j]+grid[i][j+1];
                }

            }
        }



        return grid[m-1][n-1];
    }
}
