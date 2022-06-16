package graphs;

import graphs.model.TwoDArray;
import graphs.utils.GraphUtils;

public class MinimumIslandCount {

    public static void main(String[] args) {

        TwoDArray<String> input=new TwoDArray<>();

        String [] [] inputArray=input.addListToArray(String.class,  GraphUtils.createGrid());

        int minCount=Integer.MAX_VALUE;

        int rowCount= inputArray.length;
        int colCount=inputArray[0].length;

        int [][] visited=input.getArrayFilledWithZeros(rowCount,colCount);

        for (int i = 0; i < inputArray.length; i++) {

            for (int j = 0; j < inputArray[i].length; j++) {

                int count=getCountinIsland(inputArray,i,j,visited);

                if(count >0 && count < minCount)
                {
                    minCount=count;
                }


            }



        }

        System.out.println(minCount);



    }

    private static int getCountinIsland(String[][] inputArray, int row, int col, int[][] visited) {

        int count=0;

        if( row <0 || row >=inputArray.length || col <0 || col >=inputArray[row].length)
        {
            return count;
        }

        if(inputArray[row][col]== "W")
        {
            return count;
        }
        if(visited[row][col]== 1)
        {
            return count;
        }
        visited[row][col]=1;
        count++;

        count+=getCountinIsland(inputArray,row+1,col,visited);
        count+=getCountinIsland(inputArray,row-1,col,visited);
        count+=getCountinIsland(inputArray,row,col+1,visited);
        count+=getCountinIsland(inputArray,row,col-1,visited);

        return count;
    }
}
